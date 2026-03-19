public class Counter{
    int mycount = 0;
    static int ourcount = 0;
    void increment(){
        mycount++;
        ourcount++;

    }
    public static void main(String args[]){
        Counter c1 = new Counter();
        Counter c2= new Counter();
        c1.increment();
        c1.increment();
        c2.increment();
        System.out.println("counter1 :"+ c1.mycount + " "+ c1.ourcount);
    }
}
