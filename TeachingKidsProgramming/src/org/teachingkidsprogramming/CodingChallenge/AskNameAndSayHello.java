package org.teachingkidsprogramming.CodingChallenge;

import java.util.Scanner;

public class AskNameAndSayHello
{
  public static String name;
  public static void main(String[] args)
  {
    Scanner keyword = new Scanner(System.in);
    String name = "Please enter your first name: ";
    System.out.print(name);
    name = keyword.next();
    System.out.println("Hello, " + name + "!");
  }
}
