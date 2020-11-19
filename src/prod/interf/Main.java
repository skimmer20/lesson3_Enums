package prod.interf;

import prod.Size;

import java.util.Arrays;

/**
 * @author yuriismac on 2020-11-18.
 * @project lesson3_Generics
 */
/*1. Створити енум, який містить розміри одягу (XXS, XS, S, M, L).
//        Написати в ньому абстрактий метод getDescription.
//        Оверрайднути метод getDescription для всіх об'єктів енума, який повертатиме стрічку - опис розміра (просто якийсь текст).
//        Додати в енум в поле int euroSize, написати конструктор, який параметром буде приймати значення для поля.
//        2. Створити інтерфейси "Чоловічий одяг" з методом "вдягнути чоловіка" і "Жіночий одяг" з методом "одягнути жінку".
//        3. Створити абстрактний клас Одяг, який має такі поля: розмір одягу (використати створений енум), вартість, колір.
//        4. Створити класи нащадки до класу Одяг - Футболка (реалізує також інтерфейси Чоловічий одяг і Жіночий одяг),
//        Штани (реалізує також інтерфейси Чоловічий одяг і Жіночий одяг), Плаття (реалізує інтерфейс "Жіночий одяг"),
//        Галстук (реалізує інтерфейси Чоловічий одяг).
//        5. Створити клас Ательє, який має полем масив об'єктів Одяг (тобто в ньому можуть бути об'єкти усіх класів-нащадків),
//        та 2 методи - чоловічий вибір (повертає увесь ЧОЛОВІЧИЙ одяг (підказка: instanceof оператор поможе))
//        та жіночий вибір (повертає увесь ЖІНОЧИЙ одяг).*/
public class Main {
    public static void main(String[] args) {

        Clothes [] clothes = new Clothes[20];

        Thirt thirt = new Thirt(Size.XS, 800, "Red", "Ostin");
        Thirt thirt2 = new Thirt(Size.L, 800, "Red", "Ostin");
        Thirt thirt3 = new Thirt(Size.M, 650, "Red", "Ostin");

        Tie tie = new Tie(Size.M, 400,"Black", "HM");
        Tie tie2 = new Tie(Size.M, 340,"Black", "HM");
        Tie tie3 = new Tie(Size.M, 600,"Black", "HM");

        Pants pants = new Pants(Size.L,1200, "Blue", "LTB");
        Pants pants2 = new Pants(Size.L,1230, "Black", "LTB");
        Pants pants3 = new Pants(Size.L,1200, "Green", "HM");

        Dress dress = new Dress(Size.XS,1700,"White", "Zara");
        Dress dress2 = new Dress(Size.XS,1799,"White", "Zara");
        Dress dress3 = new Dress(Size.XS,1500,"Red", "Zara");

        clothes[0] = thirt;
        clothes[1] = thirt2;
        clothes[2] = thirt3;
        clothes[3] = tie;
        clothes[4] = tie2;
        clothes[5] = tie3;
        clothes[6] = dress;
        clothes[7] = pants;
        clothes[8] = pants2;
        clothes[9] = pants3;
        clothes[10] = dress2;
        clothes[11] = dress3;

        Atelier atelier = new Atelier(clothes);
        atelier.setClothes(clothes);

        MenClothes[] menClothes = atelier.getMenClothes();

        System.out.println("--------------Чоловічий одяг---------------");

        for (MenClothes menCloth: menClothes){
            if (menCloth == null){
                break;
            }
            System.out.println(menCloth.putMenOn());
        }
        System.out.println("--------------Жіночий одяг---------------");

        WomenClothes[] womenClothes = atelier.getWomenClothes();

        for (WomenClothes womenCloth: womenClothes){
            if (womenCloth == null){
                break;
            }
            System.out.println(womenCloth.putWomenOn());
        }

        for (Clothes cloth: clothes){
            if (cloth == null){
                break;
            }
            System.out.println(cloth);
            System.out.println(cloth.getSize());
            System.out.println(cloth.getPrice());
            System.out.println(cloth.getColor());
            System.out.println(cloth.getSize().getDescription());

        }
        System.out.println(Size.M.getEuroSize());
        System.out.println(atelier);

    }
}
