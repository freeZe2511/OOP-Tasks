package Task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Smiley {

    private String colorFG;
    private String colorBG;
    private String emotion;

    public Smiley(String colorFG, String colorBG, String emotion){
        this.colorFG = colorFG;
        this.colorBG = colorBG;
        this.emotion = emotion;
    }

    public void generateSmiley(){

        switch (this.emotion){
            case ("happy"): String happyS = String.format("<svg version=\"1.1\" baseProfile=\"full\" xmlns:ev=\"http://www.w3.org/2001/xml-events\"" +
                    "\n xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns=\"http://www.w3.org/2000/svg\"\n preserveAspectRatio=\"xMidYMid meet\" zoomAndPan=\"magnify\"" +
                    "\nid=\"MySmiley\" viewBox=\"-21 -21 42 42\" width=\"800\" height=\"800\">" +
                    "\n<circle r=\"20\" stroke=\"black\" stroke-width=\"1\" fill=\"black\"/>" +
                    "\n<circle r=\"20\" fill=\"%s\"/>" +
                    "\n\t<ellipse rx=\"2.5\" ry=\"4\" cx=\"6\" cy=\"-7\" fill=\"%s\"/>" +
                    "\n\t<ellipse rx=\"2.5\" ry=\"4\" cx=\"-6\" cy=\"-7\" fill=\"%s\"/>" +
                    "\n<path fill=\"none\" stroke=\"black\" stroke-width=\".75\" " +
                    "d=\"M -12,5 A 13.5,13.5,0 0,012,5 A 13,13,0 0,1 -12,5\"/>\n</svg>", this.colorBG, this.colorFG, this.colorFG);

                try(PrintWriter pw = new PrintWriter(new File("SmileyHappy.svg"))){
                    pw.write(happyS);
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }break;
            case ("angry"): String angryS = String.format("<svg version=\"1.1\" baseProfile=\"full\" xmlns:ev=\"http://www.w3.org/2001/xml-events\"" +
                    "\n xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns=\"http://www.w3.org/2000/svg\" \n preserveAspectRatio=\"xMidYMid meet\" zoomAndPan=\"magnify\"" +
                    "\nid=\"MySmiley\" viewBox=\"-21 -21 42 42\" width=\"800\" height=\"800\">" +
                    "\n<circle r=\"20\" stroke=\"black\" stroke-width=\"1\" fill=\"black\"/>" +
                    "\n<circle r=\"20\" fill=\"%s\"/>" +
                    "\n<ellipse rx=\"2.5\" ry=\"4\" cx=\"6\" cy=\"-7\" fill=\"%s\"/>" +
                    "\n<ellipse rx=\"2.5\" ry=\"4\" cx=\"-6\" cy=\"-7\" fill=\"%s\"/>" +
                    "\n<ellipse rx=\"8\" ry=\"4\" cx=\"0\" cy=\"8\" fill=\"%s\"/>\n</svg>", this.colorBG, this.colorFG, this.colorFG, this.colorFG);

                try(PrintWriter pw = new PrintWriter(new File("SmileyAngry.svg"))){
                    pw.write(angryS);
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }break;
            case ("excited"): String excitedS = String.format("<svg version=\"1.1\" baseProfile=\"full\" xmlns:ev=\"http://www.w3.org/2001/xml-events\"" +
                    "\nxmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns=\"http://www.w3.org/2000/svg\" \n preserveAspectRatio=\"xMidYMid meet\" zoomAndPan=\"magnify\"" +
                    "\nid=\"MySmiley\" viewBox=\"-21 -21 42 42\" width=\"800\" height=\"800\">" +
                    "\n<circle r=\"20\" stroke=\"black\" stroke-width=\"1\" fill=\"black\"/>" +
                    "\n<circle r=\"20\" fill=\"%s\"/>" +
                    "\n<ellipse rx=\"2.5\" ry=\"4\" cx=\"6\" cy=\"-7\" fill=\"%s\"/>" +
                    "\n<ellipse rx=\"2.5\" ry=\"4\" cx=\"-6\" cy=\"-7\" fill=\"%s\"/>" +
                    "\n<path fill=\"white\" stroke=\"black\" stroke-width=\".75\" " +
                    "d=\"M -12,5 A 13.5,1.5,0 0,012,5 A 13,13,0 0,1 -12,5\"/>\n</svg>", this.colorBG, this.colorFG, this.colorFG);

                try(PrintWriter pw = new PrintWriter(new File("SmileyExcited.svg"))){
                    pw.write(excitedS);
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }
        }
    }
}
