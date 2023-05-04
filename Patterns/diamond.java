/*
 * 
 * 
 DIAMOND Pattern 
 
   *
  ***
 *****
*******
*******
 *****
  ***
   *
   
 */


public class diamond {
    public static void main(String args[])throws Exception
    {
        int i,j,k,n=4;
        System.out.println("Diamond");
        for (i=1;i<=n;i++)
        {
            for (k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=(2*i)-1;j++)
            {   
                System.out.print("*");
            }
            System.out.println();
        }
        


        for (i=n;i>=1;i--)
        {
            
            for (k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

/*
 Hollow DIAMOND Pattern 
 
   *
  * *
 *   *
*     *
*     *
 *   *
  * *
   *
   
 */

 System.out.println(" Hollow Diamond");
for (i=1;i<=n;i++)
        {
            for (k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=(2*i)-1;j++)
            {   if(j==1||j==((2*i)-1))
                {
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        


        for (i=n;i>=1;i--)
        {
            
            for (k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=(2*i)-1;j++)
            {
                if(j==1||j==((2*i)-1))
                {
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
    
}
