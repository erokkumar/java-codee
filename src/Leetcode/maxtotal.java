package Leetcode;

import java.util.Arrays;
import java.util.Comparator;


class maxtotal {

        public long maximumImportance(int n, int[][] roads) {
            int[] degree = new int[n];

            // Calculate the degree of each city
            for (int[] road : roads) {
                degree[road[0]]++;
                degree[road[1]]++;
            }

            // Create a list of cities and sort by degree
            Integer[] cities = new Integer[n];
            for (int i = 0; i < n; i++) {
                cities[i] = i;
            }
            Arrays.sort(cities, new Comparator<Integer>() {
                public int compare(Integer a, Integer b) {
                    return Integer.compare(degree[b], degree[a]);
                }
            });

            // Assign values to cities starting from the highest degree
            long totalImportance = 0;
            for (int i = 0; i < n; i++) {
                totalImportance += (long) (n - i) * degree[cities[i]];
            }

            return totalImportance;
        }

     public static void main(String[] args) {
         maxtotal solution = new maxtotal();

         // Test case 1
         int n1 = 5;
         int[][] roads1 = { {0, 1}, {0, 2}, {0, 3}, {1, 4} };
         long result1 = solution.maximumImportance(n1, roads1);
         System.out.println("Maximum Importance for test case 1: " + result1); // Expected output: 43

         // Test case 2
         int n2 = 3;
         int[][] roads2 = { {0, 1}, {1, 2} };
         long result2 = solution.maximumImportance(n2, roads2);
         System.out.println("Maximum Importance for test case 2: " + result2); // Expected output: 14

         // Test case 3
         int n3 = 4;
         int[][] roads3 = { {0, 1}, {1, 2}, {2, 3} };
         long result3 = solution.maximumImportance(n3, roads3);
         System.out.println("Maximum Importance for test case 3: " + result3);
     }
    }

