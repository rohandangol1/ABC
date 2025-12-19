
/**
 * Write a description of class rectangleclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rectangleclass
{
    public static void main(String[] args)
    {
        rectangle rec =new rectangle();
        rec.length=9;
        rec.breadth=12;
        rectangle rect = new rectangle();
        rect.length=15;
        rect.breadth=75;
        
        System.out.println(rec.length);
        System.out.println(rec.breadth);
        System.out.println(rect.length);
        System.out.println(rect.breadth);
    }
}