import java.util.*;
class Aarray
{
    public static void main(String args[])
    {
 
  
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many element u want to eneter ");
        int l=sc.nextint();
        int a[]=new int[10];
        System.out.println("enter element ");
        for(int i=0;i<l;i++)
        {
            
             a[i]=sc.nextInt();
        }
        System.out.println("enter element are ");
        for(int i=0;i<l;i++)
        {
            System.out.println(a[i]);
        }

        
       

    }
}