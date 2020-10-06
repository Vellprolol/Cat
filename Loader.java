
public class Loader
{
    public static void main(String[] args)
    {

        Cat vasya = new Cat();
        System.out.println("Вес Васи " + vasya.getWeight());
        vasya.feed(150.1);
        System.out.println("Вес Васи " + vasya.getWeight());
        vasya.feed (10000.1);
        System.out.println("Вес Васи " + vasya.getWeight());
        vasya.feed (150.1);
        System.out.println("Вес Васи " + vasya.getWeight());
        Cat sonya = new Cat();
        Cat dasha = new Cat();
        Cat persik = new Cat();
        Cat masha = new Cat();
        System.out.println("Всего кошек " + Cat.getCount());
    }
}