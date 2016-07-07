import javax.swing.*;
public class Detyra1 {
   public static void main(String[] args) { 
      int N = new Integer(JOptionPane.showInputDialog("Shkruaj numrin e fundit")).intValue();
   
      boolean[] isPrime = new boolean[N + 1];
      for (int i = 2; i <= N; i++) {
         isPrime[i] = true;
      }
   
      // "nonprimes" <= N duke perdorur Sieve of Eratosthenes
      for (int i = 2; i*i <= N; i++) {
      
         // nese i eshte prime, te gjithe shumefishat e tij jane "nonprimes"
         if (isPrime[i]) {
            for (int j = i; i*j <= N; j++) {
               isPrime[i*j] = false;
            }
         }
      }
   
      // numrimi i "primes"
      int primes = 0;
      for (int i = 2; i <= N; i++) {
         if (isPrime[i]) primes++;
      }
      System.out.println("\"prime\" numrat <="  + N + " jane " + primes+ " numra"); 
   }
}