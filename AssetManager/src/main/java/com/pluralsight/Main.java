package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> portfolio = new ArrayList<Asset>();

        House h1 = new House("My main house",
                "2020-05-05",
                200000,
                "123 Sesame",
                2,
                1500,
                6000);



        portfolio.add(new Asset("Hundred Dollar Bill", "2025-01-01", 100));
        portfolio.add(new Asset("Necklace", "2025-02-14", 225));
        portfolio.add(h1);

        System.out.println("Your portfolio has the following assets:");

        double totalNetworth = 0;

        for(Asset a : portfolio){
            System.out.printf("    %s valued at %.2f\n", a.getDescription(), a.getValue());
            totalNetworth += a.getValue();
        }

        System.out.println("Your net worth is " + totalNetworth);

    }
}