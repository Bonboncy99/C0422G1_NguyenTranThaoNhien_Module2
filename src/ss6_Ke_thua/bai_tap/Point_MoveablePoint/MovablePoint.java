package ss5_Ke_thua.bai_tap.Point_MoveablePoint;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public  void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float [] arr2 = new float[2];
        arr2[0] = this.xSpeed;
        arr2[1] = this.ySpeed;
        return arr2;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                ", x=" + super.getX() +
                ", y=" + super.getY() +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public MovablePoint move (){
        setX(getX() + xSpeed);
        setY(getY()+ ySpeed);
        return this;
    }
}
