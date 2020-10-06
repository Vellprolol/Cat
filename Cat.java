
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double foodWeight;
    private static int count;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        foodWeight = 0;
        this.count ++;
    }

    public static int getCount () {
        return count;
    }

    public void pee()
    {
        if (weight < minWeight || weight > maxWeight) {
            this.count --;
            System.out.println("Кошка умерла и не может ходить в туалет");
        }
        else {
            weight = weight - weight / 150;
            System.out.println("Кошка сходила в туалет");
        }
    }

    public void meow()
    {
        if (weight < minWeight || weight > maxWeight) {
            this.count --;
        }
        else {
            weight = weight - 1;
            System.out.println("Meow");
        }
    }

    public void feed(Double amount)
    {
        if (weight < minWeight || weight > maxWeight) {
            this.count --;
            System.out.println("Кошка умерла и не может есть");
        }
        else {
        foodWeight += amount;
        weight = weight + amount; }
    }

    public void drink(Double amount)
    {
        if (weight < minWeight || weight > maxWeight) {
            this.count --;
            System.out.println("Кошка умерла и не может пить");
        }
        else {
            weight = weight + amount;
        }
    }

    public double getWeight()
    {
        return weight;
    }

    public double getFoodWeight() {
        return foodWeight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {

            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}