

package org.example._2024_02_23;
public class SuperheroBattle {

    // Main logic of the battle game
    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword", 15);
        Protection armour = new Protection("Armour", 4);
        Superhero spiderman = new Superhero("Spiderman", 2, sword, armour);

        EvilCreature zombie = new EvilCreature("Zombie", 5, 1);
        Mag mag = new Mag("Mag", 56, 89, 2);


        spiderman.introduce();
        zombie.introduce();
        spiderman.fight(zombie);
        mag.applySpell(spiderman,Spell.REVIVE);

        mag.heal(zombie);


        System.out.println("After fight:");
        System.out.println(spiderman);
        System.out.println(zombie);
    }


}