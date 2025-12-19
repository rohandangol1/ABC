
/**
 * Write a description of class teachers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class teachers
{
    String name;
    String Address;
    long id;
   public static void main(String[] args)
   {
       students Dhurba=new students();
       Dhurba.name="Dhurba Pandey";
       Dhurba.Address="Boudha";
       Dhurba.id= 30001;
       
       students Ujjwal=new students();
       Ujjwal.name="Ujjwal Subedi";
       Ujjwal.Address="Balaju";
       Ujjwal.id= 1220;
       
       students Sashwot=new students();
       Sashwot.name="Sashwot Sing Shahi";
       Sashwot.Address="Baneshowr";
       Sashwot.id= 30005;
        
       System.out.println(Dhurba.name);
       System.out.println(Dhurba.Address);
       System.out.println(Dhurba.id);
       System.out.println(Ujjwal.name);
       System.out.println(Ujjwal.Address);
       System.out.println(Ujjwal.id);
       System.out.println(Sashwot.name);
       System.out.println(Sashwot.Address);
       System.out.println(Sashwot.id);
   }
}