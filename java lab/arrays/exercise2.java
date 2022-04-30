//Accessing Java Array Elements using for Loop

public class exercise2 {
    public static void main(String[] main){
        int Intarray[] = { 1,2,3,4,6};

        // for(int i=0; i<Intarray.length; i++){
        //     System.out.println("values at index"+i+":"+Intarray[i]);
        // }

        for( int i=2; i<Intarray.length; i++){
            System.out.println("values at index"+i+":"+Intarray[i]);
        }
    }
}
