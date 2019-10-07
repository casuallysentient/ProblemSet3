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
      System.out.printf("\nYou received " + grammar + " " + letterGrade2 +  ".\n");
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
    System.out.print("\nEnter a card: ");
    in.nextLine();
    String card = in.nextLine();
    String rank = card.substring(0, 1).toUpperCase();
    String suit = card.substring(1, 2).toUpperCase();
    String fullRank = "";
    String fullSuit = "";

    if(card.length() == 2 && (rank.equals("2") || rank.equals("3") || rank.equals("4") || rank.equals("5") || rank.equals("6") || rank.equals("7") || rank.equals("8") || rank.equals("9") || rank.equals("T") || rank.equals("J") || rank.equals("Q") || rank.equals("K") || rank.equals("A")) && (suit.equals("C") || suit.equals("H") || suit.equals("D") || suit.equals("S"))) {
      if (rank.equals("2")) {
        fullRank = "Two";
      } else if (rank.equals("3")) {
        fullRank = "Three";
      } else if (rank.equals("4")) {
        fullRank = "Four";
      } else if (rank.equals("5")) {
        fullRank = "Five";
      } else if (rank.equals("6")) {
        fullRank = "Six";
      } else if (rank.equals("7")) {
        fullRank = "Seven";
      } else if (rank.equals("8")) {
        fullRank = "Eight";
      } else if (rank.equals("9")) {
        fullRank = "Nine";
      } else if (rank.equals("T")) {
        fullRank = "Ten";
      } else if (rank.equals("J")) {
        fullRank = "Jack";
      } else if (rank.equals("Q")) {
        fullRank = "Queen";
      } else if (rank.equals("K")) {
        fullRank = "King";
      } else if (rank.equals("A")) {
        fullRank = "Ace";
      }
      if (suit.equals("C")) {
        fullSuit = "Clubs";
      } else if (suit.equals("D")) {
        fullSuit = "Diamonds";
      } else if (suit.equals("H")) {
        fullSuit = "Hearts";
      } else if (suit.equals("S")) {
        fullSuit = "Spades";
      }
      System.out.println("\n" + fullRank + " of " + fullSuit + ".");
    } else if(card.length() != 2) {
      System.out.println("\nThat's not a valid card.");
    } else if(!(rank.equals("2") || rank.equals("3") || rank.equals("4") || rank.equals("5") || rank.equals("6") || rank.equals("7") || rank.equals("8") || rank.equals("9") || rank.equals("T") || rank.equals("J") || rank.equals("Q") || rank.equals("K") || rank.equals("A")) && !(suit.equals("C") || suit.equals("H") || suit.equals("D") || suit.equals("S"))) {
      System.out.println("\nThat's not a valid rank or a valid suit.");
    } else if(!(rank.equals("2") || rank.equals("3") || rank.equals("4") || rank.equals("5") || rank.equals("6") || rank.equals("7") || rank.equals("8") || rank.equals("9") || rank.equals("T") || rank.equals("J") || rank.equals("Q") || rank.equals("K") || rank.equals("A"))) {
      System.out.println("\nThat's not a valid rank.");
    } else if(!(suit.equals("C") || suit.equals("H") || suit.equals("D") || suit.equals("S"))) {
      System.out.println("\nThat's not a valid suit.");
    }
  }

  /*
  * Exercise 7.
  *
  * Prompt the user to enter a year. Is it a leap year or not?
  */

  public void leapYear() {
    System.out.print("\nEnter a year: ");
    int potentialLeapYear = in.nextInt();
    String isOrIsNot = "";

    if (potentialLeapYear % 4 == 0 && (potentialLeapYear % 100 != 0 | potentialLeapYear % 400 == 0)) {
      isOrIsNot = " is ";
    } else {
      isOrIsNot = " is not ";
    }
    System.out.println("\n" + potentialLeapYear + isOrIsNot + "a leap year.");
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
