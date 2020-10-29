import java.util.Scanner;

public class Round {

  public static void main(String[] args) {
    
    //initialize variables
    int first, quotient, rounded;
    String userOption;
    Scanner input = new Scanner(System.in);
    
    do{
      System.out.println("Enter first number: ");
      first = input.nextInt();
      rounded = (first / 10) * 10;
      
      if(first%10 >= 5)
        rounded += 10;
      
      System.out.println("Rounded number: " + rounded);
      System.out.println("Would you like to quit (y/n): ");
      userOption = input.nextChar();
      
    }while(userOption.toUpper() == "NO" || userOption.toUpper == "N");
    System.out.println("Project terminated.");
    input.close();
  } 
}
