package prod.interf;

import prod.Size;

/**
 * @author yuriismac on 2020-11-17.
 * @project lesson3_Generics
 */
public class Pants extends Clothes implements MenClothes, WomenClothes {

    private String name;

    public Pants(Size size, double price, String color, String name) {
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
        return "Pants{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String putMenOn() {
        return "AAA give the men some pants ASAP!";
    }

    @Override
    public String putWomenOn() {
        return "Uuumm let me see first and then give her the pants";
    }
}
