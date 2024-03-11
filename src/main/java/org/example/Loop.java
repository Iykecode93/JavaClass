package org.example;

public class Loop {
    public static void main(String[] args) {
// Loop in programming is a control flow statement that allows you to execute a block
// of code repeatedly based on a condition.

// For loop is used when you know the number of iteration in advance.
// Print a number from 1 to 100 using for loop.

//        for(int i = 1; i>=100; i++){
//            System.out.println(i);
//        }

// While loop is used when you want to repeat a block of code as long as a condition is true.

//        int i = 1;
//        while(i <= 10){
//            System.out.println(i);
//            i++;
//        }

// a do while loop is similar to while loop, but it executes the block of code at least once before
//  checking the condition.

//        int i = 1;
//        do{
//            System.out.println(i);
//            i++;
//        }while (i<=5);
//


// iterating over an array using for loop.
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }





}
