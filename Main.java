/*
Importing basic libraries
 */
import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // initializing new scanner named input

        System.out.println("Please enter type of monster 2: ");
        String typeMonster = input.nextLine(); // initialize variable typeMonster

        System.out.println("Please enter name of monster 2: ");
        String nameMonster = input.nextLine();  // initialize variable nameMonster

        System.out.println("Please enter age of monster 2: ");
        int ageMonster = input.nextInt(); // initialize variable ageMonster

        System.out.println("Bad breath?(true/false): ");
        boolean badBreathMonster = input.nextBoolean(); // initialize variable badBreathMonster

        System.out.println("Please enter gpa of monster 2: ");
        double gpaMonster = input.nextDouble(); // initialize variable gpaMonster

        input.nextLine();  // to handle the end of line characters and to clear buffer

        System.out.println("Please enter the name of monster 3: ");
        String nameMonster3 = input.nextLine(); // initialize variable nameMonster3
        System.out.println("Please enter the age of monster 3: ");
        int ageMonster3 = input.nextInt(); // initialize variable ageMonster3

        /*
        create all objects using proper parameters and classes
         */
        Monster monster1 = new Monster();
        Monster monster3 = new Monster(nameMonster3, ageMonster3);
        Monster monster2 = new Monster(typeMonster, nameMonster, ageMonster, badBreathMonster, gpaMonster);

        /*
        Change the name, age, type, bad breath state, and gpa of the monster created initially with all parameters
         */
        monster2.changeName("Santi");
        monster2.changeAge(1000);
        monster2.changeType("Vampire");
        monster2.changeBadBreath(true);
        monster2.changeGPA(1.2);

        System.out.println("How much will your spa day cost?: "); // Ask the user how much they want their spa day to cost
        double priceSpaDay = input.nextDouble(); // Initialize a variable priceSpaDay
        input.nextLine(); // Catch all end of line characters

        /*
        * Output information for the monster 2 and 3's spa day, update the values for age, gpa, and bad breath state
         */
        System.out.println("MONSTER 2 SPA DAY");
        System.out.println("------------------------------");
        monster2.spaDay(priceSpaDay); // Call the method on monster 2
        System.out.println("New bad breath: " + badBreathMonster);
        System.out.println("New gpa: " + monster2.getGpaMonster());
        System.out.println("Price: " + priceSpaDay);
        System.out.println("New age: " + monster2.getAgeMonster());
        System.out.println("------------------------------");

        System.out.println("MONSTER 3 SPA DAY");
        System.out.println("------------------------------");
        monster3.spaDay(priceSpaDay); // Call the method on monster3
        /*
        * Output all updated information and price of the spa day to the console
         */
        System.out.println("New bad breath: " + badBreathMonster);
        System.out.println("New gpa: " + monster3.getGpaMonster());
        System.out.println("Price: " + priceSpaDay);
        System.out.println("New age: " + monster3.getAgeMonster());

        System.out.println("------------------------------");

        /*
        * Ask the user how many years they would like to time warp
        * Output the information for the time warp of monster 1 and 2, output the updated age and gpa
         */
        System.out.println("By how many years would you like to time warp?: ");
        double numberOfYears = input.nextDouble();
        input.nextLine(); // Clear buffer
        System.out.println("------------------------------");
        System.out.println("MONSTER 1 TIME WARP");
        System.out.println("------------------------------");
        monster1.timeWarp(numberOfYears); // Call the method on monster1

        System.out.println("Updated age for monster 1: " + monster1.getAgeMonster()); // Print the new and updated age and gpa of the monster
        System.out.println("Updated gpa for monster 1: " + monster1.getGpaMonster());
        System.out.println("------------------------------");

        System.out.println("MONSTER 2 TIME WARP");
        System.out.println("------------------------------");
        monster2.timeWarp(numberOfYears); // Call the method on monster2

        System.out.println("Updated age for monster 2: " + monster2.getAgeMonster()); // Print the new and updated age and gpa for this monster
        System.out.println("Updated gpa for monster 2: " + monster2.getGpaMonster());

        System.out.println("------------------------------");

        // Extra feature (****)
        List<Monster> monsters = new ArrayList<Monster>(); // initialize a new ArrayList to store all of the monsters

        // boolean createNewMonster = false;
        System.out.println("Would you like to create one new monster? (yes/no): ");
        String newMonster = input.nextLine();
        // Monster monster4 = null;
        Monster monster4 = null;
        if (Objects.equals(newMonster, "yes")) {
            // createNewMonster = true;
            System.out.println("Type: ");
            typeMonster = input.nextLine();
            System.out.println("Name: ");
            nameMonster = input.nextLine();
            System.out.println("Age: ");
            ageMonster = input.nextInt();
            System.out.println("Bad Breath? (true/false): ");
            badBreathMonster = input.nextBoolean();
            System.out.println("GPA: ");
            gpaMonster = input.nextDouble();
            monster4 = new Monster(typeMonster, nameMonster, ageMonster, badBreathMonster, gpaMonster);
            monsters.add(monster4);
            // System.out.println("Would you like to create a new monster? (yes/no): ");
            // newMonster = input.nextLine();
        }
        if (Objects.equals(newMonster, "no")) {
            System.out.println("Moving on .... "); // Output this if user selects no to creating a new monster
        }


        // System.out.println("Percent Evil: ");
        // monster3.percentEvil();
        // monster2.percentEvil();
        System.out.println();
        assert monster4 != null;
        // Extra feature (**)
        try {
            monster4.percentEvil(); // Attempt to call a method on the monster created
        } catch (NullPointerException e) {
            System.out.println("monster4 is null"); // If user selects no, monster4 = null type, and it will output "monster4 is null" instead of throwing an error
            System.out.println();
        }

        /*
        * Add all monsters into the array
         */
        monsters.add(monster1);
        monsters.add(monster2);
        monsters.add(monster3);

        System.out.println(monsters); // Output the elements of the array at the end

        }
    }