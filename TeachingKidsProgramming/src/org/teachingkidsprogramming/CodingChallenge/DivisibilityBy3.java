package org.teachingkidsprogramming.CodingChallenge;

import java.util.Scanner;

public class DivisibilityBy3
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer (must be greater than 0): ");
    int num = sc.nextInt();
    if (num < 1)
    {
      System.out.println("Invalid input. Number must be 1 or greater");
      System.exit(0);
    }
    else if (num % 3 == 0)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
}
