package Collection;

import java.util.ArrayList;

public class coll1 {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();

        obj.add(200);
        obj.add(500);
        obj.add(400);

        System.out.println(obj);

        System.out.println(obj.contains(200));
    }
}
