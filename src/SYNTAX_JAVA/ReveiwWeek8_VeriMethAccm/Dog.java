package SYNTAX_JAVA.ReveiwWeek8_VeriMethAccm;

public class Dog {
    String name;  // instance var
        int weight;   // instance var
        static String breed;  // static ( the breed is same in all objects because it is static)

        void printInfo() {      //void, does not return.
            System.out.println("Dog features:" + name + ", " + weight + ", " + breed);
        }

        /*Create method to return price
         * if weight is more than 5->100
         * if weight is more than 10 ->30
         * if weight is more than 20->1000*/
        float getPrice() {     //returns double.
        if(weight>5){
            return 100;
        }else if (weight <10){
            return 300;
        }else{
            return 1000;
        }
    }
    /*create a method that will re turn bark type
    * if wight less 20 -> noise is wooh
    * if wight less 500 -> noise is gav*/
    String bark(){
        String noise;
        if(weight<5){
            noise = "woof";
        } else if(weight<10){
            noise = "woof woof";
        } else{
            noise = "WOOF WOOF";
        }
        return noise;
    }
    void love(String thing) {
        System.out.println(name+" loves "+thing);
    }

static class Shelter { //changed to static. so it can be work in same file.
    public static void main(String[] args) {
        Dog.breed = "Husky";
        Dog dog1 = new Dog();
        // how to access instance var
        dog1.name = "Bobby";
        dog1.weight = 5;
        dog1.printInfo();  // Dog features:Bobby, 5, Husky

        Dog dog2 = new Dog();
        System.out.println(dog2.name);  // Null
        dog2.name = "Tommy";
        dog2.weight = 10;
        dog2.printInfo();  // Dog features:Tommy, 10, Husky
        System.out.println(dog2.name); // Tommy

        System.out.println("MAKING CHANGES");

        dog1.name = "Bobik";
        dog1.breed = "german";

        dog1.printInfo();  // Dog features:Bobik, 5, german
        dog2.printInfo();  // Dog features:Tommy, 10, german

        String str = "hello";
        int size = str.length();

        double price = dog1.getPrice();
        System.out.println(price);

        double price2 = dog2.getPrice();
        System.out.println(price2);

        System.out.println(dog1.bark());
        System.out.println(dog2.bark());

        dog1.love("to jump");
        dog2.love("to play");

    }
}}