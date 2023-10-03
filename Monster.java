
/*
* Import basic libraries for further use
 */
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Monster {

    /*
    * Initialize all variables that are used in the Monster class
     */
    private String typeMonster;
    Scanner input = new Scanner(System.in);
    private String nameMonster;
    private int ageMonster;
    private boolean badBreathMonster;
    private double gpaMonster;

    /*
    * SETTER METHODS
    * Changes all information about the set monster
    *
    * @param newType The new type of the monster
    * @param newName The new name of the monster
    * @param newAge The new age of the monster
    * @param newBadBreath The new state of bad breath of the monster
    * @param newGPA The new gpa set for the monster
     */
    public String changeType(String newType) {
        typeMonster = newType;

        return typeMonster;
    }

    public String changeName(String newName) {
        nameMonster = newName;

        return nameMonster;
    }

    public int changeAge(int newAge) {
        ageMonster = newAge;

        return ageMonster;
    }

    public boolean changeBadBreath(boolean newBadBreath) {
        badBreathMonster = newBadBreath;

        return badBreathMonster;
    }

    public double changeGPA(double newGPA) {
        gpaMonster = newGPA;

        return gpaMonster;
    }

    /*
    * GETTER METHODS
    *
    * Return the age and rounded gpa of the monster, used for spa day and time warp
    * @return The age of the monster
    * @return The rounded gpa of the monster, set to 1 decimal place and round up at .5
     */
    public double getAgeMonster() {
        return ageMonster;
    }

    public BigDecimal getGpaMonster() {
        return new BigDecimal(this.gpaMonster).setScale(1, RoundingMode.HALF_UP);
    }

    /*
    * Main constructor used for setting all @params
     */
    public Monster(String type, String name, int age, boolean badBreath, double gpa) {

        this.typeMonster = type;

        this.nameMonster = name;

        this.ageMonster = age;

        this.badBreathMonster = badBreath;

        this.gpaMonster = gpa;

    }


    /*
    * Overloaded constructor that takes no @params
    * Default values and states are assigned
     */
    public Monster() {
        typeMonster = "Zombie";

        nameMonster = "Uuuggghhh";

        ageMonster = 0;

        badBreathMonster = true;

        gpaMonster = 3.9;


    }

    /*
    * Constructor used for choosing the name and age of the monster, sets default states for the rest of the variables
     */
    public Monster(String nameMonster, int ageMonster) {
        this.nameMonster = nameMonster;
        this.ageMonster = ageMonster;

        double max = 4.0; // Set the max for the random double

        double randomDouble = Math.random() * max; // Random double formula
        double roundedDouble = Math.round(randomDouble * 10) / 10.0; // Round the random double to one decimal place

        this.typeMonster = "Vampire";
        this.badBreathMonster = false;
        this.gpaMonster = roundedDouble; // Makes the GPA of the monster equal to the rounded double above

    }

    void timeWarp(double numberOfYears) {
        this.ageMonster += (int) numberOfYears;
        double gpaMultiplier = 0.1 * ((int) (Math.floor((double) numberOfYears / 100.0)));
        this.gpaMonster *= gpaMultiplier;

        BigDecimal roundedGPA = new BigDecimal(this.gpaMonster).setScale(1, RoundingMode.HALF_UP);

        // Extra feature (***)
        if (this.gpaMonster > 4.0) {
            roundedGPA = BigDecimal.valueOf(4.0);
        }

        this.gpaMonster = roundedGPA.doubleValue();

    }

    void spaDay(double priceSpaDay) {
        this.ageMonster -= (int) priceSpaDay;

        this.badBreathMonster = false;

        this.gpaMonster /= 2;

        // Extra feature (***)
        if (this.ageMonster < 0) {
            this.ageMonster = 0;
        }

    }

    BigDecimal percentEvil() {
        double indexOf = nameMonster.indexOf("a");
        double lengthName = nameMonster.length();

        BigDecimal percent2Decimal = null;

        try {
            double percentEvil = ((indexOf + 1) / lengthName) * 100;
            percent2Decimal = new BigDecimal(percentEvil).setScale(1, RoundingMode.HALF_UP);


        } catch (Exception e) {
            System.out.println("Cannot divide by zero.");
        }

        return percent2Decimal;

    }
    public String toString() {
        return "Type: " + this.typeMonster + " | " +
                "Name: " + this.nameMonster + " | " +
                "Age: " + this.ageMonster + " | " +
                "Bad Breath?: " + this.badBreathMonster + " | " +
                "GPA: " + this.gpaMonster + " | " +
                "Percent Evil: " + percentEvil() + " | \n";

    }

}
