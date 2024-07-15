import java.util.*;
import java.io.*;

class Check
{
 public static void main (String[] args)
 {

  Scanner input  = new Scanner(System.in);
  System.out.println("Enter the name of the cards file:");
  String filein = input.nextLine();
  try
  {
      File myFile = new File(filein);
     Scanner file= new Scanner(myFile);
       
     while (file.hasNextLine())
     {
      boolean valid = false;
   
      String line = file.nextLine();
      System.out.println("Processing: "+line );
      String[] cards = line.split(" ");
      
      String card1 = cards[0];
      String[] info1= card1.split(",");
      String shape1 = info1[0];
      String colour1 = info1[1];
      String pattern1 = info1[2];
      Card Card1 = new Card(shape1, colour1, pattern1);
      
      
      String card2 = cards[1];
      String[] info2= card2.split(",");
      String shape2 = info2[0];
      String colour2 = info2[1];
      String pattern2 = info2[2];
      Card Card2 = new Card(shape2, colour2, pattern2);
      
      String card3 = cards[2];
      String[] info3= card3.split(",");
      String shape3 = info3[0];
      String colour3 = info3[1];
      String pattern3 = info3[2];
      Card Card3 = new Card(shape3, colour3, pattern3);
      
      if (Card1.equals(Card2) && Card2.equals(Card3))
       valid = true;
      else if ( Card1.distinct(Card2) && Card2.distinct(Card3)&& Card3.distinct(Card1))
        valid = true;
        
      if (valid== true)
      System.out.println("Valid");
      else
      System.out.println("Invalid");
   
      
      
     
     
     }
     System.out.println("Done");

  }
  catch (Exception e)  
  {
   System.out.println(e);
  }
    
 
 
 
 }
 
 



}



