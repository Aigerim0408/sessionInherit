package main;

import cars.*;

public class Main {
    public static void main(String[] args) {
        Toyota[] toyota = new Toyota[]{new Toyota("Toyota", "camry",
                "black", 2023, 2, "gas"), new Toyota("Toyota", "Corolla",
                "Grey", 2022, 3, "oil")};
        for (Toyota toyota1 : toyota) {
            toyota1.traficLight();
            System.out.println(toyota1);
        }
        System.out.println();
        BMW[] bmw = new BMW[]{new BMW("BmW", "X5", "Whight", 2021, 4,
                "200 km per hour"), new BMW("BMW", "X6", "Pink", 2020, 3,
                "250 km per our")};
        for (BMW bmw1 : bmw) {
            bmw1.traficLight();
            System.out.println(bmw1);
        }
        System.out.println();
        Lexus[] lexus = new Lexus[]{new Lexus("cars.Lexus", "GX 470", "Red", 2022,
                4, "GRP"), new Lexus("cars.Lexus", "LX 570", "Black", 2023,
                4, "HRT")};
        for (Lexus lexus1 : lexus) {
            System.out.println(lexus1);
        }
        System.out.println();
        Mercedes[] mercedes = new Mercedes[]{new Mercedes("Mercedes", "W210", "Red",
                2022, 4, "Left hand ride"), new Mercedes("Mercedes", "W210",
                "Brown", 2022, 4, "Left hand ride")};
        for (Mercedes mercedes1 : mercedes) {
            System.out.println(mercedes1);
        }
        System.out.println();
        Honda[] honda = new Honda[]{new Honda("Honda", "Accord", "Whight",
                2023, 2),new Honda("Honda", "Fit", "Black",
                2021, 2)};
        for (Honda honda1 : honda) {
            System.out.println(honda1);
        }
    }
}