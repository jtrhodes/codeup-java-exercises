package Grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student tom = new Student("Thomas");
        tom.addGrade(89);
        tom.addGrade(98);
        tom.addGrade(76);
        tom.addGrade(59);
        tom.addGrade(87);
        Student bridgette = new Student("Bridgette");
        bridgette.addGrade(76);
        bridgette.addGrade(98);
        bridgette.addGrade(45);
        bridgette.addGrade(87);
        bridgette.addGrade(69);
        Student alice = new Student("Allison");
        alice.addGrade(85);
        alice.addGrade(99);
        alice.addGrade(65);
        alice.addGrade(78);
        alice.addGrade(82);
        Student gerard = new Student("Gerold");
        gerard.addGrade(55);
        gerard.addGrade(28);
        gerard.addGrade(100);
        gerard.addGrade(97);
        gerard.addGrade(89);

        HashMap<String, Student> students = new HashMap();
        students.put("TomTom85", tom);
        students.put("BridgetteRules007", bridgette);
        students.put("AliceInWonderland", alice);
        students.put("Gerard4Ever", gerard);
        System.out.printf("%s%n Who would you like to see the grades of?",students.keySet());
        String userName = scanner.next();
        do{
            System.out.println("That is not a valid username. Please enter a valid username");
            userName = scanner.next();
        }while(!students.containsKey(userName));
        System.out.printf(""userName);

    }

}
