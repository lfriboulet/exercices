package fr.fiveteam.model;

import java.awt.*;

public class Terrier {

    private Point position;
    private boolean taken;

    public Terrier(Point position, boolean taken) {
        this.position = position;
        this.taken = false;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public boolean isTaken() {
        return taken;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }
}

