import java.util.*;
public class Cgpa 
{
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        float result=0,Credit=0;
        System.out.println("\n\t\t CGPA Finding");
        System.out.print("\nEnter Number of Subjects:");
        int Num_of_Sub=S.nextInt();
        for(int i=1;i<=Num_of_Sub;i++)
        {
            System.out.print("\nEnter "+i+" Subject Grade Point :");
            float Grd=S.nextFloat();
            System.out.print("Enter "+i+" Subject Credit Point :");
            float Crt=S.nextFloat();
            Credit+=Crt;
            result+=(Grd*Crt);
        }
        float Cgpa=result/Credit;
        System.out.println("\n Your CGPA IS "+Cgpa);
        S.close();
    }    
}
