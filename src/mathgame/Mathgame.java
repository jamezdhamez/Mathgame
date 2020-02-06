/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgame;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author jamestruhol
 */
public class Mathgame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to math game! When ready, please press '1' a new game below, '2' to access scores, or '3' to quit the game");
        System.out.println("1. New Game \n2. Scores \n3. Quit");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Random rand = new Random();
        int a;
        int b;
        int correct;
        int score = 0;
        int option1 = 1;
        int option2 = 2;
        int option3 = 3;
        int option4 = 4;
            
        
        
        
        if(input == 1){
            
            System.out.println("You have chosen to start a new game! ");
            System.out.println("There will be 12 math questions total, with four answers to choose from \nThe points allocate as following: \n+1 point for addition \n+2 points for subtraction \n+3 points for multiplication \n+4 points for division");
            System.out.println("Are you ready for your questions? \n1.Yes \n2.No (Quit the game)");
            input = scanner.nextInt();
            if(input == 1){
                System.out.println("First Question! "); //Main math game function here
                a = rand.nextInt(51);
                b = rand.nextInt(51);
                System.out.println("What is " + a + "+" + b + "?");
                
                System.out.println(option1 + "." + (a+b) );
                System.out.println(option2 + "." + (a-b) );
                System.out.println(option3 + "." + (a*b) );
                System.out.println(option4 + "." + (a/b) );
                correct = option1;
                input = scanner.nextInt();
                if(input == correct ){
                    System.out.println("Correct!");
                    
                }
                else{
                    System.out.println("Incorrect!");
                    //add scoring system here
                }
                
                
                
                
                
            }
            else if(input == 2){
                System.out.println("You have chosen to quit the game, see you next time!");
            }
            else{
                System.out.println("Incorrect entry, please try again");  //find a way to make this not repeat itself
            }
        } 
        else if(input ==2){
            System.out.println("Highest Score:"); //Add Highest Score Here 
            System.out.println("Lowest Score:"); //Add Lowest Score Here 
            System.out.println("All scores"); //Add all scores here
            System.out.println("Would you like to play the game? \nPress '1' to play or '2' to quit");
            input = scanner.nextInt();
            if(input ==1 ){
                //Loop back to main math game function
            }
            else if(input ==2){
                System.out.println("You have chosen to quit the game, see you next time!");
            }
            else{
              System.out.println("Invalid entry, please try again");  
            }
            
    }
        else if(input == 3){
            System.out.println("You have chosen to quit the game, see you next time!");
            
        }
        else {
            System.out.println("Invalid entry, please try again");
        }
            
            
        }
        
       
        
        
    }
    


