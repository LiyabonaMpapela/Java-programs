import java.util.*;
import java.io.*;

public class Ships
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the name of the ship data file:");
  String name= input.nextLine();
  try
  {
  File myFile = new File(name);
  Scanner file = new Scanner(myFile);
  
  int numPair =1; 
  
  while( file.hasNext())
  {
   String line1 = file.nextLine();
   String line2 = file.nextLine();
   

   String[] split1 = line1.split(" ");
   String[] split2 = line2.split(" ");
  

   
   double[][] values = new double[2][5];
   
   //for first ship
   for (int i=0; i<5; i++)
   {
    values[0][i] = Double.parseDouble(split1[i]);
   }
   
   //for second ship 
   for (int i=0; i<5; i++)
   {
    values[1][i] = Double.parseDouble(split2[i]);
   }
   
   //calculating intersection
   double Xi = ((values[0][1])*(values[1][2]) - (values[1][1])*(values[0][2])) / ((values[0][0])*(values[1][1]) - (values[1][0])*(values[0][1]));
   double Yi = ((values[1][0])*(values[0][2]) - (values[0][0])*(values[1][2])) / ((values[0][0])*(values[1][1]) - (values[1][0])*(values[0][1]));
    
   
  //Distance between Ship1 and intersection
  double ship1Dist = Math.sqrt( Math.pow((Xi - values[0][3]),2) + Math.pow((Yi - values[0][4]),2) ) ;
    
  //Distance between Ship2 and intersection
  double ship2Dist = Math.sqrt( Math.pow((Xi - values[1][3]),2) + Math.pow((Yi - values[1][4]),2) ) ;
 

  //in String rounded off to two decimal places
  String stringXi = String.format("%.1f",Xi);
  String stringYi = String.format("%.1f",Yi);
  
  String stringShip1Dist = String.format("%.1f",ship1Dist);
  String stringShip2Dist = String.format("%.1f",ship2Dist);
  
  //output
  System.out.print("Pair "+numPair+": Intersection point: ("+stringXi+", "+stringYi+"); Ship S1's distance is "+stringShip1Dist+"; Ship S2's distance is "+stringShip2Dist+"; ");
   
  if(  stringShip2Dist.equals(stringShip1Dist) ||( -0.5<ship2Dist-ship1Dist && ship2Dist-ship1Dist <0.5) )
  {
   System.out.println("Tied.");
  }
  else if(ship2Dist<ship1Dist)
  {
   System.out.println("Ship S2 is nearest.");
  }
   else if(ship1Dist<ship2Dist)
  {
   System.out.println("Ship S1 is nearest.");
  }
  
  
   numPair++;
  }
  
  
  System.out.println("Done");
  }
  catch(Exception e)
  {
   System.out.println(e);
  } 





 }

}