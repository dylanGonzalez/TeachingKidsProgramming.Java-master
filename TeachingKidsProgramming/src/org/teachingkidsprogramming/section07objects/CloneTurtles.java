package org.teachingkidsprogramming.section07objects;

import java.util.ArrayList;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Text;

public class CloneTurtles
{
  public ArrayList<Turtle> turtles = new ArrayList<Turtle>();
  public MultiTurtleWindow mtw     = new MultiTurtleWindow();
  public CloneTurtles()
  {
    showSomeTurtles();
  }
  private void showSomeTurtles()
  {
    for (int i = 0; i < 360; i++)
    {
      Turtle myTurtles = new Turtle();
      turtles.add(myTurtles);
    }
    int numberOfTurtles = turtles.size();
    System.out.println(numberOfTurtles);
    new Text("There are " + numberOfTurtles + " turtles in the turtle container").setTopLeft(50, 50)
        .setPenColor(PenColors.Yellows.Gold).addTo(mtw);
    for (Turtle turtle : turtles)
    {
      mtw.addAndShowTurtle(turtle);
    }
    for (int i = 0; i < 360; i++)
    {
      turtles.get(i).setX(i * 100 + 50);
      turtles.get(i).setY(i * 100 + 50);
    }
    for (Turtle turtle : turtles)
    {
      turtle.setPenWidth(10);
      turtle.setSpeed(9);
      turtle.drawStar(100);
    }
  }
  public static void main(String[] args)
  {
    new CloneTurtles();
  }
}
