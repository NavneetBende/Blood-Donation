import java.util.Scanner;
class BloodDonation
{
	public static void main(String[]args)
	{
	  Scanner sc = new Scanner(System.in);

      System.out.println("Enter Your Age: ");
      int age = sc.nextInt();

        if(age>20) // if(age>=21)
	   {

         System.out.println("Enter Your Weight: ");
         double wt = sc.nextDouble();
           
           if(wt>50) // if(wt>=51)
           {
             System.out.println("Did you consume Alcohol OR Cigarette in last 24 Hours?(Yes/No):");
             char ca = sc.next().charAt(0);

             if(ca=='N'|| ca=='n')
              {
                 System.out.println("Congraulation!! You can Donate the Blood. Thank You for your community service");  
              }
             else 
              {
                 System.out.println("You CAN NOT donate blood because you'va consumed Alcohol OR Cigarette in last 24 Hours");
              }
            }
         else 
          {
             System.out.println("You can not donate blood because your Weight need to be above 50");
          }
        }
      else
        {
            System.out.println("Sorry!! You are a Minor right Now become 18+ then try again");
        } 
    }	
}