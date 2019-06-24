package fr.fiveteam.model;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    private List<Terrier> terriers;
    private List<Rabbit> rabbits;
    private double area;
    private int tree;

    public Forest(double area, int tree) {
        this.area = area;
        this.tree = tree;
        this.terriers = new ArrayList<>();
        this.rabbits = new ArrayList<>();
    }

    public List<Terrier> getTerriers() {
        return terriers;
    }

    public void setTerriers(List<Terrier> terriers) {
        this.terriers = terriers;
    }

    public List<Rabbit> getRabbits() {
        return rabbits;
    }

    public void setRabbits(List<Rabbit> rabbits) {
        this.rabbits = rabbits;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getTree() {
        return tree;
    }

    public void setTree(int tree) {
        this.tree = tree;
    }
}
