package cs3500.excellence.hw5;

import java.awt.Color;


/**
 * This class represents a transiton of state from one time to another of one particular shape. The
 * transition of state means the motion will store the starting states and ending states. The
 * starting states include: starting time, width, height, position, color. The ending states
 * include: ending time, width, height, position, color.
 */
public class Motion {

  //Starting and ending time.
  private int startTime;
  private int endTime;

  //Starting and ending positon.
  private Position2D startPosition;
  private Position2D endPosition;

  //Starting and ending width height. They are assigned double as per assignment.
  private double startWidth;
  private double endWidth;
  private double startHeight;
  private double endHeight;

  //Starting and ending color. Using the awt color library.
  private Color startColor;
  private Color endColor;

  /**
   * Public constructor 1 for motion. This is used when model wants to enter a new motion into a
   * shape's list of motions. The following parameters will be given by the input file.
   *
   * @param startTime     starting time.
   * @param startPosition starting position.
   * @param startWidth    starting width.
   * @param startHeight   starting height.
   * @param startColor    starting color.
   * @param endTime       ending time.
   * @param endPosition   ending position.
   * @param endWidth      ending width.
   * @param endHeight     ending height.
   * @param endColor      ending color.
   * @throws IllegalArgumentException if starting and ending times are less than 1.
   * @throws IllegalArgumentException if starting time is greater than ending time.
   * @throws IllegalArgumentException if any width or height are negative.
   */
  public Motion(int startTime, Position2D startPosition, double startWidth, double startHeight,
                Color startColor, int endTime, Position2D endPosition, double endWidth,
                double endHeight, Color endColor) {
    // Check whether the given times are valid.
    if (startTime < 1 || endTime < 1) {
      throw new IllegalArgumentException("Invalid time.");
    }
    if (startTime > endTime) {
      throw new IllegalArgumentException("Start time cannot be greater than the end time.");
    }
    // Check whether the given sizes are valid.
    if (startWidth <= 0 || startHeight <= 0 || endWidth <= 0 || endHeight <= 0) {
      throw new IllegalArgumentException("The size must be positive.");
    }

    this.startTime = startTime;
    this.startPosition = startPosition;
    this.startWidth = startWidth;
    this.startHeight = startHeight;
    this.startColor = startColor;

    this.endTime = endTime;
    this.endPosition = endPosition;
    this.endWidth = endWidth;
    this.endHeight = endHeight;
    this.endColor = endColor;
  }

  /**
   * Copy constructor of a motion. This will be used when we want to create a copy of this motion in
   * the model.
   *
   * @param motion a motion that we want to copy in the model.
   */
  public Motion(Motion motion) {

    this.startTime = motion.startTime;
    this.startPosition = motion.startPosition;
    this.startWidth = motion.startWidth;
    this.startHeight = motion.startHeight;
    this.startColor = motion.startColor;

    this.endTime = motion.endTime;
    this.endPosition = motion.endPosition;
    this.endWidth = motion.endWidth;
    this.endHeight = motion.endHeight;
    this.endColor = motion.endColor;
  }

  @Override
  public String toString() {
    String output;
    output = String.join(" ", Integer.toString(startTime),
            Double.toString(startPosition.getX()),
            Double.toString(startPosition.getY()),
            Double.toString(startWidth), Double.toString(startHeight),
            Integer.toString(startColor.getRed()),
            Integer.toString(startColor.getGreen()),
            Integer.toString(startColor.getBlue()),
            Integer.toString(endTime),
            Double.toString(endPosition.getX()),
            Double.toString(endPosition.getY()),
            Double.toString(endWidth), Double.toString(endHeight),
            Integer.toString(endColor.getRed()),
            Integer.toString(endColor.getGreen()),
            Integer.toString(endColor.getBlue()));
    return output;
  }

  /**
   * Getter function to get start time.
   *
   * @return start time.
   */
  public int getStartTime() {
    return startTime;
  }

  /**
   * Getter function to get end time.
   *
   * @return end time.
   */
  public int getEndTime() {
    return endTime;
  }

  /**
   * Getter function to get start position.
   *
   * @return start position.
   */
  public Position2D getStartPosition() {
    return startPosition;
  }

  /**
   * Getter function to get end position.
   *
   * @return end position.
   */
  public Position2D getEndPosition() {
    return endPosition;
  }

  /**
   * Getter function to get start width.
   *
   * @return start width.
   */
  public double getStartWidth() {
    return startWidth;
  }

  /**
   * Getter function to get end width.
   *
   * @return end width.
   */
  public double getEndWidth() {
    return endWidth;
  }

  /**
   * Getter function to get start height.
   *
   * @return start height.
   */
  public double getStartHeight() {
    return startHeight;
  }

  /**
   * Getter function to get end height.
   *
   * @return end height.
   */
  public double getEndHeight() {
    return endHeight;
  }

  /**
   * Getter function to get start color.
   *
   * @return start color.
   */
  public Color getStartColor() {
    return startColor;
  }

  /**
   * Getter function to get end color.
   *
   * @return end color.
   */
  public Color getEndColor() {
    return endColor;
  }

  /**
   * Function to change start time. Not used currently in our implementation.
   *
   * @param time the user wants to change as the new start time.
   */
  public void changeStartTime(int time) {
    this.startTime = time;
  }

  /**
   * Function to change end time. Not used currently in our implementation.
   *
   * @param time the user wants to change as the new end time.
   */
  public void changeEndTime(int time) {
    this.endTime = time;
  }

}
