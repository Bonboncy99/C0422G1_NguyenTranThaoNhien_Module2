package ss12_java_collection_framework.bai_tap.Comparable;

import ss12_java_collection_framework.bai_tap.Model.Product;

import java.util.Comparator;

public class Descending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() > o2.getPrice()){
            return -1;
        } else if(o1.getPrice() < o2.getPrice()){
            return 1;
        } else {
            return 0;
        }
    }
}
