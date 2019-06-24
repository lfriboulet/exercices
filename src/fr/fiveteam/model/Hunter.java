package fr.fiveteam.model;

import java.awt.*;
import java.util.List;

public class Hunter {

    private int shotAttempt;
    private int hungerLevel;
    private int kilometerDone;
    private Point position;

    public Hunter(int shotAttempt, int hungerLevel, Point position) {
        this.shotAttempt = shotAttempt;
        this.hungerLevel = hungerLevel;
        this.position = position;
        this.kilometerDone = 0;
    }

    public int getShotAttempt() {
        return shotAttempt;
    }

    public void setShotAttempt(int shotAttempt) {
        this.shotAttempt = shotAttempt;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
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

    public void hunt(List<Rabbit> rabbits, List<Terrier> terriers) {

        while (this.getShotAttempt() > 0) {
            System.out.println("Remaining shots " + this.getShotAttempt());
            rabbits.forEach(rabbit -> {

                if (rabbit.getPosition().getY() == this.getPosition().getY()) {
                    System.out.println("A rabbit is on the same vertical (Y) axe than hunter");
                    this.setShotAttempt(this.getShotAttempt() - 1);
                    this.setKilometerDone(this.getKilometerDone() + 1);
                    rabbit.setKilometerDone(rabbit.getKilometerDone() + 2);
                    rabbit.continued();
                    this.move();
                } else {
                    terriers.forEach(terrier -> {
                        if (terrier.getPosition().getX() == rabbit.getPosition().getX() && terrier.getPosition().getY() == rabbit.getPosition().getY()) {
                            System.out.println("Rabbit has found a terrier");
                        } else {
                            rabbit.continued();
                            this.move();
                        }
                    });
                }

                if (rabbit.getPosition().getX() == this.getPosition().getX()) {
                    System.out.println("A rabbit is on the same horizontal (X) axe than hunter");
                    this.setShotAttempt(this.getShotAttempt() - 1);
                    this.setKilometerDone(this.getKilometerDone() + 1);
                    rabbit.setKilometerDone(rabbit.getKilometerDone() + 2);
                    rabbit.continued();
                    this.move();
                } else {
                    terriers.forEach(terrier -> {
                        if (terrier.getPosition().getX() == rabbit.getPosition().getX() && terrier.getPosition().getY() == rabbit.getPosition().getY()) {
                            System.out.println("Rabbit has found a terrier");
                        } else {
                            rabbit.continued();
                            this.move();
                        }
                    });
                }
            });
        }
    }

    public void move() {
        int newXPosition = (int) (Math.random() * 2); // random value between 0 and 1 inclusive
        int newYPosition = (int) (Math.random() * 2); // random value between 0 and 1 inclusive
        this.position.setLocation(newXPosition, newYPosition);
    }

}
