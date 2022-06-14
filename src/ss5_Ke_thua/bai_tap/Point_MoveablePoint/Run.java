package ss5_Ke_thua.bai_tap.Point_MoveablePoint;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Run {


    public static void main(String[] args) {
//        Point point = new Point(1,2);
//        System.out.println(point);

          MovablePoint movablePoint = new MovablePoint(1,1,4,5);
        System.out.println(movablePoint);

        movablePoint.move();
        System.out.println(movablePoint);
    }
}
