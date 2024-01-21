/** Project: Solo Lab 1 Motorbike
 * Purpose Details: Demonstrate Classes and Proficient Use of GitHub
 * Course: IST 242
 * Author: Felix Naroditskiy
 * Date Developed: 1/17/2024
 * Last Date Changed: 1/20/2024
 * Rev: 1.0
 */

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
