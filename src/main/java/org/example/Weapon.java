package org.example;

public enum Weapon {
    SWORD(3,3), AXE(4,2), BOW(2,4), STAFF(5,1);
    private int damage;
    private double attackSpeed;
    public int getDamage() {
        return damage;
    }
    public double getAttackSpeed(){
        return attackSpeed;
    }
    Weapon(int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
}
