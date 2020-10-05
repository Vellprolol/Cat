
public class Loader
{
    public static void main(String[] args)
    {
Cat Vasya = new Cat();
        System.out.println("Вес Васи " + Vasya.getWeight());
Vasya.pee();
        System.out.println("Вес Васи после похода в туалет " + Vasya.getWeight());
        Vasya.feed(150.1);
        Vasya.feed(150.1);
        System.out.println("Вес Васи после кормления " + Vasya.getWeight());
        System.out.println("Вес съеденного корма " + Vasya.getFoodWeight());
    }
}