package Task6;

public class Box {

    private int length;
    private int width;
    private int height;

    public Box(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public Box(int length){
        this.length = length;
        this.width = length;
        this.height = length;
    }
    public void scale(int scalingFactor){
        this.length = this.length * scalingFactor;
        this.width = this.width * scalingFactor;
        this.height = this.height * scalingFactor;
    }
    public int getVolume(){
        return length*width*height;
    }
    public int getSurfaceArea(){
        return 2*length*height+2*length*width+2*height*width;
    }
    public boolean isCube(){
        return length == width && length == height;
    }

    @Override
    public String toString() {
        return "Box{" + "length=" + length + ", width=" + width + ", height=" + height + '}';
    }
}
