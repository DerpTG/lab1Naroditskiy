/** Project: Solo Lab 1 Motorbike
 * Purpose Details: Demonstrate Classes and Proficient Use of GitHub
 * Course: IST 242
 * Author: Felix Naroditskiy
 * Date Developed: 1/17/2024
 * Last Date Changed: 1/20/2024
 * Rev: 1.0
 */

/**
 * Represents the electronic starter system of a motorbike, characterized by its specific type.
 */
class Electronics {

    /**
     * The type of electronic starter system used in the motorbike.
     */
    private String electronics;

    /**
     * Constructor to create a new Electronics object with a specified type of electronic starter system.
     *
     * @param electronicType The type of the electronic starter system.
     */
    public Electronics(String electronicType) {
        electronics = electronicType;
    }

    /**
     * Retrieves the type of electronic starter system used in the motorbike.
     *
     * @return The type of the electronic starter system.
     */
    public String getElectronics() {
        return electronics;
    }

    /**
     * Sets the type of electronic starter system for the motorbike to a new type.
     *
     * @param electronicType The new type of the electronic starter system.
     */
    public void setElectronics(String electronicType) {
        electronics = electronicType;
    }
}

