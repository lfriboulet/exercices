package fr.fiveteam.model;

import com.oracle.tools.packager.Log;

public class Company {

    public OfficeDevelopper officeDevelopper1;
    public OfficeDevelopper officeDevelopper2;

    public OfficeSale officeSale1;
    public OfficeSale officeSale2;
    public OfficeSale officeSale3;

    public void showTotalSellers() {
        int totalSellers = officeSale1.getPerson() + officeSale2.getPerson() + officeSale3.getPerson();
        System.out.println("We are " + totalSellers + " sellers in our company !");
    }

    public void showTotalDeveloppers() {
        int totalDeveloppers = officeDevelopper1.getPerson() + officeDevelopper2.getPerson();
        System.out.println("We are " + totalDeveloppers + " developpers in our company !");
    }

    public void showOverviewAvailableSpace() {
        System.out.println("Developpers office number 1 has " + officeDevelopper1.getAvailableSpace() + " place(s) available");
        System.out.println("Developpers office number 2 has " + officeDevelopper2.getAvailableSpace() + " place(s) available");

        System.out.println("Sellers office number 1 has " + officeSale1.getAvailableSpace() + " place(s) available");
        System.out.println("Sellers office number 2 has " + officeSale2.getAvailableSpace() + " place(s) available");
        System.out.println("Sellers office number 3 has " + officeSale3.getAvailableSpace() + " place(s) available");
    }

    public void getAvailableSpace() {
        this.showTotalDeveloppers();
        this.showTotalSellers();
        this.showOverviewAvailableSpace();
        int total = officeDevelopper1.getAvailableSpace() + officeDevelopper2.getAvailableSpace() + officeSale1.getAvailableSpace() +
                officeSale2.getAvailableSpace() + officeSale3.getAvailableSpace();
        System.out.println("Remaining space available in our company : " + total + " place(s) available");
    }

}
