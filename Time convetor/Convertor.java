import java.util.*;
import java.io.*;

class Convertor
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a time or 'quit':");
  String time = input.nextLine();
  String[] hourName =  new String[] {"one", "two", "three", "four", "five", "six", "seven" , "eight", "nine" ,"ten", "eleven", "twelve","one"};
  String[] minuteNames = new String[] {"o'clock","five", "ten","quarter","twenty","twenty five","half"};
  int[] min = new int[] { 0,5,10,15,20,25,30}; //minutes
  while (time.equals("quit") == false)
  {
     String[] times = time.split(":");
     int hour = Integer.parseInt(times[0]);
     int minutes = Integer.parseInt(times[1]);
     
     //for oclock
     if (minutes==0)
     {
      System.out.println( hourName[hour-1] +" "+ minuteNames[0]);
     }
     //for about oclock
     else if(minutes>0 && minutes - 0 <=2 )
     {
      System.out.println("about "+ hourName[hour-1] +" "+ minuteNames[0]);
     }
     else if (60 - minutes <=2)
     {
      System.out.println("about "+ hourName[hour] +" "+ minuteNames[0]);

     }
    
     // for past
     else  if (minutes<=32)   
      {
         for (int i=1; i<min.length; i++)
        {
            if (minutes==min[i])
            {
             System.out.println( minuteNames[i]+" past "+hourName[hour-1] );
            }
            else if (minutes<min[i] && min[i]-minutes <=2 || minutes>min[i] && minutes - min[i] <=2)
            {
             System.out.println( "about "+ minuteNames[i]+" past "+hourName[hour-1]);
            } 
        }

     }
     //for to
     else
     {
      minutes = 60 - minutes;
      
       for (int i=1; i<min.length; i++)
        {
            if (minutes==min[i])
            {
             System.out.println( minuteNames[i]+" to "+hourName[hour] );
            }
            else if (minutes<min[i] && min[i]-minutes <=2 || minutes>min[i] && minutes - min[i] <=2)
            {
             System.out.println( "about "+ minuteNames[i]+" to "+hourName[hour]);
            } 
        }

     }
         
          
    
    
    System.out.println("Enter a time or 'quit':");
    time = input.nextLine();
 
  } 
  
  System.out.println("Done");
  
 }


}
