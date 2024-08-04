package numbergame;
import javax.swing.JOptionPane;
import java.util.Random;

public class Numbergame {

    public static void main(String[] args) {
      Random random = new Random();
      int randomNumber = random.nextInt(10);
      boolean userCorrect =false;
      String userInputString;
      int userGuessedNumber;
      
      while (!userCorrect){
          userInputString = JOptionPane.showInputDialog("Guess the number : ");
          userGuessedNumber = Integer.parseInt(userInputString);
          if( userGuessedNumber >randomNumber){
              JOptionPane.showMessageDialog(null, " Too high, try again ");
            }
          else if( userGuessedNumber < randomNumber){
              JOptionPane.showMessageDialog(null, " Too low, try again ");
           }
          else{
               JOptionPane.showMessageDialog(null, " yes , You Guessed the Number.  ");
               userCorrect = true;
          }
              
    }
      System.exit(0);
    
}
}
