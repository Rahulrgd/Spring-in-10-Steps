package com.in28minutes.learnspringin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.learnspringin10steps.game.GameRunner;
import com.in28minutes.learnspringin10steps.game.GamingConsole;
import com.in28minutes.learnspringin10steps.game.MarioGame;
import com.in28minutes.learnspringin10steps.game.PacManGame;
import com.in28minutes.learnspringin10steps.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringIn10StepsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringIn10StepsApplication.class, args);
		// MarioGame game = new MarioGame();
		// SuperContraGame game = new SuperContraGame();
		// PacManGame game = new PacManGame();
		// GamingConsole game = new MarioGame();
		// GameRunner runner = new GameRunner(game);
		// runner.run();
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}

}
