package Task6;

public class Graphics3D {
    public static void main(String[] args) {

        Box b1 = new Box(3,4,5);
        Box cube = new Box(4);

        System.out.println(b1.getVolume());
        System.out.println(cube.getVolume());
        System.out.println(b1.getSurfaceArea());
        System.out.println(cube.getSurfaceArea());

        b1.scale(2);
        cube.scale(2);

        System.out.println(b1.getVolume());
        System.out.println(cube.getVolume());
        System.out.println(b1.getSurfaceArea());
        System.out.println(cube.getSurfaceArea());

        System.out.println(cube.isCube());
    }
}
