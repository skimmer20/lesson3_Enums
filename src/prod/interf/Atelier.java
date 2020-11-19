package prod.interf;

import java.util.Arrays;

/**
 * @author yuriismac on 2020-11-17.
 * @project lesson3_Generics
 */
public class Atelier {

    private Clothes [] clothes;

    public Atelier(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public Atelier() {

    }

    Clothes[] getClothes() {
        return clothes;
    }

    public void setClothes(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public MenClothes[] getMenClothes(){
        MenClothes[] menClothes = new MenClothes[clothes.length];
        int i = 0;
        for (Clothes items: clothes) {
            if (items instanceof MenClothes){
                menClothes[i] = (MenClothes) items;
                i++;
            }
        }
        return menClothes;
    }

    public WomenClothes[] getWomenClothes(){
        WomenClothes[] womenClothes = new WomenClothes[clothes.length];
        int i = 0;
        for (Clothes items: clothes) {
            if (items instanceof WomenClothes){
                womenClothes[i] = (WomenClothes) items;
                i++;
            }
        }
        return womenClothes;
    }

    @Override
    public String toString() {
        return "Atelier{" +
                "clothes=" + Arrays.toString(clothes) +
                '}';
    }
}
