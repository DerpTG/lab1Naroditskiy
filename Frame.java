/** Project: Solo Lab 1 Motorbike
 * Purpose Details: Demonstrate Classes and Proficient Use of GitHub
 * Course: IST 242
 * Author: Felix Naroditskiy
 * Date Developed: 1/17/2024
 * Last Date Changed: 1/20/2024
 * Rev: 1.0
 */

/**
 * Represents the frame of a motorbike, characterized by the material it's made from.
 * Utilizes the Material enum to define the type of material.
 */
class Frame {

    /**
     * The material of the frame, of type Material from the Material enum.
     */
    private Material material;

    /**
     * Constructor to create a new Frame with a specified material type.
     *
     * @param materialType The type of material for the frame, from the Material enum.
     */
    public Frame(Material materialType) {
        material = materialType;
    }

    /**
     * Retrieves the material type of the frame.
     *
     * @return The material type of this frame, from the Material enum.
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Sets the frame's material to a new type, as defined in the Material enum.
     *
     * @param materialType The new material type for the frame.
     */
    public void setMaterial(Material materialType) {
        material = materialType;
    }
}
