/** Project: Solo Lab 1 Motorbike
 * Purpose Details: Demonstrate Classes and Proficient Use of GitHub
 * Course: IST 242
 * Author: Felix Naroditskiy
 * Date Developed: 1/17/2024
 * Last Date Changed: 1/20/2024
 * Rev: 1.0
 */

/**
 * Represents the engine of a motorbike, characterized by its specific type.
 */
public class Engine {

    /**
     * The type of engine used in the motorbike.
     */
    private String engine;

    /**
     * Constructor to create a new Engine object with a specified type of engine.
     *
     * @param engineType The type of the engine (e.g., single-cylinder, V-twin, inline-four).
     */
    public Engine(String engineType) {
        engine = engineType;
    }

    /**
     * Retrieves the type of engine used in the motorbike.
     *
     * @return The type of the engine.
     */
    public String getEngine() {
        return engine;
    }

    /**
     * Sets the type of engine for the motorbike to a new type.
     *
     * @param engineType The new type of the engine (e.g., single-cylinder, V-twin, inline-four).
     */
    public void setEngine(String engineType) {
        engine = engineType;
    }
}

