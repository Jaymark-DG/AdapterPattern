public class Main {
    public static void main(String[] args) {
        // Create Adaptee objects
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger charger = new SmartphoneCharger();

        // Create Adapter objects wrapped around the adaptees
        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);
        PowerOutlet fridgeOutlet = new RefrigeratorAdapter(refrigerator);
        PowerOutlet phoneOutlet = new SmartphoneAdapter(charger);

        // Plug devices into standard power outlets
        System.out.println("Plugging in devices:");
        laptopOutlet.plugin();
        fridgeOutlet.plugin();
        phoneOutlet.plugin();
    }
}

