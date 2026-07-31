import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// System.out.println("enter the n value");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=n;j++)
//             {
//                 if(i*j<10)
//                 {
//                     System.out.print("0");
//                 }
//                 System.out.print(i*j +" ");
//             }

//             System.out.println("");
//         }
//     }
// }

// System.out.println("enter the n value");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }
//     }
// }


 System.out.println("Enter the n value");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<(n-1)-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++)
            {
                if(k==0||k==i||i==n-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}