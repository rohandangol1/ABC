
/**
 * Write a description of class employeeclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class employeeclass
{
    public static void main(String[] args)
   {
       Employee Aadesh=new Employee();
       Aadesh.id=3001;
       Aadesh.Name="Aadesh Dakhwa";
       Aadesh.salary= 12000;
       
       Employee Adish=new Employee();
       Adish.id=3004;
       Adish.Name="Adish Gautam";
       Adish.salary= 19000;
       
       Employee Saman=new Employee();
       Saman.id=3007;
       Saman.Name="Saman Khanal";
       Saman.salary= 27000;
        
       System.out.println(Aadesh.id);
       System.out.println(Aadesh.Name);
       System.out.println(Aadesh.salary);
       System.out.println(Adish.id);
       System.out.println(Adish.Name);
       System.out.println(Adish.salary);
       System.out.println(Saman.id);
       System.out.println(Saman.Name);
       System.out.println(Saman.salary);
       
       if (Aadesh.salary>Adish.salary && Aadesh.salary>Saman.salary) 
       {
           System.out.println(Aadesh.id); 
           System.out.println(Aadesh.Name);
           System.out.println(Aadesh.salary);
        }
        else if(Adish.salary>Saman.salary && Adish.salary>Aadesh.salary)
        {
            System.out.println(Adish.id);
            System.out.println(Adish.Name);
            System.out.println(Adish.salary);
        }
        else
        {
            System.out.println(Saman.id);
            System.out.println(Saman.Name);
            System.out.println(Saman.salary);
        }
    }
}