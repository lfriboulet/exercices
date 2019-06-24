package fr.fiveteam.model;

import java.util.Arrays;

public class OfficeDevelopper extends Office {

    public OfficeDevelopper(int networkPlug, int electricalPlug, int phonePlug, int chair, int table) {
        super(networkPlug, electricalPlug, phonePlug, chair, table);
    }

    public int getAvailableSpace() {
        int avaiblableSpace[] = { getNetworkPlug(), getElectricalPlug(), getPhonePlug() / 2, (int) (getChair() / 2), getTable()};
        Arrays.sort(avaiblableSpace);

        return avaiblableSpace[0];
    }


    public boolean addDevelopper() {
        if ( (super.getNetworkPlug() > 0 ) && (super.getElectricalPlug() > 0) && (super.getPhonePlug() >= 2) && (super.getChair() >= 2) &&
                (super.getTable() > 0) ) {
            super.setNetworkPlug(getNetworkPlug() - 1);
            super.setElectricalPlug(super.getElectricalPlug() - 1) ;
            super.setPhonePlug(super.getPhonePlug() - 2);
            super.setChair(super.getChair() - 2);
            super.setTable(super.getTable() - 1);
            return true;
        }
        return false;
    }

}
