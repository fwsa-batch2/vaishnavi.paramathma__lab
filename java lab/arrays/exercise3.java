//Arrays of Objects
// passing two values to single dimensional array using parameters
 
 class exercise {
    public int id_no;
    public String emp_name;
    exercise(int id_no,String emp_no){
        this.id_no= id_no;
        this.emp_name = emp_name;
        
    } 
}
public class exercise3{
    public static void main(String[] args){      
       // exercise arr[]=new exercise{(1,"vaishnavi"),(2,"keerthana"),(3,"annapoorani"),(4,"sangeetha")};
       exercise arr[]; 
       arr = new exercise[4];
       arr[0] = new exercise(1,"vaishu");
       arr[1] = new exercise(2,"vp");
       arr[2] = new exercise(3,"vaishali");
       arr[3] = new exercise(4,"vaishnavi");

       int[] arrayss = {1,2,3};
       arrayss[arrayss.length]=4;

       for (int i=0; i<arr.length; i++ )
        System.out.println("element at"+i+":"+arr[i].id_no+arr[i].emp_name);
    } 
} 
