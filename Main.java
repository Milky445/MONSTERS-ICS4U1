import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter type: ");
        String typeMonster = input.nextLine();
        System.out.println("Please enter name: ");
        String nameMonster = input.nextLine();  // local variable
        System.out.println("Please enter age: " );
        int ageMonster = input.nextInt();
        System.out.println("Bad breath?(true/false): ");
        boolean badBreathMonster = input.nextBoolean();
        System.out.println("Please enter gpa: ");
        double gpaMonster = input.nextDouble();// another local variable
        input.nextLine();  // to handle the end of line characters

        System.out.println("Please enter the name of monster 3: ");
        String nameMonster3 = input.nextLine();
        System.out.println("Please enter the age of monster 3: ");
        int ageMonster3 = input.nextInt();

        // use local variables in constructor call
        Monster monster1 = new Monster();
        Monster monster3 = new Monster(nameMonster3, ageMonster3);
        Monster monster2 = new Monster(typeMonster, nameMonster, ageMonster, badBreathMonster, gpaMonster);
        /*
        System.out.println("type: " + monster2.typeMonster);
        System.out.println("name: " + monster2.nameMonster);
        System.out.println("age: " + monster2.ageMonster);
        System.out.println("bad breath: " + monster2.badBreathMonster);
        System.out.println("gpa: " + monster2.gpaMonster);

         */
        System.out.println("Would you like to give your monster a spa day?: ");
        boolean spaDay = input.nextBoolean();
        System.out.println("How much will your spa day cost?: ");
        double priceSpaDay = input.nextDouble();
        monster2.spaDay(ageMonster, gpaMonster, priceSpaDay);
        if (spaDay == true) {
            System.out.println("Which monster would you like to give a spa day?: ");
            String whichMonster = input.nextLine();
            if (whichMonster == "monster1") {
                monster1.spaDay(ageMonster, gpaMonster, priceSpaDay);
            } else if {
                // add else if statement here for monster2 and monster3
            }

        }
        System.out.println("Would you like to time warp your monster?: ");
        boolean timeWarp = input.nextBoolean();
        if (timeWarp == true) {
            System.out.println("By how many years would you like to time warp?: ");
            double numberOfYears = input.nextDouble();
            monster2.timeWarp(numberOfYears);
        }
        }
    }