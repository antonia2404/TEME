public class Main {
    public static void main(String[] args) {
        // Creating instances of each subclass
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Panther panther = new Panther();

        // Calling methods on each instance
        System.out.println("Lion:");
        lion.eat();
        lion.sound();

        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sound();

        System.out.println("\nPanther:");
        panther.eat();
        panther.sound();
    }
}