package prod.interf;

import prod.Size;

/**
 * @author yuriismac on 2020-11-17.
 * @project lesson3_Generics
 */
public class Tie extends Clothes implements MenClothes {

    private String name;

    public Tie(Size size, double price, String color, String name) {
        super(size, price, color);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tie{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String putMenOn() {
        return "Give me a tie";
    }

}
