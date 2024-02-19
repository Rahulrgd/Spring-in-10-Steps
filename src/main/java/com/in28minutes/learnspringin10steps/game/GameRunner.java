package com.in28minutes.learnspringin10steps.game;

public class GameRunner {

    private SuperContraGame game;
    public GameRunner(SuperContraGame game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
