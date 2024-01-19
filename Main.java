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
        MotorBike m1 = new MotorBike("Red", "Medium", Material.ALUMINUM, 26.0);
        MotorBike m2 = new MotorBike("Yellow", "Small", Material.TITATNIUM, 29.0);
        MotorBike m3 = new MotorBike("Blue", "Medium", Material.STEEL, 27.5);

        m1.start();
        System.out.println("Bike color: " + m1.getColor());
        System.out.println("Bike size: " + m1.getSize());
        System.out.println("Frame material: " + m1.getFrameMaterial());
        System.out.println("Wheel size: " + m1.getWheelSize());
        m1.stop();
        System.out.println();

        m2.start();
        System.out.println("Bike color: " + m2.getColor());
        System.out.println("Bike size: " + m2.getSize());
        System.out.println("Frame material: " + m2.getFrameMaterial());
        System.out.println("Wheel size: " + m2.getWheelSize());
        m2.stop();
        System.out.println();

        m3.start();
        System.out.println("Bike color: " + m3.getColor());
        System.out.println("Bike size: " + m3.getSize());
        System.out.println("Frame material: " + m3.getFrameMaterial());
        System.out.println("Wheel size: " + m3.getWheelSize());
        m3.stop();
    }
}
