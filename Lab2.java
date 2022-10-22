//package nes;

import java.io.PrintStream;
import java.util.Scanner;
import nes.Point3d;

public class Lab2 {
	public static void main(String[] args) 
		throws java.io.UnsupportedEncodingException
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		ps.println("Введите точки!");
		Scanner s = new Scanner(System.in);		
		Point3d first = new Point3d();					//ввод точек
		first.setX(s.nextDouble());
		first.setY(s.nextDouble());
		first.setZ(s.nextDouble());
		if ((first.compare() == true)) 
			ps.print("Введите другое значение");
		Point3d second = new Point3d();
		second.setX(s.nextDouble());
		second.setY(s.nextDouble());
		second.setZ(s.nextDouble());
		if ((second.compare() == true)) 
			ps.print("Введите другое значение");
		Point3d third = new Point3d();
		third.setX(s.nextDouble());
		third.setY(s.nextDouble());
		third.setZ(s.nextDouble());
		if ((third.compare() == true)) 
			ps.print("Введите другое значение");
		ps.print(computeArea(first, second, third));
	}
	public static double computeArea(Point3d first, Point3d second, Point3d third) {
		double AB, BC, AC, p, S;
		AB = first.distanceTo(second); 
		BC = second.distanceTo(third);
		AC = first.distanceTo(third);
		p = (AB + BC + AC)/2;
        S = Math.sqrt(p * (p - AB) * (p - BC) * (p - AC));
        return S;
	}
}
