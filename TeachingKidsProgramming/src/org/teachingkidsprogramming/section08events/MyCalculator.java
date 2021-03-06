package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class MyCalculator
{
  public static void main(String[] args)
  {
    long num1 = MessageBox.askForNumericalInput("Please enter the first number.");
    MessageBox.showMessage("You entered " + num1);
    long num2 = MessageBox.askForNumericalInput("Please enter the second number.");
    MessageBox.showMessage("You entered " + num2);
    String operation = MessageBox.askForTextInput("Please enter a symbol for an operation.");
    if (operation.equals("+"))
    {
      long sum = add(num1, num2);
      MessageBox.showMessage(num1 + " + " + num2 + " = " + sum + ".");
    }
    else if (operation.equals("-"))
    {
      long difference = subtract(num1, num2);
      MessageBox.showMessage(num1 + " - " + num2 + " = " + difference + ".");
    }
    else if (operation.equals("*"))
    {
      long product = multiply(num1, num2);
      MessageBox.showMessage(num1 + " * " + num2 + " = " + product + ".");
    }
    else if (operation.equals("/"))
    {
      long quotient = divide(num1, num2);
      if (quotient == -1) { return; }
      MessageBox.showMessage(num1 + " / " + num2 + " = " + quotient + ".");
    }
    else if (operation.equals("^"))
    {
      long answer = pow(num1, num2);
      MessageBox.showMessage(num1 + " to the power of  " + num2 + " = " + answer + ".");
    }
  }
  public static long add(long n1, long n2)
  {
    return n1 + n2;
  }
  public static long subtract(long n1, long n2)
  {
    return n1 - n2;
  }
  public static long multiply(long n1, long n2)
  {
    return n1 * n2;
  }
  public static long divide(long n1, long n2)
  {
    if (n2 == 0)
    {
      MessageBox.showMessage("Error. Division by zero!");
      return -1;
    }
    else
      return n1 / n2;
  }
  public static long pow(long base, long exp)
  {
    long answer = 1;
    for (long i = 0; i < exp; i++)
    {
      answer = answer * base;
    }
    return answer;
  }
}