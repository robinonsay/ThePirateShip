package com.github.adambots245.pirates;

public class Pirates{

  private static String[] piratePhrases = {"Argh!", "Ahoy!", "LandHo!"};

  public static String getRandomPiratePhrase(){
    int maxIndex = piratePhrases.length;

    return piratePhrases[(int) (Math.random() * maxIndex)];
  }
}
