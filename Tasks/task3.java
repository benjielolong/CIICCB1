package Tasks;

public class task3 {
 
    public static void main(String[] args) {
        
    String a = "Wow";
        StringBuilder g = new StringBuilder("Hello");
        String b = a;
        String c = a + "!";
        String d = "Wow!";

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if(b1 && b2 && b3) {
            System.out.println("Success");
        }

        System.out.println(g);

    }
}
