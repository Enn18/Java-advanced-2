package org.example;

public class LetsDoEnums2 {
    enum Flavor {
        CHOCOLATE, VANILLA, STRAWBERRY
    }
 //Enums are list of things that do not change
    public static void main(String[] args) {
        Flavor flav = Flavor.VANILLA;

        if (flav == flav.VANILLA) {
            System.out.println("It is vanilla");
        } else if (flav == flav.CHOCOLATE) {
            System.out.println("It is chocolate");
        } else if (flav == flav.STRAWBERRY) {
            System.out.println("IT is strawberry");
        }
    }
}
