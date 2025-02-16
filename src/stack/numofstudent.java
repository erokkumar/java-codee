package stack;

public class numofstudent {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;

        // Initialize an array to count the number of students who prefer each type of sandwich
        int[] count = new int[2];

        // Count the number of students who prefer each type of sandwich
        for (int stud : students) {
            count[stud]++;
        }

        // Iterate through the sandwiches
        for (int i = 0; i < n; i++) {
            int sand = sandwiches[i];

            // If there are no more students who prefer the current sandwich type, return remaining students
            if (count[sand] == 0) {
                return n - i;
            }

            // Serve the sandwich to a student who prefers it
            count[sand]--;
        }

        // If all sandwiches are served to students successfully, return 0
        return 0;
    }

    public static void main(String[] args) {
        numofstudent solution = new numofstudent();
        int[] students = {1, 1, 0, 0};
        int[] sandwiches = {0, 1, 0, 1};
        int count = solution.countStudents(students, sandwiches);
        System.out.println("Number of students who will eat their preferred sandwiches: " + count);
        students = new int[]{1, 1, 1, 0, 0, 1};
        sandwiches = new int[]{1, 0, 0, 0, 1, 1};
        count = solution.countStudents(students, sandwiches);
        System.out.println("Number of students who will eat their preferred sandwiches: " + count);
    }
}
