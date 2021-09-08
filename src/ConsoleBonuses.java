import java.util.Scanner;

public class ConsoleBonuses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you want to multiply!");
        int mulNum = scanner.nextInt();
        for(int i = mulNum; i > 0; i--){
            String totalNums = "" ;
            totalNums += i;
            System.out.println(totalNums);
        }
    }
}
//4.
//        Given a number n Calculate the factorial of the number
//
//        let n2 = 4; //  4 * 3 * 2 * 1 = 24
//// Example output:
//// 24
//        1:58
//        5.
//        Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.
//
//        let num1 = 2;
//        let num2 = 8;
// Example output:
// 1 + 2 = 3
// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
//        1:59
//        6.
//        Hangman Game
//        prompt a player 1 to enter a word for player 2 to guess
//        track the number of guesses by player 2
//        display to the user the partially completed word
//        string methods from the strings lesson will be helpful for this bonus
//        2:00
//        7.
//        Simple Chat Bot
//
//        Be creative in communicating with your
//        user different options and for given scenarios. Create at three phases of the chat, for example...
//
//        "How are you?" (AI says)
//        |                              |
//        good                        bad (user types)
//
//        "Awesome! Are you super happy?" 	    "Will cake make you better?"
//
//        yes          no                     yes             no
//
//        Keep the chat options relatively simple and plan it out clearly before coding it.
//        2:01
//        8.
//        For a given N, prints the sum of even and odd integers of the first N natural numbers.
//        Input:
//        N = 6
//        Output:
//        12 9
//        Explanation:
//        Natural numbers less than 6 are
//        1 2 3 4 5 6
//        So the sum of even number = 2 + 4 + 6 = 12.
//        and the sum of odd number = 1 + 3 + 5 = 9.
//        2:04
//        9. Write a program that asks the user for an integer input until the user enters the number 0, then show the user the sum of the numbers they entered.
//        (edited)
//        2:06
//        10.
//        Use a nested for loop to generate the following output:
//        *
//        **
//        ***
//        ****
//        *****
//        2:09
//        11.
//        Create nested for loops to produce the
//        following output.
//        ....1
//        ...22
//        ..333
//        .4444
//        55555