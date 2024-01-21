/** Project: Solo Lab 1 Motorbike
 * Purpose Details: Demonstrate Classes and Proficient Use of GitHub
 * Course: IST 242
 * Author: Felix Naroditskiy
 * Date Developed: 1/17/2024
 * Last Date Changed: 1/20/2024
 * Rev: 1.0
 */

/**
 * Represents the fuel system of a motorbike, characterized by its specific type.
 */
class FuelSystem {

    /**
     * The type of fuel system used in the motorbike.
     */
    private String fuel;

    /**
     * Constructor to create a new FuelSystem with a specified type.
     *
     * @param fuelType The type of the fuel system (e.g., fuel-injected, supercharged, carburetor).
     */
    public FuelSystem(String fuelType) {
        fuel = fuelType;
    }

    /**
     * Retrieves the type of fuel system used in the motorbike.
     *
     * @return The type of the fuel system.
     */
    public String getFuelSystem() {
        return fuel;
    }

    /**
     * Sets the type of fuel system for the motorbike to a new type.
     *
     * @param fuelType The new type of the fuel system (e.g., fuel-injected, supercharged, carburetor).
     */
    public void setFuelSystem(String fuelType) {
        fuel = fuelType;
    }
}
