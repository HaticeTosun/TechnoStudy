package day7;
//printing number in range
public class MathRandom3 {

    //int randomInRange = min + (int) (Math.random() * ((max - min) + 1));
    public static void main(String[] args) {
        int min1 = -30;
        int max1 = 40;
        int range1 = max1 - min1;

        int randomInRange1 = min1 + (int) (Math.random() * (range1 + 1));
        System.out.println(randomInRange1);

        int temperature = randomInRange1;
        System.out.println("Temperature is: " + temperature);

        if (temperature == 40) {
            System.out.println("Frying");
        }
        if (temperature >= 27) {
            System.out.println("Its hot");
        }
        if (temperature >= 20 && temperature <= 27) {
            System.out.println("Its warm");
        }
        if (temperature < 20 && temperature >= 10) {
            System.out.println("Cool");
        }
        if (temperature < 10) {
            System.out.println("Freezing");

            int min = 10;
            int max = 20;
            int range = max - min;
            int randomInRange = min + (int) (Math.random() * (range + 1));
            System.out.println(randomInRange);

            if (randomInRange == 1) {
                System.out.println("One");
            }

        }

    }

}
