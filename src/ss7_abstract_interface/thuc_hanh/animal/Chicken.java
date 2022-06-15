package ss7_abstract_interface.thuc_hanh.animal;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "Gà gáy ò ó o";
    }

    @Override
    public String howToEat() {
        return "Mổ thóc";
    }
}
