public class Card
 {
  public String shape;
  public String colour;
  public String pattern;
  
  public Card( String s ,String c, String p)
  {
   shape = s;
   colour = c;
   pattern=p;
   
  }
  
  public boolean equals(Card other)
  {
   if (other.shape.equals(shape) && other.colour.equals(colour) && other.pattern.equals(pattern) )
    return true;
   return false;
  }
  
  public boolean distinct (Card other)
  {
   if (other.shape.equals(shape) == false && other.colour.equals(colour) == false && other.pattern.equals(pattern)== false )    
    return true;
   return false;
  }

 
 
 }
