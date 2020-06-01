import java.lang.Math;
public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;
    public Point3d ( double x,  double y, double z){
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d () {
        this(0, 0, 0);
    }
    public double getX () {
        return xCoord;
    }
    public double getY () {
        return yCoord;
    }
    public double getZ () {
        return zCoord;
    }
    public void setX ( double xval) {
        xCoord = xval;
    }
    public void setY ( double yval) {
        yCoord = yval;
    }
    public void setZ ( double zval) {
        zCoord = zval;
    }
    public boolean equals(Point3d a){
        if (this.xCoord == a.xCoord && this.yCoord == a.yCoord && this.zCoord == a.zCoord) {
            return true;
        }
        else return false;
    }
    public double distanceTo(Point3d a){
        return Math.sqrt(Math.pow((this.xCoord - a.xCoord), 2) + Math.pow((this.yCoord - a.yCoord), 2) + Math.pow((this.zCoord - a.zCoord), 2));
    }
}

