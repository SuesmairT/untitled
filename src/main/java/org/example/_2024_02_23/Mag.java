package org.example._2024_02_23;

// Добавить класс мага Mag с полями
//	- int force
//	- int protection
//    - int level;
//Маг умеет сражаться, обладает силой и защитой (как EvilCreature)
//8. Добавить магу методы исцеления раненых персонажей:
//    heal(Character character), heal(Character[] characters)
//    методы должны быть вынесены в интерфейс HealingSkills
//9. Добавить магу навыки насылать заклинания на Superhero:
//- Создать enum Spells со значениями CURSE, REVIVE, INSPIRE
//- Добавить магу методы applySpell(Superhero hero, Spell spell), applySpell(Superhero[] heroes, Spell spell)
//    методы должны быть вынесены в интерфейс SpellSkills
//- Заклинание CURSE отнимает здоровье Superhero пропорционально уровню мага по формуле
//    health = health * (1 - 0.1 * level)
//- Заклинание REVIVE лечит Superhero
//- Заклинание INSPIRE увеличивает силу Superhero пропорционально уровню мага по формуле
//    force = force * (1 + 0.1 * level)
//10. Проверить действия мага в методе main() класса SuperheroBattle
public class Mag extends Character implements  HealingSkills, SpellSkills {
    int force;
    int protection;
    int level;

    public Mag(String name, int force, int protection, int level) {
        super(name);
        this.force = force;
        this.protection = protection;
        this.level = level;
    }

    @Override
    public int countForce() {
        return 0;
    }

    @Override
    public int countProtection() {
        return 0;
    }

    @Override
    public  void applySpell(Superhero hero, Spell spell)
    {
        switch (spell){
            case CURSE -> {
//                heal(hero);
//                getHealth() = (int) (getHealth() * (1 - 0.1 * level));

            }
            case REVIVE -> {
                heal(hero);
                            }
            case INSPIRE -> {
//                heal(hero);
//                force = force * (1 + (0.1 * level));

            }
        }
    }
@Override
    public  void applySpell(Superhero[] heroes, Spell spell) {

    }

    @Override
    public void heal(Character character) {
       character.setHealth(100);

    }

    @Override
    public void heal(Character[] characters) {
        for (int i = 0; i < characters.length; i++) {
         heal(characters[i]);

        }
    }
}
