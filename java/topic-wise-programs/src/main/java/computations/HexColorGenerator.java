package computations;

import com.github.javafaker.Faker;

import java.util.Random;

public class HexColorGenerator {
    private static Faker faker = new Faker();
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            //System.out.println(getRandomName());
            System.out.println(faker.music().instrument());
        }
    }

    public static String generateHexColor(){
        Random random = new Random();
        int nextInt = random.nextInt(0xffffff + 1);
        String colorCode = String.format("#%06x", nextInt);
        return colorCode;
    }

    public static String getRandomName(){
        return faker.pokemon().name();
    }
}
