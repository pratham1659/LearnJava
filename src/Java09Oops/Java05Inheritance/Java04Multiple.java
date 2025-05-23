package Java09Oops.Java05Inheritance;

interface Character {
    void attack();
}

interface Weapon {
    void use();
}

class Warrior implements Character, Weapon {
    public void attack() {
        System.out.println("Warrior attacks with a sword.");
    }

    public void use() {
        System.out.println("Warrior uses a sword.");
    }
}

class Mage implements Character, Weapon {
    public void attack() {
        System.out.println("Mage attacks with a wand.");
    }

    public void use() {
        System.out.println("Mage uses a wand.");
    }
}

public class Java04Multiple {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Mage mage = new Mage();
        warrior.attack(); // Output: Warrior attacks with a sword.
        warrior.use(); // Output: Warrior uses a sword.
        mage.attack(); // Output: Mage attacks with a wand.
        mage.use(); // Output: Mage uses a wand.
    }
}