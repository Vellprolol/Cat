
public class Loader
{
    public static void main(String[] args)
    {
Cat Masha = new Cat();
        System.out.println("Вес Маши " + Masha.getWeight());
        Masha.feed(10000.1);
        Masha.feed(10000.1);
        System.out.println("Вес Маши после кормления " + Masha.getWeight());
        Cat Persik = new Cat();
        System.out.println("Вес Персика " + Persik.getWeight());
        Persik.feed(100.1);
        System.out.println("Вес Персика после кормления " + Persik.getWeight());
        System.out.println("Всего кошек: " + Cat.getCount());
        System.out.println("Количество глаз у кошки: " + Cat.getNumberOfCatEyes());
        Persik.setColour(Colours.White);
    }
}