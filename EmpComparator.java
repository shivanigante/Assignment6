import java.util.*;
abstract class Employee
{
 String name,desgi;
 int age,sal;
  Employee()
{
 Scanner s=new Scanner(System.in);
  System.out.println("enter the employee name");
   name=s.next();
 System.out.println("enter the employee age");
   age=s.nextInt();
}
 void display()
{
 System.out.println("name:"+ name);
System.out.println("age :"+ age);
System.out.println("salary:"+ sal);
System.out.println(" job :"+ desgi);
}
 public abstract void raisesalary();
}
final class clerk extends Employee
{
  clerk()
{
  sal=10000;
   desgi="clerk";
} 
public void raisesalary()
{
 sal=sal+(sal*10/100);
 System.out.println("raisedsalary: "+sal);
}
}
final class programmer extends Employee
{
  programmer()
{
  sal=20000;
   desgi="programmer";
} 
public void raisesalary()
{
 sal=sal+(sal*20/100);
 System.out.println("raisedsalary: "+sal);
}
}
final class manager extends Employee
{
  manager()
{
  sal=30000;
   desgi="manager";
} 
public void raisesalary()
{
 sal=sal+(sal*25/100);
 System.out.println("raisedsalary: "+sal);
}
}
 class mycomparator implements Comparator
{
  public int compare( Object o1,Object o2)
{
     Employee e1= (Employee)o1;
     Employee e2= (Employee)o2;
       String s1=e1.name;
        String s2=e2.name;
     return s1.compareTo(s2);
}
}
 
class EmpComparator
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
                Employee e=null;
                TreeSet<Employee> set =new TreeSet<Employee>(new mycomparator());
                int c1,c2,i=0;
           do
           {
            System.out.println("1.create \n2.display \n3.raisesalary \n4.exit ");
            System.out.println("enter the number");
            c1=s.nextInt();
            switch(c1)
            {
       case 1: 
            do
               {
                   System.out.println("1.clerk \n2.programmer \n3.Manager \n4.exit "); 
                   System.out.println("enter the number");
                   c2=s.nextInt();
                   switch(c2)
                    {
              case 1: e=new clerk();
                         set.add(e);
                        break;
              case 2: e=new programmer();
                         set.add(e);
                        break;
              case 3: e=new manager();
                         set.add(e);
                        break;
              }
              } while(c2<4);
              break;
 case 2: try
          {
            for(Employee x:set)
              {
              if(x != null)
             x.display();
              
                }
          
               
           }
           catch (Exception ex)
            {
              System.out.println("no records");
             }
             break;
 case 3:try
          {
            for(Employee x:set)
              x.raisesalary();
              }   
            
       
           catch (Exception ex)
            {
              System.out.println("no records");
             }
             break; 
      }
      } while(c1<4);
                
	}
}