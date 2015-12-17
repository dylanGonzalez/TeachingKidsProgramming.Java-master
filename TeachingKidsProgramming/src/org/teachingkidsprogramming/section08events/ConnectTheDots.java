package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
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
    //    prepareColorPalette (recipe below) --#17.1
    //    ------------- Recipe for prepareColorPalette --#17.2
    ColorWheel.addColor(Reds.Red);
    //       Add green to the color wheel --#12
    //       Add blue to the color wheel --#13
    //       Add purple to the color wheel --#14
    //       Add pink to the color wheel --#15
    //       Add teal to the color wheel --#16
    //    ------------- End of prepareColorPalette Recipe --#17.3
  }
  @Override
  public void onRightMouseClick(int x, int y)
  {
    //    clearTheScreen (recipe above) --#20.3
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    //    addDot (recipe below) --#11.1
    //
    //    ------------- Recipe for addDot --#11.2
    //        addACircle (recipe below) --#10.1
    //
    //        ------------- Recipe for addACircle --#10.2
    Circle circle = new Circle(7, ColorWheel.getNextColor());
    //           Change the circle to be 40% opaque --#9
    //           Move the circle so that it's center is at the current position of the mouse --#8
    //           Place the circle on the tortoise's window. --#7
    Tortoise.getBackgroundWindow();
    //        ------------- End of addACircle Recipe --#10.3
    Tortoise.moveTo(x, y);
    //  ------------- End of addDot Recipe --#11.3
  }
}