package nl.bas.archaeo.exercises.students;

public class App {

    public static void main(String arg[])
    {
        Student srini = new Student();
        srini.name = "Srinivas";
        srini.english = 87;
        srini.telugu = 84;
        srini.hindi = 76;
        srini.maths = 100;
        srini.science = 92;
        srini.social = 88;

        System.out.println("-------------------------------------------------");
        System.out.println("Detailed Marks");
        System.out.println("-------------------------------------------------");
        srini.printMarksDetails();
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("Summary Marks");
        System.out.println("-------------------------------------------------");
        srini.printMarksSummary();
        System.out.println("-------------------------------------------------");
    }
}
