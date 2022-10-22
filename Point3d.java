//package nes;
import java.util.Scanner;
import java.lang.Math;

public class Point3d extends Class2d{
	Scanner s = new Scanner(System.in);
	private double xCoord;					//координата x
	private double yCoord;					//координата y
	private double zCoord;					//координата z
	public Point3d() {						//создание нового объекта со значениями (0.0, 0.0, 0.0)
		xCoord = 0.0;
		yCoord = 0.0;
		zCoord = 0.0;
	}
	public double getX() {					//возможность получения 3 значений по отдельности
		return xCoord;
	}
	public double getY() {
		return yCoord;
	}
	public double getZ() {
		return zCoord;
	}
	public void setX(double value) {		//возможность изменения 3 значений по отдельности
		xCoord = value;
	}
	public void setY(double value) {
		yCoord = value;
	}
	public void setZ(double value) {
		zCoord = value;
	}
	public boolean compare() {			//метод для сравнения значений объектов
		if ((xCoord == zCoord) && (yCoord == xCoord) && (zCoord == yCoord))
			return true;
		else
			return false;
	}
	public double distanceTo(Point3d point) {			//вычисление расстояния между двумя точками с точностью до 2 знаков после запятой
		double X, Y, Z;
        X = xCoord - point.getX();
        Y = yCoord - point.getY();
        Z = zCoord - point.getZ();
        return Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2) + Math.pow(Z, 2));
	}
}
