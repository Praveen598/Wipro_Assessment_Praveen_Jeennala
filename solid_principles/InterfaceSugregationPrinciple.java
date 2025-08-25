interface HornFeature {
    void horn();
}


interface WindowFeature {
    void openWindows();
}

interface WheelFeature {
    void roll();
}

class Car implements HornFeature, WindowFeature {
    public void horn() {
        System.out.println("Car horn: Beep Beep!");
    }

    public void openWindows() {
        System.out.println("Car windows opening...");
    }

}
class InterfaceSugregationPrinciple{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.openWindows();
        c1.horn();
    }
}
