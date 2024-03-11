package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println();
//
//        int x = 30;
//        int y = 50;
//        if(y > x) {
//            System.out.println("y is the highest variable given");
//        }
//
//        int a = -10;
//        if(a > 0){
//            System.out.println("a is positive");
//        }else  {
//            System.out.println("a is negative");
//        }

//        double percentage = 89.5;
//        char grade;
//
//        if(percentage >= 90.8){
//            grade = 'A';
//
//        }else if (percentage >= 70.0){
//            grade = 'B';
//        }else if (percentage >= 60.0){
//            grade = 'C';
//        }else if (percentage >= 55.0){
//            grade = 'D';
//        }else if (percentage >= 45.0){
//            grade = 'E';
//        }else {
//            grade = 'F';
//        }
//        System.out.println("Grades: " + grade);

        int dayOfWeek = 8;
        String dayName;
        switch (dayOfWeek){
            case 1:
                dayName = "Monday";
                break;

            case 2:
                dayName = "Tuesday";
                break;

            case 3:
                dayName = "Wednesday";
                break;

            case 4:
                dayName = "Thursday";
                break;

            case 5:
                dayName = "Friday";
                break;

            case 6:
                dayName = "Saturday";
                break;

            case 7:
                dayName = "Sunday";
                break;
            default:
            dayName = "Invalid day";
        }
        System.out.println("Day of the week: " + dayName);
    }

}