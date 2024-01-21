/**
 * Represents a motorbike with various components defining its characteristics and functionality.
 */
class MotorBike {
    /**
     * The color of the motorbike.
     */
    private String mColor;

    /**
     * The class or type of the motorbike (e.g., sport, cruiser).
     */
    private String mClass;

    /**
     * The frame of the motorbike, characterized by its material.
     */
    private Frame mFrame;

    /**
     * The wheels of the motorbike, characterized by their size.
     */
    private Wheel mWheels;

    /**
     * The brakes of the motorbike, characterized by their type.
     */
    private Brakes mBrakes;

    /**
     * The electronics of the motorbike, characterized by the type of electronic starter.
     */
    private Electronics mElectronics;

    /**
     * The engine of the motorbike, characterized by its type.
     */
    private Engine mEngine;

    /**
     * The exhaust system of the motorbike, characterized by its type.
     */
    private Exhaust mExhaust;

    /**
     * The fuel system of the motorbike, characterized by its type (e.g., fuel-injected, carburetor).
     */
    private FuelSystem mFuelSystem;

    /**
     * Constructor to create a new MotorBike with specified characteristics and components.
     *
     * @param color The color of the motorbike.
     * @param classification The class or type of the motorbike.
     * @param frameMaterial The material of the motorbike's frame.
     * @param wheelSize The size of the motorbike's wheels.
     * @param brakes The type of the motorbike's braking system.
     * @param electronics The type of the motorbike's electronic system.
     * @param engine The type of the motorbike's engine.
     * @param exhaust The type of the motorbike's exhaust system.
     * @param fuelSystem The type of the motorbike's fuel system.
     */
    public MotorBike(String color, String classification, Material frameMaterial, double wheelSize, String brakes, String electronics, String engine, String exhaust, String fuelSystem) {
        mColor = color;
        mClass = classification;
        mFrame = new Frame(frameMaterial);
        mWheels = new Wheel(wheelSize);
        mBrakes = new Brakes(brakes);
        mElectronics = new Electronics(electronics);
        mEngine = new Engine(engine);
        mExhaust = new Exhaust(exhaust);
        mFuelSystem = new FuelSystem(fuelSystem);
    }

    /**
     * Retrieves the color of the motorbike.
     *
     * @return The current color of the motorbike.
     */
    public String getColor() {
        return mColor;
    }

    /**
     * Sets the color of the motorbike to a new value.
     *
     * @param colorType The new color to be set for the motorbike.
     */
    public void setColor(String colorType) {
        mColor = colorType;
    }

    /**
     * Retrieves the classification or type of the motorbike.
     *
     * @return The current classification of the motorbike.
     */
    public String getClassification() {
        return mClass;
    }

    /**
     * Sets the classification or type of the motorbike to a new value.
     *
     * @param classType The new classification to be set for the motorbike.
     */
    public void setClassification(String classType) {
        mClass = classType;
    }

    /**
     * Retrieves the material of the frame of the motorbike.
     *
     * @return The material of the frame.
     */
    public Material getFrameMaterial() {
        return mFrame.getMaterial();
    }

    /**
     * Retrieves the size of the wheels of the motorbike.
     *
     * @return The size of the wheels.
     */
    public double getWheelSize() {
        return mWheels.getSize();
    }

    /**
     * Retrieves the type of brakes of the motorbike.
     *
     * @return The type of the brakes.
     */
    public String getBrakesType() {
        return mBrakes.getBrakes();
    }

    /**
     * Retrieves the type of electronic system of the motorbike.
     *
     * @return The type of the electronic system.
     */
    public String getElectronicsType() {
        return mElectronics.getElectronics();
    }

    /**
     * Retrieves the type of engine of the motorbike.
     *
     * @return The type of the engine.
     */
    public String getEngineType() {
        return mEngine.getEngine();
    }

    /**
     * Retrieves the type of exhaust system of the motorbike.
     *
     * @return The type of the exhaust system.
     */
    public String getExhaustType() {
        return mExhaust.getExhaust();
    }

    /**
     * Retrieves the type of fuel system of the motorbike.
     *
     * @return The type of the fuel system.
     */
    public String getFuelSystemType() {
        return mFuelSystem.getFuelSystem();
    }

    /**
     * Starts the motorbike, indicating its readiness for operation.
     */
    public void start() {
        System.out.println("Bike started!");
    }

    /**
     * Stops the motorbike, indicating that it is no longer in operation.
     */
    public void stop() {
        System.out.println("Bike stopped.");
    }
}

