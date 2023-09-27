import java.util.Random;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Monster {
    String typeMonster;
    Scanner input = new Scanner(System.in);
    String nameMonster;
    int ageMonster;
    boolean badBreathMonster;
    double gpaMonster;
    double numOfYears;
    double price;
    double newAge;
    double gpaMultiplier;

    public Monster(String type, String name, int age, boolean badBreath, double gpa) {
        // System.out.println("What is the type of your new monster?: ");
        // String type = input.nextLine();
        // type = typeMonster;
        this.typeMonster = type;
        // System.out.println("What is the name of your new monster?: ");
        // String name = input.nextLine();
        // name = nameMonster;
        this.nameMonster = name;
        // System.out.println("What is the age of your new monster?: ");
        // int age = input.nextInt();
        // age = ageMonster;
        this.ageMonster = age;
        // System.out.println("Does your monster have bad breath? (True/False): ");
        // boolean badBreath = input.nextBoolean();
        // badBreath = badBreathMonster;
        this.badBreathMonster = badBreath;
        // System.out.println("What is the gross point average of your new monster?: ");
        // double gpa = input.nextDouble();
        // gpa = gpaMonster;
        this.gpaMonster = gpa;
        System.out.println();
        System.out.println("type: " + typeMonster);
        System.out.println("name: " + nameMonster);
        System.out.println("age: " + ageMonster);
        System.out.println("bad breath: " + badBreathMonster);
        System.out.println("gpa: " + gpaMonster);
        System.out.println();
    }



    public Monster() {
        typeMonster = "Zombie";
        String nameMonster = "Uuuggghhh";
        ageMonster = 0;
        badBreathMonster = true;
        gpaMonster = 3.9;
        System.out.println();
        System.out.println("DEFAULT MONSTER");
        System.out.println("---------------");
        System.out.println(typeMonster);
        System.out.println(nameMonster);
        System.out.println(ageMonster);
        System.out.println(badBreathMonster);
        System.out.println(gpaMonster);

    }

    public Monster(String nameMonster3, int ageMonster3) {
        this.nameMonster = nameMonster3;
        this.ageMonster = ageMonster3;
        double min = 0.0;
        double max = 4.0;
        double randomDouble = (double)Math.floor(Math.random()*(max-min+1)+min);
        typeMonster = "Vampire";
        badBreathMonster = false;
        gpaMonster = randomDouble;
        System.out.println();
        System.out.println("Type m3: " + typeMonster);
        System.out.println("Name m3: " + nameMonster3);
        System.out.println("Age m3: " + ageMonster3);
        System.out.println("Bad breath m3: " + badBreathMonster);
        System.out.println("GPA m3: " + gpaMonster);
    }

    void timeWarp(double numberOfYears) {
        this.numOfYears = numberOfYears;
        this.newAge = ageMonster + numberOfYears;
        this.gpaMultiplier = 0.1 * ((int) (Math.floor((double) numberOfYears / 100.0)));
        System.out.println(gpaMultiplier);
        double newGPA = gpaMonster * gpaMultiplier;
        BigDecimal roundedGPA = new BigDecimal(newGPA).setScale(2, RoundingMode.HALF_UP);
        System.out.println("The Monster's new GPA is " + roundedGPA);
    }

    void spaDay(int age, double gpa, double priceSpaDay) {
        this.price = priceSpaDay;
        double newAge = (int) (age - price);
        boolean badBreathMonster = false;
        gpaMonster = gpa / 2;
        if (newAge < 0) {
            newAge = 0;
        }
        System.out.println("New bad breath: " + badBreathMonster);
        System.out.println("New gpa: " + gpaMonster);
        System.out.println("Price: " + priceSpaDay);
        System.out.println("New age: " + newAge);
    }
}
