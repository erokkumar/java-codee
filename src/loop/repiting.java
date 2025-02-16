package loop;


import java.util.Scanner;

class repiting {
    // Method to find the repeating and missing elements
    int[] findTwoElement(int arr[]) {
        int[] ans = new int[2];  // ans[0] -> repeating, ans[1] -> missing
        int[] fre = new int[arr.length];

        // First loop to find the repeating element
        for (int i = 0; i < arr.length; i++) {
            fre[arr[i] - 1]++;
            if (fre[arr[i] - 1] == 2) {
                ans[0] = arr[i];  // Found the repeating element
            }
        }

        // Second loop to find the missing element
        for (int i = 0; i < fre.length; i++) {
            if (fre[i] == 0) {
                ans[1] = i + 1;  // Found the missing element
                break;  // Exit early after finding the missing number
            }
        }

        return ans;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create Solve object and call the findTwoElement function
        repiting solver = new repiting();
        int[] result = solver.findTwoElement(arr);

        // Output the results
        System.out.println("Repeating element: " + result[0]);
        System.out.println("Missing element: " + result[1]);

        sc.close();
    }
}
