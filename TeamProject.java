/*******************************************************************************************************
   Date: 10/15/15
   Title: TeamProject.java
   Author: Adrian Borrego & Roshal Robince 
   Team Project 1
   
   Program to compute the %G~C Content of a DNA sequence and it's bases.
*******************************************************************************************************/
import java.util.Scanner;
import java.text.NumberFormat;

public class TeamProject
{
   public static void main(String[]_args)
   {  
      //Initializing the variables.
      String sample;
      int gCount = 0, cCount = 0, aCount = 0, tCount = 0, otherCount = 0;
      int length = 0, total;
      char ch;
      double gcPair;
      
      //Intializing the formatter and scanner object.
      Scanner scan = new Scanner(System.in);
      NumberFormat percent = NumberFormat.getPercentInstance();
      
      //Asking the user to input the DNA sequence.
      System.out.println("Enter sample: ");
      for(int k=1; k <= 100; k++){
      sample = scan.next();
      //Finds length of string.
      length = sample.length();
      
      //The for loop which runs till the end of the string is reached.       
      for(int i = 0; i < length; i++)
      {
         ch = sample.charAt(i);
         if (sample.charAt(i)!= 'G' && sample.charAt(i)!= 'C' && sample.charAt(i)!= 'A' && sample.charAt(i)!= 'T')
            {
               otherCount++;
            }
    
         ch = sample.charAt(i);
         //The switch statement for finding bases.
         switch (ch)
         {  
          
            case 'g':
            case 'G': gCount++;
                      break;
            case 'c':
            case 'C': cCount++;
                      break;
            case 'a':
            case 'A': aCount++;
                      break;
            case 't':
            case 'T': tCount++;
                      break;                         
         }
         
      }
      }
      
      //Calculations of total bases and %G~C content.
      total = (gCount + cCount + aCount + tCount); 
      gcPair = (((double)gCount + (double)cCount) / (double)total);
      
      //Display results.
      System.out.println();
      System.out.println("Amount of G's: " + gCount);
      System.out.println("Amount of C's: " + cCount);
      System.out.println("Amount of A's: " + aCount);
      System.out.println("Amount of T's: " + tCount);
      System.out.println();
      System.out.println("Total count of G~T: " + (gCount + cCount));         
      System.out.println("Total # of bases: " + (total - otherCount));
      System.out.println("The %G~C pair content: " + percent.format(gcPair)); 
      System.out.println("Other characters: " + otherCount); 
      scan.close();
      
   }
}
      