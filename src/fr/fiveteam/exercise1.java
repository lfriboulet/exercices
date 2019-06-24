package fr.fiveteam;

import com.oracle.tools.packager.Log;
import fr.fiveteam.model.Company;
import fr.fiveteam.model.Office;
import fr.fiveteam.model.OfficeDevelopper;
import fr.fiveteam.model.OfficeSale;

public class exercise1 {

    public static void main(String[] args) {

        Company company = new Company();
        company.officeSale1 = new OfficeSale(20,20, 20, 30,15);
        company.officeSale2 = new OfficeSale(30,30, 30, 50,25);
        company.officeSale3 = new OfficeSale(40,40, 40, 70,40);

        company.officeDevelopper1 = new OfficeDevelopper(20,20, 20, 30,15);
        company.officeDevelopper2 = new OfficeDevelopper(40,40, 40, 70,40);

        boolean flagOfficeSale1 = true;
        boolean flagOfficeSale2 = true;
        boolean flagOfficeSale3 = true;
        boolean flagOfficeDeveloper1 = true;
        boolean flagOfficeDeveloper2 = true;

        while (flagOfficeSale1 || flagOfficeSale2 || flagOfficeSale3 || flagOfficeDeveloper1 || flagOfficeDeveloper2) {

            // populate sale office number 1

            if (company.officeSale1.getAvailableSpace() > 0) {
                company.officeSale1.addSeller();
                int currentPersonOfficeSale1 = company.officeSale1.getPerson();
                company.officeSale1.setPerson(currentPersonOfficeSale1 + 1);
            } else {
                flagOfficeSale1 = false;
            }

            // populate sale office number 2

            if (company.officeSale2.getAvailableSpace() > 0) {
                company.officeSale2.addSeller();
                int currentPersonOfficeSale2 = company.officeSale2.getPerson();
                company.officeSale2.setPerson(currentPersonOfficeSale2 + 1);
            } else {
                flagOfficeSale2 = false;
            }

            // populate sale office number 3

            if (company.officeSale3.getAvailableSpace() > 0) {
                company.officeSale3.addSeller();
                int currentPersonOfficeSale3 = company.officeSale3.getPerson();
                company.officeSale3.setPerson(currentPersonOfficeSale3 + 1);
            } else {
                flagOfficeSale3 = false;
            }

            // populate dev office number 1

            if (company.officeDevelopper1.getAvailableSpace() > 0) {
                company.officeDevelopper1.addDevelopper();
                int currentPersonOfficeDev1 = company.officeDevelopper1.getPerson();
                company.officeDevelopper1.setPerson(currentPersonOfficeDev1 + 1);
            } else {
                flagOfficeDeveloper1 = false;
            }

            // populate dev office number 1

            if (company.officeDevelopper2.getAvailableSpace() > 0) {
                company.officeDevelopper2.addDevelopper();
                int currentPersonOfficeDev2 = company.officeDevelopper2.getPerson();
                company.officeDevelopper2.setPerson(currentPersonOfficeDev2 + 1);
            } else {
                flagOfficeDeveloper2 = false;
            }
            company.getAvailableSpace();
       }
    }
}
