1.Write a Java class having overloaded methods to calculate area of rectangle
and circle.

class methods
{
 void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z);
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y);
    }
   
}
class ovrlod
{
     public static void main(String args[]) 
	{
	   methods ob = new methods();
	   ob.area(8.5);
	   ob.area(6,12);
        }
}