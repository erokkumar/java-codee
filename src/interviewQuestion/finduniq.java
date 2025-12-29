package interviewQuestion;

public class finduniq {
    public static void main(String[] args) {
        int [] arr = {5,5,3,7,4,3,4};
        int uni = 0;
        for(int i = 0; i< arr.length; i++){
            uni ^= arr[i];
        }
        System.out.println(uni);
    }
}
