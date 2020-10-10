
public class Loader
{
    public static void main(String[] args)
    {
Cat masha = new Cat(3500, Colours.BROWN);
        System.out.println(masha.getWeight());
        Cat vasya = new Cat(masha.getWeight(), masha.getColour(Colours.BROWN));
        System.out.println(vasya.getWeight());

        Cat sonya = new Cat();
        System.out.println(sonya.getWeight());
        System.out.println(sonya.getColour(Colours.RED));
        Cat murka = new Cat();
        murka.setWeight(sonya.getWeight());
        System.out.println(murka.getWeight());
    }
}