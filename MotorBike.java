class MotorBike {
    private String mColor;
    private String mSize;
    private Frame mFrame;
    private Wheel mWheels;
    public MotorBike(String color, String size, Material frameMaterial, double wheelSize) {
        mColor = color;
        mSize = size;
        mFrame = new Frame(frameMaterial);
        mWheels = new Wheel(wheelSize);
    }

    public String getColor(){
        return mColor;
    }
    public void setEngine(String engineType) {
        engine = engineType;
    }

    public String getSize(){
        return mSize;
    }
    public void setEngine(String engineType) {
        engine = engineType;
    }

    public Material getFrameMaterial(){
        return mFrame.getMaterial();
    }

    public double getWheelSize(){
        return mWheels.getSize();
    }


    public void start() {
        System.out.println("Bike started!");
    }
    public void stop() {
        System.out.println("Bike stopped.");
    }
}
