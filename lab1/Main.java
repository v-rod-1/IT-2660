//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Roderick Vorhees
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    // The array to be used in the methods below
    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};

    // This outputs the array in order using a while loop
    int i = 0;
    while (i < nums.length) {
      System.out.print(nums[i] + " ");
      i++;
    }
    System.out.println();

    // This outputs the array in reverse order using a for loop
    for (int j = nums.length - 1; j >= 0; j--) {
      System.out.print(nums[j] + " ");
    }
    System.out.println();

    // Prints the first and last elements of the array
    System.out.println("First element: " + nums[0]);
    System.out.println("Last element: " + nums[nums.length - 1]);
    // Calls to Lab1 methods
    // Max using if method
    System.out.println("Max: " + Lab1.maxIf(nums[2], nums[3]));
    // Min using if method
    System.out.println("Min: " + Lab1.minIf(nums[5], nums[3]));
    // Array sum
    System.out.println("Sum: " + Lab1.sum(nums));

    // Array average
    System.out.println("Average: " + Lab1.average(nums));

    // Max value using a for method
    System.out.println("Max value: " + Lab1.maxFor(nums));

    // Min value using a for method
    System.out.println("Min value: " + Lab1.minFor(nums));
  }
}

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  // Finding the max using if comparing two numbers
  public static int maxIf(int a, int b) {
    if (a > b) {
      return a;
    } else {
       return b;
    }
  }

  // Finding the min using if comparing two numbers
  public static int minIf(int a, int b) {
    if (a < b) {
      return a;
    } else {
       return b;
    }
  }

  // Sum of all elements in the array
  public static int sum(int[] nums) {
    int sumTotal = 0;
    for (int i = 0; i < nums.length; i++) {
      sumTotal += nums[i];
    }
    return sumTotal;
  }

  // Average of all elements in the array
  public static double average(int[] nums) {
    int avgTotal = 0;
    for (int num : nums) {
      avgTotal += num;
    }
    return (double) avgTotal / nums.length;
  }

  // Max value in the array using a for statement
  public static int maxFor(int[] nums) {
    int maxVal = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > maxVal) {
        maxVal = nums[i];
      }
    }
    return maxVal;
  }

  // Min value in the array using a for statement
  public static int minFor(int[] nums) {
    int minVal = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < minVal) {
        minVal = nums[i];
      }
    }
    return minVal;
  }
}