package animals;

import enums.CageSize;
import exceptions.WrongFoodException;
import food.Food;
import food.Grass;

public abstract class Herbivore extends Animals{


    public Herbivore(String name, float age, int satiety) {
        super(name, age, satiety);
    }

    @Override
    public String eat(Food food) {
        try {
            if (food instanceof Grass) {
                return "животное покушало";
            } else {
                throw new WrongFoodException("Ошибка! животное такую еду не ест.");
            }
        } catch (WrongFoodException ex) {ex.printStackTrace();}
        return null;
    }

}