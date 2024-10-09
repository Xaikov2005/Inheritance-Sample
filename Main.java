class Exam{
     String message;
     String period;
     String level;
     double price = 0.0;
     boolean status = false;

    public Exam() {
        this.message = "Good luck";
    }

    public Exam(String period, String level){
        this.period = period;
        this.level = level;

    }

    public double getPrice(double price){
        return this.price;
    }

    public boolean isFinished(boolean status){
        return this.status;
    }
}

class Midterms extends Exam {

    public Midterms() {
        super();
        System.out.println("Midterms has started");
    }

}

class Quiz {
}

class Essay extends Quiz {
    
}

// Main class to test the code
public class Main {
    public static void main(String[] args) {
        // Step 1: Create an instance of Exam
        Exam exam = new Exam();
        System.out.println("Message from Exam: " + exam.message);

        // Step 7: Create an instance of Midterm and see the constructor print
        Midterms midterm = new Midterms();

        // Step 8: Inheritance between Quiz and Essay
        Essay essayFromQuiz = new Essay();
        System.out.println("Essay class is a derived class from Base class Quiz.");
    }
}