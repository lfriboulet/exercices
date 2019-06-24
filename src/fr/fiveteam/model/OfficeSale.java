package fr.fiveteam.model;

import java.util.Arrays;

public class OfficeSale extends Office {
    public OfficeSale(int networkPlug, int electricalPlug, int phonePlug, int chair, int table) {
        super(networkPlug, electricalPlug, phonePlug, chair, table);
    }

    public int getAvailableSpace() {
        int avaiblableSpace[] = { getNetworkPlug() / 3, getElectricalPlug() / 3, getPhonePlug() / 2, (int) (getChair() / 1.5), getTable() };
        Arrays.sort(avaiblableSpace);

        return avaiblableSpace[0];
    }

    public boolean addSeller() {
        if ( (super.getNetworkPlug() >= 3 ) && (super.getElectricalPlug() >= 3) && (super.getPhonePlug() >= 2) && (super.getChair() >= 1.5) &&
                (super.getTable() > 0) ) {
            super.setNetworkPlug(getNetworkPlug() - 3);
            super.setElectricalPlug(super.getElectricalPlug() - 3) ;
            super.setPhonePlug(super.getPhonePlug() - 2);
            super.setChair(super.getChair() - 1.5);
            super.setTable(super.getTable() - 1);
            return true;
        }
        return false;
    }
}
