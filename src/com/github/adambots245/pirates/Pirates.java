package com.github.adambots245.pirates;

public class Pirates{


  private static String[] piratePhrases = {"arg", "Ahoy!", "LandHo!", "Matey", "walk the plank"};

  public static String getRandomPiratePhrase(){
    int maxIndex = piratePhrases.length;

    return piratePhrases[(int) (Math.random() * maxIndex)];
  }
}
