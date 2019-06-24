package fr.fiveteam.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Office {

    private int networkPlug;
    private int electricalPlug;
    private int phonePlug;
    private double chair;
    private int table;
    private int person;

    public Office(int networkPlug, int electricalPlug, int phonePlug, int chair, int table) {
        this.networkPlug = networkPlug;
        this.electricalPlug = electricalPlug;
        this.phonePlug = phonePlug;
        this.chair = chair;
        this.table = table;
        this.person = 0;
    }

    public int getAvailableSpace() {
        int avaiblableSpace[] = { networkPlug, electricalPlug, phonePlug, (int) chair};
        Arrays.sort(avaiblableSpace);

        return avaiblableSpace[0];
    }

    public int getNetworkPlug() {
        return networkPlug;
    }

    public void setNetworkPlug(int networkPlug) {
        this.networkPlug = networkPlug;
    }

    public int getElectricalPlug() {
        return electricalPlug;
    }

    public void setElectricalPlug(int electricalPlug) {
        this.electricalPlug = electricalPlug;
    }

    public int getPhonePlug() {
        return phonePlug;
    }

    public void setPhonePlug(int phonePlug) {
        this.phonePlug = phonePlug;
    }

    public double getChair() {
        return chair;
    }

    public void setChair(double chair) {
        this.chair = chair;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Office{" +
                "networkPlug=" + networkPlug +
                ", electricalPlug=" + electricalPlug +
                ", phonePlug=" + phonePlug +
                ", chair=" + chair +
                ", table=" + table +
                ", person=" + person +
                '}';
    }
}


