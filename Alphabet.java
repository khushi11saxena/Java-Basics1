/*
 * 
 Alphabets A
   *
  * *
 *   *
*     *
* * * *
*     *
*     *
*     *

 */


public class Alphabet {
    public static void main(String args[])throws Exception
    {
         int n=4,i,j,k;
        System.out.println(" A  Alphabet");
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
        for(i=1;i<=n;i++)
        {
            System.out.print("* ");
        }
        System.out.println();
        for(i=1;i<n;i++)
        {

            for(j=1;j<=n;j++)
            {
                if(j==1||j==n)
                {
                    System.out.print("* ");
                }
                else
                {
                 System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
