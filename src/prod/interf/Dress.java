package prod.interf;

import prod.Size;

/**
 * @author yuriismac on 2020-11-17.
 * @project lesson3_Generics
 */
public class Dress extends Clothes implements WomenClothes {

    private String name;

    public Dress(Size size, double price, String color, String name) {
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
        return "Dress{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String putWomenOn() {
        return "Give the women a dress";
    }
}
