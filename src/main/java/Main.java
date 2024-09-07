public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", "Aygo", "blauw", 2016, 1.2f);

        System.out.println(toyota.model);
        System.out.println(toyota.type);
        System.out.println(toyota.year);
        System.out.println(toyota.color);
        System.out.println(toyota.engineVolume);

        toyota.printCar();

        Car fiat = new Car("Fiat", "500", "groen", 2019, 1.4f);

        System.out.println(fiat.model);
        System.out.println(fiat.type);
        System.out.println(fiat.year);
        System.out.println(fiat.color);
        System.out.println(fiat.engineVolume);

        fiat.printCar();

        Car volvo = new Car("Volvo", "CX90", "zwart", 2022, 2.0f);

        System.out.println(volvo.model);
        System.out.println(volvo.type);
        System.out.println(volvo.year);
        System.out.println(volvo.color);
        System.out.println(volvo.engineVolume);

        volvo.printCar();

    }
}
