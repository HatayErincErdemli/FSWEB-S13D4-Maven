package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;
    public Player(String name, int healthPercentage, Weapon weapon){
        this.healthPercentage = healthPercentage;
        if (healthPercentage > 100){this.healthPercentage = 100;}else if (healthPercentage < 0){this.healthPercentage = 0;}
        this.name = name;
        this.weapon = weapon;
    }
    public int healthRemaining(){
        return this.healthPercentage;
    }
    public void loseHealth(int damage){
        int healthRemaining = healthPercentage - damage;
        if (healthRemaining < 0){System.out.println(name + " player has been knocked out of game");}
        healthPercentage = healthRemaining;
        if (healthPercentage > 100){healthPercentage = 100;}else if (healthPercentage < 0){healthPercentage = 0;}
    }
    public void restoreHealth(int healthPotion){
        healthPercentage+= healthPotion;
        if (healthPercentage > 100){healthPercentage = 100;}
    }
}
