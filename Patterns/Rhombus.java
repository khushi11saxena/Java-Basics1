/*
 *  Solid Rhombus
     *****
   *****
  *****
 *****
*****
 */

public class Rhombus {
    
    public static void main (String args [])throws Exception
    {
        int n=5,i,j,k;
        System.out.println("Solid Rhombus");
        for (i=1;i<=n;i++)
        {
            for (k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
/*
 * Hollow Rhombus
    *****
   *   *
  *   *
 *   *
*****
 */
        System.out.println("Hollow Rhombus");
        for (i=1;i<=n;i++)
        {
            for (k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=n;j++)
            { 
                if(i==1||i==n||j==1||j==n)
                {
                    System.out.print("*");  
                }
                
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    } 
}
