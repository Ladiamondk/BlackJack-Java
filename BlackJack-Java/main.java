import java.util.Scanner;
import java.util.Random;

class Main{
    public static void main(String[] args){
        //assign player two cards 
        Random rand = new Random();
        int cardOne = rand.nextInt(1,10);
        int cardTwo = rand.nextInt(1, 10);

        //calculate player cards sum
        int cardsSum;
        cardsSum = cardOne + cardTwo;

        //Display values to player
        System.out.println("First hand: " + cardOne + ", " + cardTwo);
        System.out.println("Total: " + cardsSum);

        //Prompt user is the want to add another card or stay
        Scanner scnr = new Scanner(System.in);
        String userResponse;
        while(cardsSum < 21){
            System.out.println("Do you want to hit? (y/n): ");
            userResponse = scnr.next();

            if(userResponse.equals("y")){
                int newCard = rand.nextInt(1, 10);
                cardsSum += newCard;
                System.out.println("Card: " + newCard);
                System.out.println("Total: " + cardsSum);

                if(cardsSum == 21){
                    System.out.println("Your a winner!");
                    break;
                }else if(cardsSum > 21){
                    System.out.println("It's a Bust!");
                    break;
                }
            }else if(userResponse.equals("n") && cardsSum < 21){
                System.out.println("Game Over!");
                break;
            } 
        } 
    }
}
