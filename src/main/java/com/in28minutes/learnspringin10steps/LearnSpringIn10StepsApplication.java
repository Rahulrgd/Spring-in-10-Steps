package com.in28minutes.learnspringin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.learnspringin10steps.game.GameRunner;
import com.in28minutes.learnspringin10steps.game.MarioGame;
import com.in28minutes.learnspringin10steps.game.PacManGame;
import com.in28minutes.learnspringin10steps.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringIn10StepsApplication {

	public static void main(String[] args) {
		// SpringApplication.run(LearnSpringIn10StepsApplication.class, args);
		// MarioGame game = new MarioGame();
		PacManGame game = new PacManGame();
		// SuperContraGame game = new SuperContraGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
