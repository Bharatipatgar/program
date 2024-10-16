public class Bicycle {
    int gear;
    int speed;
    String brand;
    String color;

    
    public Bicycle() {
        System.out.println("No parameterized constructor");
    }

    
    public Bicycle(int gear, int speed, String brand, String color) {
        this.gear = gear;
        this.speed = speed;
        this.brand = brand;
        this.color = color;
    }

    
    public void changeGear() {
        System.out.println("Gear changed to: " + gear);
    }

    
    public void applyBrakes() {
        System.out.println("Brakes applied. Current speed: " + speed + " km/h");
    }

    
    public void speedUp() {
        System.out.println("Speed increased. Current speed: " + speed + " km/h");
    }  
    
    public void BicycleInfo() {
        System.out.println("gear: " + gear);
        System.out.println("speed: " + speed);
        System.out.println("brand: " + brand);
        System.out.println("color: " + color);
    }
}
