package com.github.adambots245.pirates;

public class Pirates{

<<<<<<< HEAD
<<<<<<< HEAD
  private static String[] piratePhrases = {"arg", "Ahoy!", "LandHo!", "Do you have that torrent file?"};
=======
  private static String[] piratePhrases = {"arg", "Ahoy!", "LandHo!", "Matey", "walk the plank"};
>>>>>>> refs/remotes/Adambots-245/master
=======
  private static String[] piratePhrases = {"Argh!", "Ahoy!", "LandHo!", "Matey", "walk the plank"};
>>>>>>> refs/remotes/Adambots-245/master

  public static String getRandomPiratePhrase(){
    int maxIndex = piratePhrases.length;

    return piratePhrases[(int) (Math.random() * maxIndex)];
  }
}
