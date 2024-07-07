package org.happyisland;

import org.happyisland.problem.HappyIsland;
import org.happyisland.problem.IO.Output;

public class Main {

    public static void main(String[] args) {
        HappyIsland happyIsland = new HappyIsland();
        try {
            happyIsland.run();
        } catch (IllegalArgumentException e) {
            Output.displayError();
        }
    }
}