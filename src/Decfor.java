 public class Decfor {
    public static void main (String args[]){
        int x;
        for(x =100;x>-100;x-=5){
            if(x == 100) continue;
            if (x == 50)
                break;

           System.out.println(x);
       }
        //x =100;
        //while(x> -100){
            //System.out.println(x);
           // x -=5;
        //}
        outer: for (int i = 0; i < 3; i++) {
                  for (int j = 2; j < 5; j++) {
                      if (j ==4)
                          break outer;
                System.out.println (i + "," + j);}}
    }
 }