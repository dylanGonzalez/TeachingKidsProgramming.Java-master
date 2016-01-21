package org.teachingkidsprogramming.CodingChallenge;

import java.util.Scanner;

public class Print100IntegersOnNRows
{
  public static void main(String[] args)
  {
    int rows = 0;
    @SuppressWarnings("resource")
    Scanner keyword = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    rows = keyword.nextInt();
    if (rows > 1 && rows < 100)
    {
      int integer = 0 + 1;
      for (int i = 0; i < 10; i++)
      {
        for (int j = 0; j < 10; j++)
        {
          System.out.print(integer);
          System.out.print(" ");
          integer++;
        }
        if (i < 10 / rows)
        {
          System.out.println("");
        }
      }
    }
    else
    {
      System.out.print("I can only print up to 100 integers. Please enter a number: ");
    }
  }
}