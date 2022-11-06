package SYNTAX_JAVA.class24_CollectionFramework;

//Create a class Insurance that will have an attribute as insuranceName and unimplemented
//behaviour as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class
//has its own attribute as carModel and Class Pet has petType attribute. Create 3 objects of the
//subclasses and store them in ArrayList. Using for loop/advanced for loop/ iterator access all
//methods of the class.
public class hw01_insurance {
    String insuranceName;
    void getQuote(){}
    void cancelInsurance(){}

    hw01_insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }
//    public static void main(String[] args) {
//        Car objCar = new Car();
//        Pet objPet = new Pet("State Farm", "Anaconda");
//        Health objHealth = new Health("Obama Care");
//        ArrayList<String> insuranceList = new ArrayList<>();
//        insuranceList.add(objCar.getQuote("All State", "Civic"));
//        insuranceList.add(objPet);
//        insuranceList.add(objHealth);
//
//        for (int i = 0; i < insuranceList.size(); i++) {
//            System.out.println(insuranceList.toArray());
//
//        }
//    }
}
class Car extends hw01_insurance{
    String carModel;
    Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }
    void getQuote(String insuranceName, String carModel){
        System.out.println(insuranceName+" car insurance quote for "+carModel+" is $99.99 per month");
    }
    void cancelInsurance(){}
}
class Pet extends hw01_insurance{
    String petType;

    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }
    void getQuote(){}
    void cancelInsurance(){}
}
class Health extends hw01_insurance{
    // no attribute assigned
    Health(String insuranceName) {
        super(insuranceName);
    }
    void getQuote(){}
    void cancelInsurance(){}
}

