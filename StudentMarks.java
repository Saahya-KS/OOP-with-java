import java.util.Scanner;
class Stud_details
{
 int marks[]=new int[3];
 String usn,name;
 double SGPA;
 Scanner sc =new Scanner(System.in);
 void getdetails()
 {
   System.out.println("Enter USN: ");
   usn=sc.nextLine();
   System.out.println("Enter Name: ");
   name=sc.nextLine();
   for(int i=0;i<3;i++)
   {
      System.out.println("Enter marks or subject "+(i+1)+".");
      marks[i]=sc.nextInt();
   }
}
 void display()
  {
    System.out.println("\nStudent Details : ");
    System.out.println("USN: "+usn);
    System.out.println("Name: "+name);
    for (int i=0;i<3;i++)
    {
      System.out.println("Enter marks or subject "+(i+1)+"."+marks[i]);
     }
    System.out.println("SGPA:"+CalculateSGPA());
  }
 double CalculateSGPA()
  {
    int totalmarks=0;
    for(int mark : marks)
    {
      totalmarks+=mark;
     }
    SGPA=(double)totalmarks/3;
    return SGPA;
  }
}
class StudentMarks
{
   public static void main(String arg[])
   {
     Stud_details s1[] = new Stud_details[3];
     for(int j=0;j<3;j++)
     {
       s1[j]=new Stud_details();
     }
     for(int j=0;j<3;j++)
     {
       System.out.println("Enter the details of the student: "+(j+1));
       s1[j].getdetails();
     }
     for(int j=0;j<3;j++)
     {
       s1[j].display();
     }
   }
}
