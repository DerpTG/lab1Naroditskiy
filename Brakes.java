/** Project: Solo Lab 1 Motorbike
 * Purpose Details: Demonstrate Classes and Proficient Use of GitHub
 * Course: IST 242
 * Author: Felix Naroditskiy
 * Date Developed: 1/17/2024
 * Last Date Changed: 1/20/2024
 * Rev: 1.0
 */

/**
 * Represents the brakes of a motorbike, characterized by their specific type.
 */
class Brakes {

    /**
     * The type of brake system used in the motorbike.
     */
    private String brakes;

    /**
     * Constructor to create a new Brakes object with a specified type.
     *
     * @param brakeType The type of the brake system (e.g., disc, drum, ABS).
     */
    public Brakes(String brakeType) {
        brakes = brakeType;
    }

    /**
     * Retrieves the type of brake system used in the motorbike.
     *
     * @return The type of the brake system.
     */
    public String getBrakes() {
        return brakes;
    }

    /**
     * Sets the type of brake system for the motorbike to a new type.
     *
     * @param brakeType The new type of the brake system (e.g., disc, drum, ABS).
     */
    public void setBrakes(String brakeType) {
        brakes = brakeType;
    }
}
