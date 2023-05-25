package GroupProject2;

public class Car {
    double carPrice;
    String color;
    double calculateSalePrice(){
        return carPrice;
    }

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }
}
class Sedan extends Car {
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if (length>20){
            double discountedCarPrice = carPrice-(carPrice*5/100);
            return (discountedCarPrice);
        } else {
            double discountedCarPrice = carPrice-(carPrice*10/100);
            return (discountedCarPrice);
        }
    }
}
class Truck extends Car{
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight>2000){
           double discountedCarPrice = carPrice-(carPrice*10/100);
            return (discountedCarPrice);
        } else{
            double discountedCarPrice = carPrice-(carPrice*20/100);
            return (discountedCarPrice);
        }
    }
}
class CarTester {
    public static void main(String[] args) {
        Sedan obj1 = new Sedan (35000,"grey",8);
        Truck obj2 = new Truck(34000,"black",2087);

        System.out.println(obj1.calculateSalePrice());
        System.out.println(obj2.calculateSalePrice());
    }
}
