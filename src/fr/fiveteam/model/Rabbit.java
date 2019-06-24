package fr.fiveteam.model;

import java.awt.*;

public class Rabbit {

    private int speed;
    private Color color;
    private int kilometerDone;
    private Point position;

    public Rabbit(int speed, Color color, Point position) {
        this.speed = speed;
        this.color = color;
        this.kilometerDone = 0;
        this.position = position;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getKilometerDone() {
        return kilometerDone;
    }

    public void setKilometerDone(int kilometerDone) {
        this.kilometerDone = kilometerDone;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public void continued() {
        int newXPosition = (int) (Math.random() * 2) ; // random value between 0 and 1 inclusive
        int newYPosition = (int) (Math.random() * 3); // random value between 0 and 1 inclusive
        this.position.setLocation(newXPosition, newYPosition);
    }

}
