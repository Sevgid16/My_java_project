public class If_else_statements{
    public static void main (String args[]){
        test(5);
        test(9);
        test(2);



        int i = 0;
        if ((i == 0) || (++i < 10)){
            System.out.println("this statement wwill not be executed");

        }
        System.out.println("value of i " + i);
    } //else
    public static void test(int x){
        if (x >5){
            System.out.println(x + "is > 5");

        }
        else if(x == 5){
            System.out.println(x + "equals 5");

        }


        else{
            System.out.println(x +"is not > 5");

        }
    }
    }
