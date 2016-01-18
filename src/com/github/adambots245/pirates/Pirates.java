package com.github.adambots245.pirates;
public class Pirates{


  private static String[] piratePhrases = {"Argh!", "Ahoy!", "Land ho!", "Matey!", "Walk the plank!", "I have AIDS from too much forking!", "Do you have that torrent file?","Andy McClutchen is good as the dickens","No SOPA"};


  public static String getRandomPiratePhrase(){
    int maxIndex = piratePhrases.length;
//All the real pirates eat pretzels.
    return piratePhrases[(int) (Math.random() * maxIndex)];
  }
}
