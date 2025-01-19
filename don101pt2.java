//Scanner Import
import java.util.Scanner;

// Class Header
public class don101pt2{ //start class//
  
    public static void main(String[] args) { // Start main method

        // scanner object
        Scanner keyboard = new Scanner (System.in);
        
        /* 
         * conditional operators
         < less than - this is executed if a vlaue is smaller than another
         > greater than - this is executed if a value is larger than another
         <= less than or equal to - this is executed if a value is larger than or equal to another
         >= greater than or equal to - this is executed if a vlaue equals another value
         == equal to - this is executed if a value equals another value
         != does not equal to - this is executed if a value does not equal another va;ue
         */

         /*
          * Conditional Statments
          * if statement - this is exeucted if a block of code is true!
          * else statement - this is executed if a block of code is false!
          * else-if statement - signifies a new condition, executed if the first condition is false!
          * MUST USE CURLY BRACES {} WHEN WRITING MULTIPLE CONDITIONAL STATEMENTS!!!
          * switch statement - a group of blocks of code that are executed
          * parameter - the condition we are checking for example. (age > 20)
          */

          // age variable
          int age = 19;
          
          // age checker
          if (age > 20){
            System.out.println(age + " is old enough to drink alcohol");
          }
          else{
            System.out.println(age + " is too young to drink alcohol");
          }

          // grade variable
          int grade = 83;

          // grade checker
          if (grade > 90){
            System.out.println(grade + " is a A");
          }
          else if (grade >= 80){
            System.out.println(grade + " is a B");
          }
          else if (grade >= 70){
            System.out.println(grade + " is a C");
          }
          else if (grade >= 60){
            System.out.println(grade + " is a D");
          }
          else{
            System.out.println(" You are failing, Bad! get some help");
          }

          /* Weather checker 
          100 degrees "it is too hot, stay inside"
          90 degrees "Very hot, drink water!"
          80 degrees "Not too hot, enjoy your day outisde"
          70 degrees "Perfect weather!"
          60 degrees "Kinda cool, wear long sleeves"
          50 degrees "Cold, wear a hoodie"
          40 degrees "Winter weather, wear a coat"
          30 degrees and below "Drink some hot chocolate"*/

          // weather variable
          int temp = 74;

          // temperature watch
          if (temp > 100){
            System.out.println(" It is too hot, stay inside");
          }
          else if (temp >= 90){
            System.out.println(" Very hot, drink water");
          }
          else if (temp >= 80){
            System.out.println(" Not too hot, enjoy your day outside!");
          }
          else if (temp >= 70){
            System.out.println(" Perfect weather!");
          }
          else if (temp >= 60){
            System.out.println( "Kinda cool, wear long sleeves");
          }
          else if (temp >= 50){
            System.out.println(" Cold, wear a hoodie");
          }
          else if (temp >= 40){
            System.out.println(" Winter weather, weat a coat");
          }
          else{
            System.out.println(" Drink some hot chocolate, maybe stay inside");
          }

          /*
           * reading inputs (Scanner data types)
           * keyboard.nextLine() - used when reading a String
           * keyboard.nextInt() - used when reading integers (int)
           * keyboard.nextDouble - used when reading decimal numbers (double)
           */

          // ask for name
          System.out.print("Please enter your name: ");
          // name variable
          String name = keyboard.nextLine();

          //display name
          System.out.println(" Nice to meet you " + name);

          // ask for age
          System.out.print("Please enter how old you are?: ");
          // age variable
          int years = keyboard.nextInt();

          // display age in years
          System.out.println (" You are " + years +  " years old");


    } // end main method


} //end class
