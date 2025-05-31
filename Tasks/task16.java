package Tasks;

public class task16 {
    interface Animal {
        boolean feed(boolean timeToEat);
        void groom();
        void pet();
    }

    public static class Gorilla implements Animal {
        @Override
        public boolean feed(boolean timeToEat) {
            // put gorilla food into cage
            System.out.println("Feeding the gorilla...");
            return timeToEat;
        }

        @Override
        public void groom() {
            // lather, rinse, repeat
            System.out.println("Grooming the gorilla...");
        }

        @Override
        public void pet() {
            // pet at your own risk
            System.out.println("Petting the gorilla...");
        }
    }

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        System.out.println("Feeding time: " + gorilla.feed(true));
        gorilla.groom();
        gorilla.pet();
    }
}
