import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      String s1="HELLO";
      char c[]=s1.toCharArray();
      char c2[];
      int cow=0;int bull=0;
      Scanner sc=new Scanner(System.in);
      String s2[]=new String[10];
      System.out.println("Guess this 5 letter word");
      for(int i=0;i<10;i++)
      {
          System.out.println("Enter a guess:");
          s2[i]=sc.nextLine();
          s2[i]=s2[i].toUpperCase();
          if(s2[i].length()!=5)
          {
            System.out.println("Please enter a 5 letter word only");
            continue;
          }
          cow=0;bull=0;
          c2=s2[i].toCharArray();
          for(int j=0;j<5;j++)
          {
                if(c2[j]==c[j])
                    cow++;
                else
                { 
                    for(int k=0;k<5;k++)
                    {
                        if(c2[j]==c[k])
                            bull++;
                    }
                    
                }
          }
          System.out.println(cow+"C"+","+bull+"B");
          if(cow==5)
          {
              System.out.println("YAY YOU GUESSED IT!!");
              break;
        }
        if(i==9)
            System.out.println("Better Luck Next Time!");
      }
    }
}
