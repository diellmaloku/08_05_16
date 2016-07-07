import javax.swing.*;
public class Detyra2 {
   public static void main(String[]args)  {
   	
      String[]figura={"Hearts","Diamonds","Spades","Clubs"};
      String[]numri = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
      int input = new Integer(JOptionPane.showInputDialog("shkruaje nr e letrave per shperndarje")).intValue();
      int i=0;
      int j=0;
      int a=0;
      while (a<=input&&i<13&&j<4) {
         System.out.print(numri[i] + figura[j]+ " "); a++;i++;j++;}
   	
   }
}
