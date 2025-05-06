package opps;

public class constr {
    constr() {
        System.out.println("Constructor called");
        int sum = 5;
    }
    public void add(int sum){
        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args) {
        constr obj = new constr(); // Calls constructor automatically
        obj.add(5); // Calls the add method
    }
}

