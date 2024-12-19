import CIE.*;
import SEE.*;
import java.util.*;

class Mains
{
   public static void main(String arg[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of students: ");
       int n = sc.nextInt();
       External ex[] = new External[n];
       for(int i=0; i<n; i++){
	