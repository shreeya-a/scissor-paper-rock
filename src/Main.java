import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        take input from user S,P,R

        Scanner inputObj = new Scanner(System.in);
        System.out.println("Please enter S, P or R >>>> ");
        char userMove = inputObj.next().charAt(0);
        System.out.println("User gave this input >>>> "+userMove);

//        make computer to make their move
            char[] arr= {'S', 'P','R'};
            Random random = new Random();
            int guessNumber = random.nextInt(3);
            char computerMove = arr[guessNumber];
        System.out.println("Computer gave this input >>>> "+ computerMove);

//        String[] Move = {"S", "P", "R"};
//        Random random = new Random();
//        int randomIndex = random.nextInt(Move.length);
//        String compMove = Move[randomIndex];
//        System.out.println("Computer gave this input >>>> "+ compMove);
//        System.out.println(compMove);

//        computer =  user -> draw!!!
//        user"S"
//            computer "R"-: c wins!!!
//            user wins
//        user"P"
//            computer "R"-: U wins!!!
//            C wins
//        user"R"
//            computer "R"-: U wins!!!
//            C wins


        if (userMove=='S'|| userMove=='s' ){
            if (computerMove=='P'){
                System.out.println("User wins!!!");
            } if (computerMove=='R') {
                System.out.println("Computer wins!!!");

            }
        }
       else if (userMove=='P'|| userMove=='p' ){
            if (computerMove=='R'){
                System.out.println("User wins!!!");
            }
            if (computerMove=='S') {
                System.out.println("Computer wins!!!");

            }
        }
       else if  (userMove=='R'|| userMove=='r' ){
            if (computerMove=='S'){
                System.out.println("User wins!!!");
            }
            if (computerMove=='P') {
                System.out.println("Computer wins!!!");
            }
            }

        else {
            System.out.println("Draw");
        }
        

    }


}