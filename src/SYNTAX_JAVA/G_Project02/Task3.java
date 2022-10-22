package SYNTAX_JAVA.G_Project02;

public class Task3 {
    /*
    Create a Class Car that would have the following fields:
    'carPrice' and 'color' and 'method calculateSalePrice()'
    which should be returning a price of the car.
    Create 2 subclasses: Sedan and Truck.

    The Truck class has a field as 'weight' and has its own implementation of 'calculateSalePrice() method'
    in which returned price is calculated as following: 'if weight>2000'
    then returned price car should include 10% discount, otherwise 20% discount.

    The Sedan class has field as length and also does its own implementation of calculateSalePrice():
    if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
     */

    public static void main(String[] args) {
        Car[] cars = {new Sedan(35000, 14),
                new Truck(60000, 5440)
        };
        for (Car carDiscount : cars) {
            System.out.println("the actual price: " + carDiscount.carPrice +
                    ", the discounted price is: " + carDiscount.calculateSalePrice());
        }
    }
}

class Car {
    double carPrice;
    String color;

    Car(double carPrice) {  //String color, not needed
        this.carPrice = carPrice;
    }

    double calculateSalePrice() {
        return 0; // need return value 0, because not void
    }
}

class Sedan extends Car {
    int length;

    Sedan(double carPrice, int length) {    //add int length
        super(carPrice);
        this.length = length;   //add int length to sedan constructor
    }

    double calculateSalePrice() {
        if (length > 20) {
            return (carPrice - (carPrice * 5 / 100));
        } else {
            return (carPrice - (carPrice * 10 / 100));
        }
    }
}

class Truck extends Car {
    int weight;

    Truck(double carPrice, int weight) {
        super(carPrice);
        this.weight = weight;
    }

    double calculateSalePrice() {
        if (weight > 2000) {
            return (carPrice - (carPrice * 10 / 100));
        } else {
            return (carPrice - (carPrice * 20 / 100));
        }
    }
}