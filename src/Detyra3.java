// Program per perkthimin e nje numri te plote ne karakter
import javax.swing.*;
public class Detyra3
{ 
   public static void main(String[] args)
   { int[]code=new int[27];
   /* code[0] = ' ',
    code[1] = 'a',
    code[2] = 'b', ...*/
      int k=new Integer(JOptionPane.showInputDialog("Shkruaje numrin startues ")).intValue();
      /*Nese k=0 karakteri fillues eshte ' ',
        Nese k=1 karakteri fillues eshte 'a',
        Nese k=2 karakteri fillues eshte 'b' ...  */
      code[0]=k;
      for (int i=1; i!=code.length; i=i+1)
      {code[i]=(int)((code[i-1]*1.3)+1); } 
      String answer="";
      boolean calculate=true;
      while (calculate)
      { String input=JOptionPane.showInputDialog("Shkruaje nje numer te plote per ta dekoduar ose null, per të perfunduar: ");
         if (input.equals(""))
         { calculate = false; }
         else {char c=decode(code,new Integer(input).intValue());
            answer=answer+c;
         }
      }
      System.out.println(answer);
   }
    //  Simboli "?" paraqitet kur programi num mundet ta perkthej numrin ne karakter
   private static char decode(int[] code, int i)
   { char c='?';
      boolean found=false;
      int index=0;
      while (!found && index!=code.length )
      { 
         if (code[index]==i)
         {found=true;
            if (index==0)
            {c = ' ';}
            else {c=(char)(index+'a'-1); }
         }
         else {index=index+1;}
      }
      return c;
   }
}

