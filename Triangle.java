3.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating
a class named 'Triangle' without any parameter in its constructor.

import java.util.*;
public class Triangle
{
public Triangle()
{
 double perimeter,area;
 int a=3, b=4, c=5;
perimeter = a+b+c;
double s=perimeter/2.0;
area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("Area of triangle: "+area);
System.out.println("Perimeter of Trinagle: "+perimeter);
}
 public static void main(String[]args){
Triangle t = new Triangle();
}
}