import java.awt.*;

public class Oval extends AShape {

  public Oval() {
    super();
    this.shapeName = "oval";
  }

  public Oval(Color color, Position2D position, double width, double height, String shapeName) {
    super(color, position, width, height, "oval");
  }

}
