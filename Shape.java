//I pledge my Honor that I have not cheated, and will not cheat, on this assignment._Si Dang

public class Shape
{
   //Private members
   private String shape;
   private int side;
   private static int shapenum = 3; //static variable
   
   //Constructors
   public Shape(String sa, int s)
   {
      shape = sa;
      side = s;
    }
   
   public static int getShapenum()    
    {
      return shapenum;
    }
   
   //toString method  
   public String toString()
    {
      return ("Shape: " + shape + "\n" + "No. of sides: " + side + "\n");
    }
   
   //Mutators 
   public void setShape (String shape)
    {
      this.shape=shape;
    }
    
   public void setSide (int side)
    {
      this.side = side;
     }
}
