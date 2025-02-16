package Collection;


import java.util.ArrayList;

class erok1{
    public void rrr(){

    }
}

public class coll {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();

        obj.add(100);
        obj.add(200);
        obj.add(55);
        System.out.println(obj);

        // mix type of data stored in collection

        ArrayList obj1 = new ArrayList();

        obj1.add(1);
        obj1.add(1.99);
        obj1.add("erok");
        obj1.add('a');
        System.out.println(obj1);
    }
}
