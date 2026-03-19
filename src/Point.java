public class Point {
    int xcordinate;
    int ycordinate;
    static int count = 0;
    public Point(int x,int y){
        ycordinate= y;
        xcordinate = x;
        count++;

    }
    public void move (int xdistance, int ydistance){
        xcordinate += xdistance;
        ycordinate += ydistance;

    }

    public static void main (String args[]){
        System.out.println(Point.count);
        Point p1 = new Point(18,35);
        Point p2 = new Point(25,56);
        System.out.println(Point.count);
        System.out.println("x:"+p1.xcordinate+"y:"+p1.ycordinate);
        p1.move(5,7);
        System.out.println(p1==p2);
        System.out.println("x:"+ p1.xcordinate + "y:"+ p1.ycordinate);
    }
}
