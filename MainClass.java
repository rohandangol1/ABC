
/**
 * Write a description of class MainClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass
{
    public static void main(String[] args)
    {
        car Ford =new car();
        Ford.color="Blue";
        Ford.price=12090000;
        car Seira = new car();
        Seira.color="Red";
        Seira.price=7590000;
        
        System.out.println(Ford.color);
        System.out.println(Ford.price);
        System.out.println(Seira.color);
        System.out.println(Seira.price);
    }
}