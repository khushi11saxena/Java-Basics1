
/*

ButterFly Pattern


*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

 */
public class butterfly {
    public static void main(String args[])throws Exception
    {   
        System.out.println("Butter Fly Pattern");
        int i,j,k,n=4;
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for (k=1;k<=2*(n-i);k++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        


        for (i=n;i>=1;i--)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for (k=1;k<=2*(n-i);k++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }





/*

 Hollow ButterFly Pattern


*      *
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
*      *

 */
    System.out.println("Hollow Butterfly");
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                if(j==1||j==i)
                {
                    System.out.print("*");
                }
                else
                {System.out.print(" ");}
            }
            for (k=1;k<=2*(n-i);k++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=i;j++)
            {
                if(j==i||j==1)
                {System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        


        for (i=n;i>=1;i--)
        {
            for (j=1;j<=i;j++)
            {
                if(j==i||j==1)
                {System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            for (k=1;k<=2*(n-i);k++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=i;j++)
            {
                if(j==i||j==1)
                {System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    
    }
    
}
