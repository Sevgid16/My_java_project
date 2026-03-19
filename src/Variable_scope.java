public class Variable_scope{
    public static void main (String args[]){
        int x = 5;
        if (x == 5){
           // int x = 6;// x is already defined
            int y = 73;
            System.out.println("x = " + x + "y = "+ y);

        }
       // System.out.println("x = " + x + "y = "+ y); // y is not defined
    }
}