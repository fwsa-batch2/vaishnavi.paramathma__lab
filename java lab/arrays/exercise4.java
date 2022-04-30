public class exercise4 {
    public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String abc[] = new String[2];
        abc[0] = "vaishu";
        abc[1] = "vaishnavi";
        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);
        }

        // Multidimensional Arrays
        int Mdarray[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < Mdarray.length; i++) {
            for (int j = 0; j < Mdarray.length; j++)
                System.out.print(Mdarray[i][j]);
            System.out.println();
        }

        // Java program to demonstrate
        // passing of array to method
        // int intMethod[] ={2,4,5,7,9};
        // sum(intMethod);
        // public static void sum(int[] intMethod) {
        // int sum=0;
        // for(int i=0; i<intMethod.length; i++)
        // sum += intMethod[i];
        // System.out.println("sum of arrays"+sum);

        // }

        // Class Objects for Arrays
        int Intarray[] = new int[2];
        byte bytearray[] = new byte[2];
        short shortarray[] = new short[2];
        String strarray[] = new String[2];
        
        System.out.println(Intarray.getClass());
        System.out.println(bytearray.getClass());
        System.out.println(shortarray.getClass());
        System.out.println(strarray.getClass());
    }
}
