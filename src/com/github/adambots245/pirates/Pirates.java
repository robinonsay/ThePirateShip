package com.github.adambots245.pirates;

public class Pirates{

  private static String[] piratePhrases = {"arg", "Ahoy!", "LandHo!"};

  public static String getRandomPiratePhrase(){
    int maxIndex = piratePhrases.length;
//All the real pirates eat pretzels.
    return piratePhrases[(int) (Math.random() * maxIndex)];
  }
}
