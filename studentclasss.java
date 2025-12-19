
/**
 * Write a description of class studentclasss here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class studentclasss
{
    public static void main(String[] args)
   {
       Student Aadesh=new Student();
       Aadesh.name="Aadesh Dakhwa";
       Aadesh.Address="Pimbahal";
       Aadesh.age= 18;
       
       Student Adish=new Student();
       Adish.name="Adish Gautam";
       Adish.Address="Swyambhu";
       Adish.age= 17;
       
       Student Saman=new Student();
       Saman.name="Saman Khanal";
       Saman.Address="Bhaktapur";
       Saman.age= 17;
        
       System.out.println(Aadesh.name);
       System.out.println(Aadesh.Address);
       System.out.println(Aadesh.age);
       System.out.println(Adish.name);
       System.out.println(Adish.Address);
       System.out.println(Adish.age);
       System.out.println(Saman.name);
       System.out.println(Saman.Address);
       System.out.println(Saman.age);
   }
}