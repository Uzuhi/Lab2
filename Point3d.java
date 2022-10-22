//package nes;
import java.util.Scanner;
import java.lang.Math;

public class Point3d extends Class2d{
	Scanner s = new Scanner(System.in);
	private double zCoord;							//координата z
	public Point3d(double x, double y, double z) {						
		super(x, y);
		zCoord = z;
	}
	public Point3d() {						//создание нового объекта со значениями (0.0, 0.0, 0.0)
		this (0.0, 0.0, 0.0);
	}
	public double getZ() {
		return zCoord;
	}
	public void setZ(double value) {
		zCoord = value;
	}
	public boolean compare(Point3d point) {			//метод для сравнения значений объектов
		if ((super.compare(point)) && (zCoord == point.getZ()))
			return true;
		else
			return false;
	}//сравнение точек, не координат
	public double distanceTo(Point3d point) {			//вычисление расстояния между двумя точками с точностью до 2 знаков после запятой
		double X, Y, Z;
        X = this.getX() - point.getX();
        Y = this.getY() - point.getY();
        Z = zCoord - point.getZ();
        return Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2) + Math.pow(Z, 2));
	}
}
