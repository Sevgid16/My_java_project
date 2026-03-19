class And_or_operators{
    public static void main(String args[]){
        int n,d,q;
        double i,j,m;
        i =5;
        j = 10;
        if (i!=0){
            System.out.println("i does not equal zero");
            m = j / i;
            System.out.println("j/i is "+ m);

        }

        n = 10;
        d = 0;
        if (d != 0 && (n%d)==0){
            System.out.println(d + "is a factor of"+ n);

        }
    }
}