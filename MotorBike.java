class MotorBike {
    private String mColor;
    private String mClass;
    private Frame mFrame;
    private Wheel mWheels;
    private Brakes mBrakes;
    private Electronics mElectronics;
    private Engine mEngine;
    private Exhaust mExhaust;
    private FuelSystem mFuelSystem;
    public MotorBike(String color, String classification, Material frameMaterial, double wheelSize,String brakes,String electronics,String engine,String exhaust, String fuelSystem) {
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

    public String getColor(){
        return mColor;
    }
    public void setColor(String colorType) {
        mColor = colorType;
    }

    public String getClassifcation(){
        return mClass;
    }
    public void setClassifcation(String classType) {
        mClass = classType;
    }

    public Material getFrameMaterial(){
        return mFrame.getMaterial();
    }

    public double getWheelSize(){
        return mWheels.getSize();
    }

    public String getBrakesType(){
        return mBrakes.getBrakes();
    }

    public String getElectronicsType(){
        return mElectronics.getElectronics();
    }

    public String getEngineType(){
        return mEngine.getEngine();
    }

    public String getExhaustType(){
        return mExhaust.getExhaust();
    }

    public String getFuelSystemType(){
        return mFuelSystem.getFuelSystem();
    }


    public void start() {
        System.out.println("Bike started!");
    }
    public void stop() {
        System.out.println("Bike stopped.");
    }
}
