package SYNTAX_JAVA.ReveiwWeek10_ThisOverloading2;


import SYNTAX_JAVA.ReveiwWeek9_ThisOverloading1.Country;

public class USA extends Country {
    USA(String name) {
        super(name);

    }

    public static void main(String[] args) {

        USA usa = new USA("OH USA");
        usa.name = "USA"; //public
        usa.capital = "DC"; //protected
    }
}
