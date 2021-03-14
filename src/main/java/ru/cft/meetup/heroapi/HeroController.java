package ru.cft.meetup.heroapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HeroController {
  private static final String[] HEROES = {"Tony Stark", "SpiderMan", "Hulk", "Dr.Strange"};

  @GetMapping("hero")
  public String findHero() {
    return HEROES[new Random().nextInt(HEROES.length)];
  }
}
