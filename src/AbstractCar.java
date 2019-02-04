import java.awt.*;

public abstract class AbstractCar implements Movable {
    private int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    protected double x;
    protected double y;
    protected Direction direction;

    protected enum Direction {NORTH, EAST, SOUTH, WEST}


    /***
     *
     * @param nrDoors Number of doors on the car
     * @param enginePower Engine power of the car
     * @param currentSpeed The current speed of the car
     * @param color Color of the car
     * @param modelName The model's name
     * @param x The x-coordinate of the car
     * @param y The y-coordinate of the car
     */

    public AbstractCar(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, double x, double y) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName;
        this.x = x;
        this.y = y;
    }

    /***
     * Implemented method for moving car
     */
    public void move() {
        if (direction == Direction.EAST) {
            this.x += currentSpeed;
        } else if (direction == Direction.NORTH) {
            this.y += currentSpeed;
        } else if (direction == Direction.WEST) {
            this.x -= currentSpeed;
        } else if (direction == Direction.SOUTH) {
            this.y -= currentSpeed;
        }

    }

    /***
     * Method if turning car right
     */

    public void turnRight() {
      /* boolean driveStraightForward = dx == 0 && y != 0;
       boolean driveReverseDirection = dx == 0 && y < 0;
       boolean driveInRightDirection = dx > 0 && y == 0;
       boolean driveInLeftDirection = dx < 0 && y == 0;

       if (driveInRightDirection){
           dy = -currentSpeed;
           dx = 0;
       }
       if (driveStraightForward){
           dx = currentSpeed;
           dy = 0;
       }
       if (driveInLeftDirection){
           dy = -currentSpeed;
           dx = 0;
       }
       if (driveReverseDirection){
           dx = currentSpeed;
           dy = 0;
       }*/
        if (direction == Direction.NORTH) {
            direction = Direction.EAST;
        } else if (direction == Direction.EAST) {
            direction = Direction.SOUTH;
        } else if (direction == Direction.SOUTH) {
            direction = Direction.WEST;
        } else if (direction == Direction.WEST) {
            direction = Direction.NORTH;
        }

    }

    /***
     * Method for turning car left
     */
    public void turnLeft() {
     /*  boolean drivesStraightForward = dx == 0 && y > 0;
       boolean drivesReverseDirection = dx == 0 && y < 0;
       boolean drivesInRightDirection = dx > 0 && y == 0;
       boolean drivesInLeftDirection = dx < 0 && y == 0;

       if (drivesStraightForward) {
           dx = -currentSpeed;
           dy = 0;
       }
       if (drivesInRightDirection) {
           dy = currentSpeed;
           dx = 0;
       }
       if (drivesInLeftDirection) {
           dy = currentSpeed;
           dx = 0;
       }
       if (drivesReverseDirection) {
           dx = -currentSpeed;
           dy = 0;
       }
   }*/

        if (direction == Direction.NORTH) {
            direction = Direction.WEST;
        } else if (direction == Direction.WEST) {
            direction = Direction.SOUTH;
        } else if (direction == Direction.SOUTH) {
            direction = Direction.EAST;
        } else if (direction == Direction.EAST) {
            direction = Direction.NORTH;
        }
    }

    /***
     * Gets car model's name
     * @return String modelName
     */
    public String getModelName() {
        return modelName;
    }

    /***
     * Sets x-coordinate
     * @param newX
     */
    public void setX(double newX) {
        this.x = newX;
    }

    /***
     * Sets the y-coordinate
     * @param newY
     */
    public void setY(double newY) {
        this.y = newY;
    }


    /***
     * Gets the current x-coordinate
     * @return Current x-coordinate
     */
    public double getX() {
        return x;
    }

    /***
     * Gets the current y-coordinate
     * @return Current y-coordinate
     */
    public double getY() {
        return y;
    }


    /***
     * Method to get the number of doors
     * @return Number of doors
     */
    public int getNrDoors() {
        return nrDoors;
    }

    /***
     * Sets nr of doors
     * @param nr Parameter for number of doors for a car
     */
    public void setNrDoors(int nr) {
        this.nrDoors = nr;
    }


    /***
     * Gets the current engine power
     * @return Engine power
     */
    public double getEnginePower() {
        return enginePower;
    }

    /***
     * Gets the current speed
     * @return Current speed
     */
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    /***
     * Sets current speed
     * @param speed speed set
     */
    public void setCurrentSpeed(double speed) {
        this.currentSpeed = speed;
    }

    /***
     * Gets the color of the car
     * @return A color
     */
    public Color getColor() {
        return color;
    }

    /***
     * Sets the color of the car
     * @param clr Color of the car
     */
    public void setColor(Color clr) {
        this.color = clr;
    }

    /***
     * Sets current speed to 0.1 when starting the engine
     */
    public void startEngine() {
        currentSpeed = 0.1;
    }

    /***
     * Sets current speed to 0 when stopping the engine
     */
    public void stopEngine() {
        currentSpeed = 0;
    }

}