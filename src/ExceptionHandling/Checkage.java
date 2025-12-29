package ExceptionHandling;


class Studentt extends Exception {
    public Studentt(String msg){
        super(msg);
    }
}

public class Checkage {
    static void ageChecked(int age) throws Studentt{
        if (age > 18){
            throw new Studentt("you are Eligible");
        }else {
            System.out.println("You are not Eligible");
        }
    }

    public static void main(String[] args) {
        try {
            ageChecked(16);
        }catch (Studentt e){
            System.out.println(e.getMessage());
        }
    }
}
