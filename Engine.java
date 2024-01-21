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

