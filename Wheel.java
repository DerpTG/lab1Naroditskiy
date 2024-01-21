/**
 * Represents a wheel with a specific size.
 */
class Wheel {

    /**
     * The size of the wheel.
     */
    private double wheelSize;

    /**
     * Constructor to create a new Wheel with a specified size.
     *
     * @param size The initial size of the wheel.
     */
    public Wheel(double size) {
        wheelSize = size;
    }

    /**
     * Retrieves the size of the wheel.
     *
     * @return The current size of this wheel.
     */
    public double getSize() {
        return wheelSize;
    }

    /**
     * Sets the size of the wheel to a new value.
     *
     * @param size The new size for the wheel.
     */
    public void setSize(double size) {
        wheelSize = size;
    }
}
