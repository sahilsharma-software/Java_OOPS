public class Persons {

    String name;
    int age;

    Persons(String n, int a) {
        name = n;
        age = a;
    }

    void introduce() {
        System.out.println("HI MY NAME IS " + name + " AND I AM " + age + " years old.");
    }

}

class Student extends Persons {

    String skills;

    Student(String name, int age, String skills) {
        super(name, age); // Call superclass constructor with parameters
        this.skills = skills; // Initialize skills with the passed value
    }

    @Override
    void introduce() {
        System.out.println("HI MY NAME IS " + name + " AND I AM " + age + " years old. MY SKILLS ARE " + skills);
        super.introduce(); // Call superclass introduce method
    }

    public static void main(String[] args) {
        Student obj = new Student("Sahil", 19, "coding");
        obj.introduce();
    }

}
