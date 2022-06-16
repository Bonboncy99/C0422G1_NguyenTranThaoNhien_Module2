package ss8_clean_code.thuc_hanh.bai_3;

public class Cylinder {
    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getperimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    public static double getperimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    public static double getBaseArea(double radius) {
        return Math.PI * radius * radius;
    }
}
