
public class Cat
{
    public static Object getKitten;
    private double originWeight;
    private double weight;
    private double foodWeight;
    private static int count;
    private static final double MIN_WEIGHT = 1000;
    private static final double MAX_WEIGHT = 9000;
    private static final int NUMBER_OF_EYES = 2;
    private static double kittenWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        foodWeight = 0;
        this.count ++;
    }

    public Cat(double kittenWeight) {
        this();
    this.weight = 1100;
   originWeight = weight;
    }

    public static Cat getKitten() {
        Cat kitten = new Cat(1100);
        return kitten;
    }




    public void setColour (Colours colour) {

    }

    public static int getNumberOfCatEyes () {
        return NUMBER_OF_EYES;
    }

    public static int getCount () {
        return count;
    }

    public void pee()
    {
        if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
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
        if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
            this.count --;
        }
        else {
            weight = weight - 1;
            System.out.println("Meow");
        }
    }

    public void feed(Double amount)
    {
        if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
            this.count --;
            System.out.println("Кошка умерла и не может есть");
        }
        else {
        foodWeight += amount;
        weight = weight + amount; }
    }

    public void drink(Double amount)
    {
        if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
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
        if(weight < MIN_WEIGHT) {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {

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