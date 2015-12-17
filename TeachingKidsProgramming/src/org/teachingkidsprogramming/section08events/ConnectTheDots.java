package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Greens;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Pinks;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Purples;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;

public class ConnectTheDots implements MouseRightClickListener, MouseLeftClickListener
{
  public static void main(String[] args)
  {
    new ConnectTheDots();
  }
  public ConnectTheDots()
  {
    Tortoise.show();
    //    Listen for right clicks on the window for the tortoise  --#20.2
    Tortoise.getBackgroundWindow().addMouseLeftClickListener(this);
    Tortoise.setSpeed(10);
    //    clearTheScreen (recipe below) --#19.1
    //
    //    ------------- Recipe for clearTheScreen --#19.2
    //       Clear the Tortoise --#20.1
    //       Write "Right click to clear" on the screen at position 100, 100 --#18
    //    ------------- End of clearTheScreen Recipe --#19.3
    //
    prepareColorPalette();
  }
  private void prepareColorPalette()
  {
    ColorWheel.addColor(Reds.Red);
    ColorWheel.addColor(Greens.Green);
    ColorWheel.addColor(Blues.Blue);
    ColorWheel.addColor(Purples.Purple);
    ColorWheel.addColor(Pinks.Pink);
    ColorWheel.addColor(Blues.Teal);
  }
  @Override
  public void onRightMouseClick(int x, int y)
  {
    //    clearTheScreen (recipe above) --#20.3
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    addDot(x, y);
  }
  private void addDot(int x, int y)
  {
    addACircle(x, y);
    Tortoise.moveTo(x, y);
  }
  private void addACircle(int x, int y)
  {
    Circle circle = new Circle(7, ColorWheel.getNextColor());
    circle.setTransparency(40);
    circle.setCenter(x, y);
    circle.addTo(Tortoise.getBackgroundWindow());
  }
}
