
package nyc.c4q.rayacevedo45;

import java.util.Scanner;

public class Mygame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer = " ";
        boolean end = false;

        System.out.println("You're walking past a phone booth, when the phone starts ringing.");
        System.out.println("You walk in to the booth and pick up the phone.");
        System.out.println("The voice on the other end says 'if you walk out of the booth a sniper will shoot you.'");
        System.out.println("Do you stay on the phone or walk out of the booth?");
        System.out.println("       _________________    _____________________");
        answer = input.nextLine();

        while (!end) {

            if (answer.equals("stay on the phone")) {
                System.out.println("'Good you're not as dumb as you look.'");
                System.out.println("'Now with your cell phone I want you to call your mother'");
                System.out.println("'Tell her she needs to deliver $10,000 to the corner of Main st within 30mins or you will die.");
                System.out.println("Do you call the police or do you call your mother?");
                answer = input.nextLine();

                if (answer.equals("call mom")) {
                    System.out.println("half an hour later");
                    System.out.println("she delivered the money one more task and you're free to go.");
                    System.out.println("'Do you accept yes or no?'");
                    answer = input.nextLine();

                    if (answer.equals("yes")) {
                        System.out.println("'Ok, you're final task is to find me.");
                        System.out.println("To continue download 'the booth part 2'");
                        end = true;

                    } else if (answer.equals("no")) {
                        System.out.println("You are shot and killed. Game Over!");
                        end = true;
                    }

                } else if (answer.equals("call the police")) {
                    System.out.println("'Bad choice.'");
                    System.out.println("A bullet nearly hits you.");
                    System.out.println("Do you try to run or stay on the phone?");
                    answer = input.nextLine();

                    if (answer.equals("run")) {
                        System.out.println("You are shoot and killed. Game Over!");
                        end = true;
                    } else {
                        continue;
                    }

                }

            } else if (answer.equals("walk out of the booth")) {
                System.out.println("As soon as you take a step out of the booth you hear a gun shot and a bullet grazes you.");
                System.out.println("Do you stay on the phone, call the police, or try to run?");
                answer = input.nextLine();

                if (answer.equals("stay on the phone")) {
                    continue;
                } else if (answer.equals("call the police")) {
                    System.out.println("'Bad choice.'");
                    System.out.println("A bullet nearly hits you.");
                    System.out.println("Do you try to run or stay on the phone?");
                    answer = input.nextLine();
                    if (answer.equals("run")) {
                        System.out.println("You are shoot and killed. Game Over!");
                    } else if (answer.equals("stay on the phone")) {
                        continue;
                    }
                } else if (answer.equals("run")) {
                    System.out.println("You are shoot and killed. Game Over!");
                    end = true;
                }
            } else {
                System.out.println("You are stuck in the while loop");
            }
        }
    }
}


