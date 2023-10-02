import java.math.BigDecimal;
import java.util.*;

public class Main extends Monster {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter type of monster 2: ");
        String typeMonster = input.nextLine();

        System.out.println("Please enter name of monster 2: ");
        String nameMonster = input.nextLine();  // local variable

        System.out.println("Please enter age of monster 2: ");
        int ageMonster = input.nextInt();

        System.out.println("Bad breath?(true/false): ");
        boolean badBreathMonster = input.nextBoolean();

        System.out.println("Please enter gpa of monster 2: ");
        double gpaMonster = input.nextDouble(); // another local variable

        input.nextLine();  // to handle the end of line characters

        System.out.println("Please enter the name of monster 3: ");
        String nameMonster3 = input.nextLine();
        System.out.println("Please enter the age of monster 3: ");
        int ageMonster3 = input.nextInt();

        // use local variables in constructor call
        Monster monster1 = new Monster();
        Monster monster3 = new Monster(nameMonster3, ageMonster3);
        Monster monster2 = new Monster(typeMonster, nameMonster, ageMonster, badBreathMonster, gpaMonster);
        // System.out.println("NEW MONSTER 2");
        // System.out.println("------------");
        monster2.changeName("Santi");
        monster2.changeAge(1000);
        monster2.changeType("Vampire");
        monster2.changeBadBreath(true);
        monster2.changeGPA(1.2);

        // System.out.println("------------");
        /*
        System.out.println("type: " + monster2.typeMonster);
        System.out.println("name: " + monster2.nameMonster);
        System.out.println("age: " + monster2.ageMonster);
        System.out.println("bad breath: " + monster2.badBreathMonster);
        System.out.println("gpa: " + monster2.gpaMonster);

         */

        System.out.println("How much will your spa day cost?: ");
        double priceSpaDay = input.nextDouble();
        input.nextLine();
        System.out.println("MONSTER 2 SPA DAY");
        System.out.println("------------------------------");
        monster1.spaDay(ageMonster, gpaMonster, priceSpaDay);
        System.out.println("New bad breath: " + badBreathMonster);
        System.out.println("New gpa: " + gpaMonster);
        System.out.println("Price: " + priceSpaDay);
        System.out.println("New age: " + ageMonster);
        System.out.println("------------------------------");
        System.out.println("MONSTER 3 SPA DAY");
        System.out.println("------------------------------");
        monster3.spaDay(ageMonster3, gpaMonster, priceSpaDay);
        System.out.println("New bad breath: " + badBreathMonster);
        System.out.println("New gpa: " + gpaMonster);
        System.out.println("Price: " + priceSpaDay);
        System.out.println("New age: " + ageMonster3);

        System.out.println("------------------------------");
            /*
            System.out.println("Which monster would you like to give a spa day?: ");
            String whichMonster = input.nextLine();
            if (Objects.equals(whichMonster, "monster 1")) {
                monster1.spaDay(ageMonster, gpaMonster, priceSpaDay);
            } else if (Objects.equals(whichMonster, "monster 2")) {
                monster2.spaDay(ageMonster, gpaMonster, priceSpaDay);
            } else if (Objects.equals(whichMonster, "monster 3")) {
                monster3.spaDay(ageMonster3, gpaMonster, priceSpaDay);
            }
             */
        System.out.println("By how many years would you like to time warp?: ");
        double numberOfYears = input.nextDouble();
        input.nextLine();
        System.out.println("MONSTER 1 TIME WARP");
        System.out.println("------------------------------");
        monster1.timeWarp(numberOfYears);
        System.out.println("The Monster's new age is " + ageMonster);
        System.out.println("The Monster's new gpa is " + gpaMonster);
        System.out.println("------------------------------");
        System.out.println("MONSTER 2 TIME WARP");
        System.out.println("------------------------------");
        monster2.timeWarp(numberOfYears);
        System.out.println("The Monster's new age is " + ageMonster);
        System.out.println("The Monster's new gpa is " + gpaMonster);
        System.out.println("------------------------------");

        // Extra feature (****)
        // List<Monster> monsters = new ArrayList<Monster>();
        /*
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
            System.out.println("Bad Breath?: ");
            badBreathMonster = input.nextBoolean();
            System.out.println("GPA: ");
            gpaMonster = input.nextDouble();
            monster4 = new Monster(typeMonster, nameMonster, ageMonster, badBreathMonster, gpaMonster);
            monsters.add(monster4);
            // System.out.println("Would you like to create a new monster? (yes/no): ");
            // newMonster = input.nextLine();
        }
        if (Objects.equals(newMonster, "no")) {
            System.out.println("Moving on .... ");
        }

         */

        // System.out.println(monsters);
        // while (createNewMonster == true) {
            /*
            System.out.println("Please enter type of monster 2: ");
            String typeMonster = input.nextLine();
            System.out.println("Please enter name of monster 2: ");
            String nameMonster = input.nextLine();  // local variable
            System.out.println("Please enter age of monster 2: " );
            int ageMonster = input.nextInt();
            System.out.println("Bad breath?(true/false): ");
            boolean badBreathMonster = input.nextBoolean();
            System.out.println("Please enter gpa of monster 2: ");
            double gpaMonster = input.nextDouble();// another local variable
            input.nextLine();  // to handle the end of line characters

             */
        // }

        // System.out.println("Percent Evil: ");
        monster3.percentEvil();
        monster2.percentEvil();
        System.out.println();
        // assert monster4 != null;
        // Extra feature (**)
        /*
        try {
            monster4.percentEvil();
        } catch (NullPointerException e) {
            System.out.println("monster4 is null");
        }

        monsters.add(monster1);
        monsters.add(monster2);
        monsters.add(monster3);

        System.out.println(monsters);

         */
        System.out.println(monster1);
        System.out.println(monster2);
        System.out.println(monster3);

        // System.out.println(monster1);
        // System.out.println(monster2);
        // System.out.println(monster3);
        /*
        System.out.println("Which monster would you like to time warp?: ");
        String whichTimeWarp = input.nextLine();
        if (Objects.equals(whichTimeWarp, "monster 1")) {
            monster1.timeWarp(numberOfYears);
        } else if (Objects.equals(whichTimeWarp, "monster 2")) {
            monster2.timeWarp(numberOfYears);
        } else if (Objects.equals(whichTimeWarp, "monster 3")) {
            monster3.timeWarp(numberOfYears);
            }

         */
        /*
        String[] arr = {nameMonster};
        // System.out.println(Arrays.toString(arr));
        // for (int i = 0; i < arr.length; i++) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = nameMonster; // Assign nameMonster to the last element
        System.out.println(Arrays.toString(arr));

         */
    }
    }