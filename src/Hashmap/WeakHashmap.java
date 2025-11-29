package Hashmap;


import java.awt.*;
import java.util.WeakHashMap;

public class WeakHashmap {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imagecache = new WeakHashMap<>();
//        imagecache.put("img1", new Image("Image1"));
//        imagecache.put("img2", new Image("Image2"));
        System.out.println("Before nullifying references: " + imagecache);

    }
}
