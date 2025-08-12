package interviewQuestion;

public class firstunique {

        public int firstUniqChar(String s) {
            int[] count = new int[26];

            for (final char c : s.toCharArray())
                ++count[c - 'a'];

            for (int i = 0; i < s.length(); ++i)
                if (count[s.charAt(i) - 'a'] == 1)
                    return i;

            return -1;
        }

    public static void main(String[] args) {
        firstunique solution = new firstunique();

        // Test cases
        String test3 = "aabb";
        String test1 = "leetcode";
        String test2 = "loveleetcode";

        int result3 = solution.firstUniqChar(test3);
        int result1 = solution.firstUniqChar(test1);
        int result2 = solution.firstUniqChar(test2);


        System.out.println("First unique character in '" + test1 + "': " + result1);
        System.out.println("First unique character in '" + test2 + "': " + result2);
        System.out.println("First unique character in '" + test3 + "': " + result3);
    }
}

