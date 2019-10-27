package nl.bas.archaeo.exercises.students;

public class Student {


        String name;
        // Marks in various subjects
        int english;
        int telugu;
        int hindi;
        int maths;
        int science;
        int social;

        int getLanguagesTotal()
        {
            return english + telugu + hindi;
        }

        int getNonLanguagesTotal()
        {
            return maths + science + social;
        }

        int getAllSubjectsTotal()
        {
            return getLanguagesTotal() + getNonLanguagesTotal();
        }

        double getPCMPercentage()
        {
            return 100.0 * (maths + science) / 200.0;
        }

        void printMarksSummary()
        {
            System.out.println("Languages: " + getLanguagesTotal());
            System.out.println("Non languages: " + getNonLanguagesTotal());
            System.out.println("PCM Percentage: " + getPCMPercentage());
            System.out.println("Total: " + getAllSubjectsTotal());
        }

        void printMarksDetails()
        {
            System.out.println("English : " + english);
            System.out.println("Telugu : " + telugu);
            System.out.println("Hindi : " + hindi);
            System.out.println("Maths : " + maths);
            System.out.println("Science : " + science);
            System.out.println("Social : " + social);
        }
    }
