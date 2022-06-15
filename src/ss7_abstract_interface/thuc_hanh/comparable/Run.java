package ss7_abstract_interface.thuc_hanh.comparable;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        ComparableCircle [] circles = new ComparableCircle[5];
        circles[0] = new ComparableCircle(1);
        circles[1] = new ComparableCircle(3);
        circles[2] = new ComparableCircle(5);
        circles[3] = new ComparableCircle(2);
        circles[4] = new ComparableCircle(4);

        for (ComparableCircle circle:circles) {
            System.out.println(circle);
        }

        System.out.println();
       Arrays.sort(circles);

        for (ComparableCircle circle:circles) {
            System.out.println(circle);
        }
    }

}
