class Rectangle {
    private double length;
    private double width;

    public Rectangle () {
        length = 4;
        width = 8;
    }

    public Rectangle (double length) {
        this.length = length;
        width = 8;
    }

    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength () {
        return length;
    }

    public double getWidth () {
        return width;
    }
}