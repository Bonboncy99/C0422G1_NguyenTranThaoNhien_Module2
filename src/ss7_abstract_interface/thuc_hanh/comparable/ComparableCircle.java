package ss7_abstract_interface.thuc_hanh.comparable;

import ss6_Ke_thua.bai_tap.Circle.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return (int) (this.getRadius() - o.getRadius());
    }
}
