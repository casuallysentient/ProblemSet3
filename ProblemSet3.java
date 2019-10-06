/**
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {
  private static Scanner in = new Scanner(System.in);
  public static void main(String[] args) {
    ProblemSet3 ps = new ProblemSet3();
    ps.sign();          // executes Exercise 1
    ps.parity();        // executes Exercise 2
    ps.ordered();       // executes Exercise 3
    ps.gpa();           // executes Exercise 4
    ps.grade();         // executes Exercise 5
    ps.cards();         // executes Exercise 6
    ps.leapYear();      // executes Exercise 7
    ps.state();         // executes Exercise 8
    ps.months();        // executes Exercise 9
    ps.salary();        // executes Exercise 10
    in.close();
  }

  /*
  * Exercise 1.
  *
  * Prompt the user to enter an integer. Is it positive, negative, or zero?
  */

  public void sign() {
    System.out.print("\nEnter an integer: ");
    int signInteger = in.nextInt();

    if(signInteger > 0) {
      System.out.println("\nPositive.");
    } else if(signInteger < 0) {
      System.out.println("\nNegative.");
    } else if(signInteger == 0) {
      System.out.println("\nZero.");
    }
  }

  /*
  * Exercise 2.
  *
  * Prompt the user to enter an integer. Is it even or odd?
  */

  public void parity() {
    System.out.print("\nEnter an integer: ");
    int evenOddInteger = in.nextInt();

    if((evenOddInteger % 2) == 0) {
      System.out.println("\nEven.");
    } else {
      System.out.println("\nOdd.");
    }
  }

  /*
  * Exercise 3.
  *
  * Prompt the user to enter three integers. How are the integers ordered?
  */

  public void ordered() {
    System.out.println("\nEnter three integers.");
    System.out.print("\nEnter integer: ");
    int ordInteger1 = in.nextInt();
    System.out.print("Enter integer: ");
    int ordInteger2 = in.nextInt();
    System.out.print("Enter integer: ");
    int ordInteger3 = in.nextInt();

    if(ordInteger1 == ordInteger2 && ordInteger2 == ordInteger3) {
      System.out.println("\nSame.");
    } else if(ordInteger1 < ordInteger2 && ordInteger2 < ordInteger3) {
        System.out.println("\nStrictly increasing.");
    } else if(ordInteger1 <= ordInteger2 && ordInteger2 <= ordInteger3) {
        System.out.println("\nIncreasing.");
    } else if(ordInteger1 >= ordInteger2 && ordInteger2 >= ordInteger3) {
      System.out.println("\nDecreasing.");
    } else if(ordInteger1 > ordInteger2 && ordInteger2 > ordInteger3) {
      System.out.println("\nStrictly decreasing.");
    } else {
      System.out.println("\nUnordered.");
    }
  }

  /*
  * Exercise 4.
  *
  * Prompt the user to enter a letter grade. What's the corresponding GPA?
  */

  public void gpa() {
    double aGrade = 4.00;
    double bGrade = 3.00;
    double cGrade = 2.00;
    double dGrade = 1.00;
    double fGrade = 0.00;
    double pointDifference = 0.33;
    String plusMinus = "";
    double gpa = 0.00;

    System.out.print("\nEnter a letter grade: ");
    in.nextLine();
    String letterGrade1 = in.nextLine();
    letterGrade1 = letterGrade1.trim();
    String firstLetter = letterGrade1.substring(0, 1).toUpperCase();
    if(letterGrade1.length() == 2) {
      plusMinus = letterGrade1.substring(1, 2);
    }
    if(letterGrade1.length() <= 2 && letterGrade1.length() > 0 && (firstLetter.equals("A") || firstLetter.equals("B") || firstLetter.equals("C") || firstLetter.equals("D") || firstLetter.equals("F")) && (plusMinus.equals("") || plusMinus.equals("+") || plusMinus.equals("-"))) {
      if(plusMinus.equals("+")) {
        gpa += pointDifference;
      } else if(plusMinus.equals("-")) {
        gpa -= pointDifference;
      }
      if(firstLetter.equals("A")) {
        gpa += aGrade;
        if(gpa > 0) {
          gpa -= pointDifference;
        }
      } else if(firstLetter.equals("B")) {
        gpa += bGrade;
      } else if(firstLetter.equals("C")) {
        gpa += cGrade;
      } else if(firstLetter.equals("D")) {
        gpa += dGrade;
      } else if(firstLetter.equals("F")) {
        gpa += fGrade;
        if(gpa < 0) {
          gpa += pointDifference;
        }
      }
      System.out.printf("\nYour GPA is %.2f.\n", gpa);
    } else {
      System.out.println("\nThat's not a valid letter grade.");
    }
  }

  /*
  * Exercise 5.
  *
  * Prompt the user to enter a grade. What's the corresponding letter grade?
  */

  public void grade() {
    System.out.print("\nEnter a grade: ");
    double numberGrade = in.nextDouble();
    char letterGrade2 = 'X';
    String grammar = "";

    if(numberGrade >= 0 && numberGrade <= 100) {
      if(numberGrade >= 90 && numberGrade <= 100) {
        letterGrade2 = 'A';
        grammar = "an";
      } else if(numberGrade >= 80 && numberGrade <= 89) {
        letterGrade2 = 'B';
        grammar = "a";
      } else if(numberGrade >= 70 && numberGrade <= 79) {
        letterGrade2 = 'C';
        grammar = "a";
      } else if(numberGrade >= 60 && numberGrade <= 69) {
        letterGrade2 = 'D';
        grammar = "a";
      } else if(numberGrade >= 0 && numberGrade <= 59) {
        letterGrade2 = 'F';
        grammar = "an";
      }
      System.out.printf("\nYou received " + grammar + " " + letterGrade2 +  ".");
    } else if(numberGrade < 0) {
      System.out.println("\nGrades below 0 are invalid.");
    } else if(numberGrade > 100) {
      System.out.println("\nGrades above 100 are invalid.");
    }
  }

  /*
  * Exercise 6.
  *
  * Prompt the user to enter a playing card. What card was entered?
  */

  public void cards() {

  }

  /*
  * Exercise 7.
  *
  * Prompt the user to enter a year. Is it a leap year or not?
  */

  public void leapYear() {

  }

  /*
  * Exercise 8.
  *
  * Prompt the user to enter a temperature. At that temperature, is water a solid,
  * liquid, or gas?
  */

  public void state() {

  }

  /*
  * Exercise 9.
  *
  * Prompt the user to enter a month. How many days are in that month?
  */

  public void months() {

  }

  /*
  * Exercise 10.
  *
  * Prompt the user to enter a wage and hours worked. How much money will be made?
  */

  public void salary() {

  }
}
