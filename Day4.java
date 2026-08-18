// public class Day4 {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         int sum = 0;
//         System.out.print("Array elements: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//             sum += arr[i];   
//         }

//         System.out.println("\nSum of array elements: " + sum);
//     }
// }


// public class Day4 {

//         static int spanofarray(int[] a)
//         {
//             int max=a[0];
//             int min=a[0];
//             for(int i=0;i<a.length;i++)
//             {
//                 if(a[i] >max)
//                 {
//                     max=a[i];
//                 }
//                 if(a[i]<min)
//                 {
//                     min=a[i];
//                 }
//             }
//             return max - min;
//         }

//         public static void main(String[] args) {
//                 int[] a={20,42,88,10,99,6};
//                 System.out.println(spanofarray(a));
//     }
// }


public class Day4 {
    static int removeduplicate(int[] ar)
        {
            int rd=0;
            for(int i=1;i<ar.length;i++)
            {
                if(ar[rd] != ar[i])
                {
                    rd++;
                    ar[rd]=ar[i];
                }
            }
            return rd+1;
        }

    public static void main(String[] args) {

    int[] ar={2,2,3,3,4,6,6};
            for(int i=0;i<ar.length;i++)
            {
                System.out.print(ar[i]+" ");
            }
    int rd=removeduplicate(ar);
            System.out.println();
            for(int i=0;i<rd;i++)
            {
                System.out.print(ar[i]+" ");
            }
    }
}


