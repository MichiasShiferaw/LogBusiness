//Scan all primitive data types
import java.util.Scanner;

/** 
 * This Log Company program output the maximum number of logs that will fit on a truck,
 * based on the three log lengths options; .25m, .5m and 1m
 * @author Michias Shiferaw
 * @Version 2.0
 * @since 2020-02-15.
 */
public class LogCompanyAssignment {
  /** 
     * This Log Company program output the maximum number of logs that will fit on a truck,
     * based on the three log lengths options; .25m, .5m and 1m
     * @author Michias Shiferaw
     * @Version 2.0
     * @since 2020-02-15
     */
  public static void main(String[] args) {

    //Intro and Question
    String introQuestion = ("Welcome! Please enter a length of logs you would like.");
    System.out.println(introQuestion);

    //User input process
    Scanner input = new Scanner(System.in);
    System.out.println("Our choices are the following (in meters); .25, .5 and 1 : ");
    //place the user's input in a specified variable
    double sizeOfLog = input.nextDouble();
    if ((sizeOfLog == 0.25) || (sizeOfLog == 0.5) || (sizeOfLog == 1.0)) {
      //Calucating using a provided variable and the user's input
      double limit = 1100 / (20 * sizeOfLog);

      //Output the user input's function's value.
      System.out.println("The truck can carry " + limit + " logs that are " 
                    + sizeOfLog + " meters long.");
    } else {
      //Output informing the user that the input was not acceptable in the program.
      System.out.println("Our choices are only .25, .5 and 1 yet, you picked " + sizeOfLog + "m."); 
    }
  }
}
