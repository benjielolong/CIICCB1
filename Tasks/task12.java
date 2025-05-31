package Tasks;

class Point {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void print() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public void scale() {
        this.x = this.x / 2;
        this.y = this.y / 2;
    }
}

public class task12 {
    public static void main(String[] args) {
        Point p = new Point(32, 32);
        
        System.out.println("Initial point:");
        p.print();
        
        System.out.println("\nAfter scaling 5 times:");
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}