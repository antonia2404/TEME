class Person {
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter și setter pentru 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter și setter pentru 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

// Clasa Student care moștenește clasa Person
class Student extends Person {
    private int[] grades;

    public Student(String name, String email, int[] grades) {
        super(name, email);
        this.grades = grades;
    }

    // Getter și setter pentru 'grades'
    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}

// Clasa Profesor care moștenește clasa Person
class Profesor extends Person {
    private String[] courses;

    public Profesor(String name, String email, String[] courses) {
        super(name, email);
        this.courses = courses;
    }

    // Getter și setter pentru 'courses'
    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}