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

