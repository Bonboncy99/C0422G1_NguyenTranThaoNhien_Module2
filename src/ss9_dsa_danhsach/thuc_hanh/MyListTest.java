package ss9_dsa_danhsach.thuc_hanh;

public class MyListTest {
    public static void main(String[] args) {
        MyList <Integer> listInteger = new MyList<Integer> ();
        listInteger.add(2);
        listInteger.add(5);
        listInteger.add(23);
        listInteger.add(1);
        listInteger.add(4);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));


        listInteger.get(6);
        System.out.println("elemnet 6: " + listInteger.get(6));

    }
}
