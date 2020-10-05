
public class Cat
{

    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double foodWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        foodWeight = 0;
    }
    public void pee()
    {
        weight = weight - weight / 150;
        System.out.println("Кошка сходила в туалет");
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        foodWeight += amount;
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
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