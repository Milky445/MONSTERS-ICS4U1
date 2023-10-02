import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
public class Monster {
    private String typeMonster;
    Scanner input = new Scanner(System.in);
    private String nameMonster;
    private int ageMonster;
    private boolean badBreathMonster;
    private double gpaMonster;
    // private double gpaMonsterTest;
    // private String nameMonsterTest;
    // private String typeMonsterTest;
    // private int ageMonsterTest;
    // private boolean bbMonsterTest;
    // blah
    /*
    public Monster(String typeTest, String nameTest, int ageTest, boolean badBreathTest, double gpaTest) {
        // System.out.println("What is the type of your new monster?: ");
        // String type = input.nextLine();
        // type = typeMonster;
        this.typeMonsterTest = typeTest;
        // System.out.println("What is the name of your new monster?: ");
        // String name = input.nextLine();
        // name = nameMonster;
        this.nameMonsterTest = nameTest;
        // System.out.println("What is the age of your new monster?: ");
        // int age = input.nextInt();
        // age = ageMonster;
        this.ageMonsterTest = ageTest;
        // System.out.println("Does your monster have bad breath? (True/False): ");
        // boolean badBreath = input.nextBoolean();
        // badBreath = badBreathMonster;
        this.bbMonsterTest = badBreathTest;
        // System.out.println("What is the gross point average of your new monster?: ");
        // double gpa = input.nextDouble();
        // gpa = gpaMonster;
        this.gpaMonsterTest = gpaTest;
        /*
        System.out.println();
        System.out.println("MONSTER 2");
        System.out.println("---------------");
        System.out.println("type: " + typeMonster);
        System.out.println("name: " + nameMonster);
        System.out.println("age: " + ageMonster);
        System.out.println("bad breath: " + badBreathMonster);
        System.out.println("gpa: " + gpaMonster);
        System.out.println("---------------");
        System.out.println();

         */
    // }

    public String changeType(String newType) {
        typeMonster = newType;
        // System.out.println("New type: " + typeMonster);
        return typeMonster;
    }

    public String changeName(String newName) {
        nameMonster = newName;
        // System.out.println("New name: " + nameMonster);
        return nameMonster;
    }

    public int changeAge(int newAge) {
        ageMonster = newAge;
        // System.out.println("New age: " + ageMonster);
        return ageMonster;
    }

    public boolean changeBadBreath(boolean newBadBreath) {
        badBreathMonster = newBadBreath;
        // System.out.println("New bad breath: " + badBreathMonster);
        return badBreathMonster;
    }

    public double changeGPA(double newGPA) {
        gpaMonster = newGPA;
        // System.out.println("New GPA: " + gpaMonster);
        return gpaMonster;
    }

    public Monster(String type, String name, int age, boolean badBreath, double gpa) {
        // System.out.println("What is the type of your new monster?: ");
        // String type = input.nextLine();
        // type = typeMonster;
        typeMonster = type;
        // System.out.println("What is the name of your new monster?: ");
        // String name = input.nextLine();
        // name = nameMonster;
        nameMonster = name;
        // System.out.println("What is the age of your new monster?: ");
        // int age = input.nextInt();
        // age = ageMonster;
        ageMonster = age;
        // System.out.println("Does your monster have bad breath? (True/False): ");
        // boolean badBreath = input.nextBoolean();
        // badBreath = badBreathMonster;
        badBreathMonster = badBreath;
        // System.out.println("What is the gross point average of your new monster?: ");
        // double gpa = input.nextDouble();
        // gpa = gpaMonster;
        gpaMonster = gpa;
        /*
        System.out.println();
        System.out.println("MONSTER 2");
        System.out.println("---------------");
        System.out.println("type: " + typeMonster);
        System.out.println("name: " + nameMonster);
        System.out.println("age: " + ageMonster);
        System.out.println("bad breath: " + badBreathMonster);
        System.out.println("gpa: " + gpaMonster);
        System.out.println("---------------");
        System.out.println();

         */
    }



