import java.util.Scanner;

public class Round {

  public static void main(String[] args) {
    
    //initialize variables
    int first, last, quotient;
    String userOption;
    Scanner input = new Scanner(System.in);
    
    do{
      
      System.out.println("Would you like to quit (y/n): ");
      userOption = input.nextChar();
      
    }while(userOption.toUpper() == "NO" || userOption.toUpper == "N");
    System.out.println("Project terminated.");
    input.close();
  } 
}
