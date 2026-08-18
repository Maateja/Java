import java.util.Scanner;

// public class Day3 {

//     static boolean isPrime(int n) {
//         for (int i = 2; i <= n / 2; i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number");
//         int n = sc.nextInt();

//         System.out.println(isPrime(n));
//     }
// }


public class Day3 {
    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(isPalindrome(s)); 
    }
}
    