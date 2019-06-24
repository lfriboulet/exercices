package fr.fiveteam;

import fr.fiveteam.model.Forest;
import fr.fiveteam.model.Hunter;
import fr.fiveteam.model.Rabbit;
import fr.fiveteam.model.Terrier;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercise4 {

    public static void main(String[] args) {

        Hunter hunter = new Hunter(10,10, new Point(5, 5));

        Rabbit rabbit1 = new Rabbit(40, Color.WHITE, new Point(8, 5));
        Rabbit rabbit2 = new Rabbit(50, Color.DARK_GRAY, new Point(6, 8));
        Rabbit rabbit3 = new Rabbit(45, Color.DARK_GRAY, new Point(7, 7));

        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.addAll(Arrays.asList(rabbit1, rabbit2, rabbit3));

        Terrier terrier1 = new Terrier(new Point(5, 10), false);
        Terrier terrier2 = new Terrier(new Point(10, 10), false);
        Terrier terrier3 = new Terrier(new Point(15, 10), false);
        Terrier terrier4 = new Terrier(new Point(20, 10), true);

        List<Terrier> terriers = new ArrayList<>();
        terriers.addAll(Arrays.asList(terrier1, terrier2, terrier3, terrier4));

        Forest forest = new Forest(10, 1000);
        forest.setRabbits(rabbits);
        forest.setTerriers(terriers);

        hunter.hunt(rabbits, terriers);
    }
}
