package com.in28minutes.learnspringin10steps;

import com.in28minutes.learnspringin10steps.enterprise.example.web.MyWebController;
import com.in28minutes.learnspringin10steps.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringIn10StepsApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(
      LearnSpringIn10StepsApplication.class,
      args
    );
    // MarioGame game = new MarioGame();
    // SuperContraGame game = new SuperContraGame();
    // PacManGame game = new PacManGame();
    // GamingConsole game = new MarioGame();
    // GameRunner runner = new GameRunner(game);
    // runner.run();
    GameRunner runner = context.getBean(GameRunner.class);
    runner.run();
    MyWebController controller = context.getBean(MyWebController.class);
    System.out.println(controller.returnValueFromBusinessService());
  }
}
