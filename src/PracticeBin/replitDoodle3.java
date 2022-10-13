package PracticeBin;

public class replitDoodle3 {
    //  class Dogs {
    String breed;
    String name;
    String color;

    void attributes() {
        if (name.equals("dork")) {
            System.out.println(breed + " can bark");
            System.out.println(breed + " can run");
            System.out.println(breed + " can play");
        } else if (name.equals("york")) {
            System.out.println(breed + " can bark");
            System.out.println(breed + " can run");
            System.out.println(breed + " can play");
        } else if (name.equals("pork")) {
            System.out.println(breed + " can bark");
            System.out.println(breed + " can run");
            System.out.println(breed + " can play");
        }
    }

    public static void main(String[] args) {


        replitDoodle3 hDog = new replitDoodle3();
        hDog.breed = "Husky";
        hDog.name = "dork";
        hDog.color = "Whitetissue";
        hDog.attributes();

        hDog.breed = "Bulldog";
        hDog.name = "dork";
        hDog.color = "wetpoop";
        hDog.attributes();

        hDog.breed = "Labrador";
        hDog.name = "dork";
        hDog.color = "cheapGold";
        hDog.attributes();

    }

        }
//}

