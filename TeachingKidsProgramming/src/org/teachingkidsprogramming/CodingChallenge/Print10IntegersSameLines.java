package org.teachingkidsprogramming.CodingChallenge;

public class Print10IntegersSameLines
{
  public static void main(String[] args)
  {
    int integer = 0;
    for (int i = 0; i < 10; i++)
    {
      System.out.print(integer + " ");
      integer = integer + 1;
    }
    System.out.println();
    System.out.println();
    integer = 1;
    for (int i = 0; i < 10; i++)
    {
      System.out.print(integer + " ");
      integer = integer + 1;
    }
  }
}