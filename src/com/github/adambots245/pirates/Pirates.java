package com.github.adambots245.pirates;

public class Pirates{

  private static String[] piratePhrases = {"Argh!", "Ahoy!", "Land ho!", "Matey!", "Walk the plank!", "I have AIDS from too much forking!", "Do you have that torrent file?"};


  public static String getRandomPiratePhrase(){
    int maxIndex = piratePhrases.length;

    return piratePhrases[(int) (Math.random() * maxIndex)];
  }
}
