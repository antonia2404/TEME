public class Main {
    public static void main(String[] args) {
     /*   Dog dog1 = new Dog("Max", "Labrador");
        Dog dog2 = new Dog("Bella", "Poodle");

        System.out.println("Informații inițiale:");
        System.out.println("Dog 1 - Nume: " + dog1.getName() + ", Rasa: " + dog1.getBreed());
        System.out.println("Dog 2 - Nume: " + dog2.getName() + ", Rasa: " + dog2.getBreed());

        dog1.setName("Rex");
        dog2.setBreed("Golden Retriever");

        System.out.println("\nInformații după modificări:");
        System.out.println("Dog 1 - Nume: " + dog1.getName() + ", Rasa: " + dog1.getBreed());
        System.out.println("Dog 2 - Nume: " + dog2.getName() + ", Rasa: " + dog2.getBreed());*/

        /*Rectangle rectangle = new Rectangle(5.0, 7.0);

        System.out.println("Dimensiuni inițiale:");
        System.out.println("Lățime: " + rectangle.getWidth());
        System.out.println("Lungime: " + rectangle.getLength());

        System.out.println("\nArie inițială: " + rectangle.calculateArea());
        System.out.println("Perimetru inițial: " + rectangle.calculatePerimeter());

        rectangle.setWidth(6.0);
        rectangle.setLength(8.0);

        System.out.println("\nDimensiuni după modificări:");
        System.out.println("Lățime: " + rectangle.getWidth());
        System.out.println("Lungime: " + rectangle.getLength());

        System.out.println("\nArie după modificări: " + rectangle.calculateArea());
        System.out.println("Perimetru după modificări: " + rectangle.calculatePerimeter());*/

        Person person = new Person("John Doe", "john.doe@example.com");
        Student student = new Student("Alice Smith", "alice.smith@example.com", new int[]{90, 85, 88});
        Profesor profesor = new Profesor("Dr. Johnson", "johnson@example.com", new String[]{"Math", "Physics"});

        System.out.println("Informații despre persoană:");
        System.out.println("Nume: " + person.getName());
        System.out.println("Email: " + person.getEmail());
        System.out.println();

        System.out.println("Informații despre student:");
        System.out.println("Nume: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.print("Note: ");
        for (int grade : student.getGrades()) {
            System.out.print(grade + " ");
        }
        System.out.println("\n");

        System.out.println("Informații despre profesor:");
        System.out.println("Nume: " + profesor.getName());
        System.out.println("Email: " + profesor.getEmail());
        System.out.print("Cursuri predate: ");
        for (String course : profesor.getCourses()) {
            System.out.print(course + " ");
        }
    }
}