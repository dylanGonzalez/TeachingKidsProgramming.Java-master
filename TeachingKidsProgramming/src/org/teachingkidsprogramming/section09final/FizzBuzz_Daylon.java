package org.teachingkidsprogramming.section09final;

public class FizzBuzz_Daylon
{
  public static void main(String[] args)
  {
    for (int i = 100; i > 0; i--)
    {
      if (i % 3 == 0 && i % 5 == 0)
      {
        System.out.println("FizzBuzz");
      }
      else if (i % 3 == 0)
      {
        System.out.println("Fizz");
      }
      else if (i % 5 == 0)
      {
        System.out.println("Buzz");
      }
      else
      {
        System.out.println(i);
      }
    }
  }
}
