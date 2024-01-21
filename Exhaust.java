/** Project: Solo Lab 1 Motorbike
 * Purpose Details: Demonstrate Classes and Proficient Use of GitHub
 * Course: IST 242
 * Author: Felix Naroditskiy
 * Date Developed: 1/17/2024
 * Last Date Changed: 1/20/2024
 * Rev: 1.0
 */

/**
 * Represents the exhaust system of a motorbike, characterized by its specific type.
 */
public class Exhaust {

    /**
     * The type of exhaust system used in the motorbike.
     */
    private String exhaust;

    /**
     * Constructor to create a new Exhaust object with a specified type of exhaust system.
     *
     * @param exhaustType The type of the exhaust system.
     */
    public Exhaust(String exhaustType) {
        exhaust = exhaustType;
    }

    /**
     * Retrieves the type of exhaust system used in the motorbike.
     *
     * @return The type of the exhaust system.
     */
    public String getExhaust() {
        return exhaust;
    }

    /**
     * Sets the type of exhaust system for the motorbike to a new type.
     *
     * @param exhaustType The new type of the exhaust system.
     */
    public void setExhaust(String exhaustType) {
        exhaust = exhaustType;
    }
}

