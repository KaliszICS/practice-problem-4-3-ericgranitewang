/**
 * class about rectangle
 * @author Eric Wang
 */

public class Rectangle {
    private double length;
    private double width;

    /**
     * base constructor
     * double length is set to 4, double width is set to 8
     */
    public Rectangle () {
        length = 4;
        width = 8;
    }
    /**
     * constructor with only length
     * @param length double length of rectangle
     * double width is defaulted to 8
     */

    public Rectangle (double length) {
        this.length = length;
        width = 8;
    }

    /**
     * constructor with length and width
     * @param length length of rectangle
     * @param width width of rectangle
     */
    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }
    /**
     * gets length
     * @return returns double length
     */
    public double getLength () {
        return length;
    }

    /**
     * gets width
     * @return returns double width
     */
    public double getWidth () {
        return width;
    }
}