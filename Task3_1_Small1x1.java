public class Task3_1_Small1x1 {

    public static void main( String[] args)
    {
        System.out.println("\t| \t " + 1+"\t  " + 2+"\t   " + 3+"\t" + 4+"\t " + 5+"\t  " + 6+"\t   " + 7+"\t" + 8+"\t " + 9+"\t " + 10);
        System.out.println("-------------------------------------------------------");
        for( int z = 1; z <= 10; z++)
        {
            System.out.print(z+"\t|");
            for( int s = 1; s <= 10; s++)
            {
                if( z * s < 10) System.out.print(" ");
                if( z * s < 100) System.out.print(" ");
                System.out.print( "  " + z * s);
            }
            System.out.println();
        }
    }
}