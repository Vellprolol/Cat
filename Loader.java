
public class Loader
{
    public static void main(String[] args)
    {
Cat Vasya = new Cat();
        System.out.println("Вес Васи: " + Vasya.getWeight());
        Vasya.feed (15 + Math.random() * 100);
        System.out.println("Вес Васи после кормления: " + Vasya.getWeight());


Cat Murka = new Cat();
        System.out.println("Вес Мурки: " + Murka.getWeight());
        Murka.feed ( 15 + Math.random() * 100);
        System.out.println("Вес Мурки после кормления: " + Murka.getWeight());


Cat Sonya = new Cat();
//Заставляем Соню умереть от переедания
        System.out.println("Вес Сони: " + Sonya.getWeight());
        while (Sonya.getStatus() != "Exploded") {
            Sonya.feed(15 + Math.random() * 100);
            System.out.println("Вес Сони после кормления: " + Sonya.getWeight());
        }
        System.out.println("Соня взорвалась от переедания.");


Cat Musya = new Cat();
//Заствялем Мусю замяукать себя до смерти
        System.out.println("Вес Муси: " + Musya.getWeight());
        while (Musya.getStatus() != "Dead") {
            Musya.meow();
            System.out.println("Вес Муси после мяукания: " + Musya.getWeight());
        }
        System.out.println("Муся умерла от истощения.");



Cat Persik = new Cat();
        System.out.println("Вес Персика: " + Persik.getWeight());
    }
}