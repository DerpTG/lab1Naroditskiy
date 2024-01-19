/** Project: Solo Lab 1 Motorbike
 * Purpose Details: Demonstrate Classes and Proficient Use of GitHub
 * Course: IST 242
 * Author: Felix Naroditskiy
 * Date Developed: 1/17/2024
 * Last Date Changed: 1/19/2024
 * Rev: 1.0
 */

public class Main {
    public static void main(String args[]){
        MotorBike m1 = new MotorBike("Silver", "City", Material.ALUMINUM, 26.0, "Disc", "Push Button", "Single Cylinder", "Side", "Fuel Injected");
        MotorBike m2 = new MotorBike("White", "Cruiser", Material.TITATNIUM, 29.0, "Drum", "Kickstart", "V-Twin", "Free Flowing", "Supercharged");
        MotorBike m3 = new MotorBike("Blue", "Sport", Material.STEEL, 27.5, "Disc", "Key", "Inline-Four", "Dual", "Carburetor");

        m1.start();
        System.out.println("Bike color: " + m1.getColor());
        System.out.println("Bike classification: " + m1.getClassifcation());
        System.out.println("Frame material: " + m1.getFrameMaterial());
        System.out.println("Wheel size: " + m1.getWheelSize());
        System.out.println("Brake Type: " + m1.getBrakesType());
        System.out.println("Electronics Type: " + m1.getElectronicsType());
        System.out.println("Engine Type: " + m1.getEngineType());
        System.out.println("Exhaust Type: " + m1.getExhaustType());
        System.out.println("Frame Type: " + m1.getFuelSystemType());
        m1.stop();
        System.out.println();

        m2.start();
        System.out.println("Bike color: " + m2.getColor());
        System.out.println("Bike classification: " + m2.getClassifcation());
        System.out.println("Frame material: " + m2.getFrameMaterial());
        System.out.println("Wheel size: " + m2.getWheelSize());
        System.out.println("Brake Type: " + m2.getBrakesType());
        System.out.println("Electronics Type: " + m2.getElectronicsType());
        System.out.println("Engine Type: " + m2.getEngineType());
        System.out.println("Exhaust Type: " + m2.getExhaustType());
        System.out.println("Frame Type: " + m2.getFuelSystemType());
        m2.stop();
        System.out.println();

        m3.start();
        System.out.println("Bike color: " + m3.getColor());
        System.out.println("Bike classification: " + m3.getClassifcation());
        System.out.println("Frame material: " + m3.getFrameMaterial());
        System.out.println("Wheel size: " + m3.getWheelSize());
        System.out.println("Brake Type: " + m3.getBrakesType());
        System.out.println("Electronics Type: " + m3.getElectronicsType());
        System.out.println("Engine Type: " + m3.getEngineType());
        System.out.println("Exhaust Type: " + m3.getExhaustType());
        System.out.println("Frame Type: " + m3.getFuelSystemType());
        m3.stop();
    }
}
