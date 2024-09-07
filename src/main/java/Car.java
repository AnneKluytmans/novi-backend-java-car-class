public class Car {
    String model;
    String type;
    String color;
    int year;
    float engineVolume;

    public Car(String model, String type, String color, int year, float engineVolume) {
        this.model = model;
        this.type = type;
        this.color = color;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public void printCar() {
        System.out.println("This " + model + " " + type + " built in " + year + " is " + color +
                " and has an engine volume of " + engineVolume);
    }
}
