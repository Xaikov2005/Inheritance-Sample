class Exam{
    String message;
    double price;
    boolean status;

    // Constructor assigning "Good luck" to message
    public Exam() {
        this.message = "Good luck";
    }

    // Create an empty overloaded constructor for the Exam class with two (2) String parameters named period and level.
    public Exam(String period, String level) {
        // Empty constructor body as per the instructions
    }

    // Declare a double-type accessor named getPrice that returns the value of price.
    public double getPrice() {
        return price;
    }

    // Accessor for status
    public boolean isFinished() {
        return status;
    }
}

// Declare a class named Midterm that inherits from the class named Exam
class Midterm extends Exam {
    // Constructor for Midterm
    public Midterm() {
        super(); // Call parent class constructor
        System.out.println("Exam has started.");
    }
}

// Class to demonstrate multiple levels of inheritance
class Essay extends Midterm {
    // No specific implementation needed for now
}

// Another example showing inheritance
class Quiz extends Essay {
    // No specific implementation needed for now
}

// Demonstrating inheritance between Quiz and Essay
// Statement: `class Quiz extends Essay { }`

// Main class to test
public class Main {
    public static void main(String[] args) {
        // Create an instance of Midterm to test constructors
        Midterm midterm = new Midterm();

        // Testing accessor methods
        Exam exam = new Exam();
        exam.price = 100.0;
        exam.status = true;

        System.out.println("Price: " + exam.getPrice());
        System.out.println("Is Finished: " + exam.isFinished());
    }
                           }
