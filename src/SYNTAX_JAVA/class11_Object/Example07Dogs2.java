package SYNTAX_JAVA.class11_Object;

public class Example07Dogs2 {
    String breed;
    String name;
    String color;

    void attributes() {
        switch (name) {
            case "dork" -> {
                System.out.println(breed + " can bark");
                System.out.println(breed + " can run");
                System.out.println(breed + " can play");
            }
            case "york" -> {
                System.out.println(breed + " can bark");
                System.out.println(breed + " can run");
                System.out.println(breed + " can play");
            }
            case "pork" -> {
                System.out.println(breed + " can bark");
                System.out.println(breed + " can run");
                System.out.println(breed + " can play");
            }
        }
    }

    public static void main(String[] args) {


        Example07Dogs2 hDog = new Example07Dogs2();
        hDog.breed = "Husky";
        hDog.name = "dork";
        hDog.color = "Whitetissue";
        Example07Dogs2 bDog = new Example07Dogs2();
        bDog.breed = "Bulldog";
        bDog.name = "dork";
        bDog.color = "wetpoop";
        Example07Dogs2 lDog = new Example07Dogs2();
        lDog.breed = "Labrador";
        lDog.name = "dork";
        lDog.color = "cheapGold";

        hDog.attributes();
        bDog.attributes();
        lDog.attributes();
    }}