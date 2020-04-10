package com.company.studentADT;




public class Main {

    public String studentName;
    public int studentGrade;
    public Boolean identified;


    public static void main (String[] args) {

    }

    Main(String firstName,
         String middleInitial,
         String lastName,
         int studentGrade,
         Boolean identified) {

        this.studentName = String.format("%s %s %s",
                firstName,
                middleInitial,
                lastName);

        this.studentGrade = studentGrade;

        this.identified = identified;
    }



    public String StudentInfo() {
        return String.format("%s is in the grade %d and %s.", studentName,
                studentGrade,
                (identified)?
                "is identified." : "is not identified");
    }
}

