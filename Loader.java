
public class Loader
{
    public static void main(String[] args)
    {
        Cat Murka = new Cat();
        System.out.println("Вес Мурки " + Murka.getWeight());
    Cat Vasya = Cat.getKitten();
        System.out.println("Вес Васи " + Vasya.getWeight());
        Cat Persik = Cat.getKitten();
        System.out.println("Вес Персика " + Persik.getWeight());
        Cat Sonya = Cat.getKitten();
        System.out.println("Вес Сони " + Sonya.getWeight());
    }
}