package prod.interf;

import prod.Size;

/**
 * @author yuriismac on 2020-11-17.
 * @project lesson3_Generics
 */
public class Thirt extends Clothes implements MenClothes, WomenClothes {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Thirt(Size size, double price, String color, String name) {
        super(size, price, color);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Thirt{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String putMenOn() {
        return "Give the men some Tshirt";
    }

    @Override
    public String putWomenOn() {
        return "Give the women some Tshirt";
    }
}