    public Monster() {
        typeMonster = "Zombie";
        nameMonster = "Uuuggghhh";
        ageMonster = 0;
        badBreathMonster = true;
        gpaMonster = 3.9;
        /*
        System.out.println();
        System.out.println("MONSTER 1");
        System.out.println("---------------");
        System.out.println(typeMonster);
        System.out.println(nameMonster);
        System.out.println(ageMonster);
        System.out.println(badBreathMonster);
        System.out.println(gpaMonster);
        System.out.println("---------------");

         */

    }

    public Monster(String nameMonster, int ageMonster) {
        this.nameMonster = nameMonster;
        this.ageMonster = ageMonster;
        double min = 0.0;
        double max = 4.0;
        double randomDouble = (double)Math.floor(Math.random()*(max-min+1)+min);
        this.typeMonster = "Vampire";
        this.badBreathMonster = false;
        this.gpaMonster = randomDouble;
        // System.out.println(gpaMonster);
        /*
        System.out.println();
        System.out.println("MONSTER 3");
        System.out.println("---------------");
        System.out.println("Type: " + typeMonster);
        System.out.println("Name: " + nameMonster3);
        System.out.println("Age: " + ageMonster3);
        System.out.println("Bad breath: " + badBreathMonster);
        System.out.println("GPA: " + gpaMonster);
        System.out.println("---------------");

         */
    }

    void timeWarp(double numberOfYears) {
        this.ageMonster += (int) numberOfYears;
        double gpaMultiplier = 0.1 * ((int) (Math.floor((double) numberOfYears / 100.0)));
        // System.out.println(gpaMultiplier);
        double newGPA = this.gpaMonster * gpaMultiplier;
        BigDecimal roundedGPA = new BigDecimal(newGPA).setScale(1, RoundingMode.HALF_UP);
        // Extra feature (***)
        if (newGPA > 4.0) {
            roundedGPA = BigDecimal.valueOf(4.0);
        }
        this.gpaMonster = roundedGPA.doubleValue();
        // System.out.println(gpaMonster);
        // System.out.println("The Monster's new age is " + this.ageMonster);
        // System.out.println("The Monster's new GPA is " + roundedGPA);
    }

    void spaDay(int ageMonster, double gpaMonster, double priceSpaDay) {
        this.ageMonster = (int) (ageMonster - priceSpaDay);
        boolean badBreathMonster = false;
        this.gpaMonster = gpaMonster / 2;
        // Extra feature (***)
        if (this.ageMonster < 0) {
            this.ageMonster = 0;
        }
        /*
        System.out.println("New bad breath: " + badBreathMonster);
        System.out.println("New gpa: " + this.gpaMonster);
        System.out.println("Price: " + priceSpaDay);
        System.out.println("New age: " + this.ageMonster);

         */

    }

    BigDecimal percentEvil() {
        double indexOf = nameMonster.indexOf("a");
        double lengthName = nameMonster.length();
        BigDecimal percent2Decimal = null;
        try {
            double percentEvil = ((indexOf + 1) / lengthName) * 100;
            percent2Decimal = new BigDecimal(percentEvil).setScale(1, RoundingMode.HALF_UP);
            System.out.print("Evil percentage of " + nameMonster + " is: " + percent2Decimal + "\n");
            // System.out.print("Percent Evil: " + percent2Decimal);

        } catch (Exception e) {
            System.out.println("Cannot divide by zero.");
        }
        return percent2Decimal;
        // BigDecimal percent2Decimal = new BigDecimal(percentEvil).setScale(2, RoundingMode.HALF_UP);
        // System.out.println("Evil percentage of " + nameMonster3 + " is: " + percent2Decimal);
    }
    public String toString() {
        return "Type: " + this.typeMonster + " | " +
                "Name: " + this.nameMonster + " | " +
                "Age: " + this.ageMonster + " | " +
                "Bad Breath?: " + this.badBreathMonster + " | " +
                "GPA: " + this.gpaMonster + " | " +
                "Percent Evil: " + percentEvil() + " | \n";

    }
    // public String nameArray() {

        // }

        // return Arrays.toString(arr);
    // }
}
