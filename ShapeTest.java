//I pledge my Honor that I have not cheated, and will not cheat, on this assignment._Si Dang

import java.util.Scanner;
public class ShapeTest
{
   
   public static void main(String[] args)
   {
      //Scanner   
      Scanner input = new Scanner (System.in);
      
      String shape1, shape2, shape3;
      int side1, side2, side3;
      
      //reference the static variable
      System.out.println("Enter info on " + Shape.getShapenum() +" shapes:");
     
      System.out.print("Enter the name of the shape: ");
      shape1 = input.nextLine();
      System.out.print("Enter the number of sides: ");
      side1 = input.nextInt();
      
      System.out.print("Enter the name of the shape: ");
      shape2 = input.next();
      System.out.print("Enter the number of sides: ");
      side2 = input.nextInt();
      
      System.out.print("Enter the name of the shape: ");
      shape3 = input.next();
      System.out.print("Enter the number of sides: ");
      side3 = input.nextInt();
      
      Shape shapea = new Shape (shape1, side1);
      Shape shapeb = new Shape (shape2, side2);
      Shape shapec = new Shape (shape3, side3);
      
      System.out.println("\n");
      System.out.println("Here is the info you entered for the " + Shape.getShapenum() + " shapes: "); //reference the static variable
       
      shapea.setShape(shape1);
      shapea.setSide(side1);
      
      shapeb.setShape(shape2);
      shapeb.setSide(side2);
      
      shapec.setShape(shape3);
      shapec.setSide(side3);
      
      System.out.println(shapea);
      System.out.println(shapeb);
      System.out.println(shapec);
   }
}