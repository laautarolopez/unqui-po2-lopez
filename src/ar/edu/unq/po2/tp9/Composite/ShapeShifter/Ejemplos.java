package ar.edu.unq.po2.tp9.Composite.ShapeShifter;

import java.util.ArrayList;
import java.util.List;

public class Ejemplos {
	
	public static void main(String[] args0) {
		// Ejemplo a
		ShapeLeaf s1 = new ShapeLeaf(1);
		
		// Ejemplo c
		ShapeLeaf s2 = new ShapeLeaf(2);
		List<IShapeShifter> l = new ArrayList<IShapeShifter>();
		l.add(s1); l.add(s2);
		ShapeComp s3 = new ShapeComp(l);
		
		List<IShapeShifter> l2 = new ArrayList<IShapeShifter>();
		l2.add(s1);
		l2.add(s2);
		l2.add(s3);
		ShapeComp s4 = new ShapeComp(l2);
		
		System.out.println(s1.deepest());
		System.out.println(s3.deepest());
		System.out.println(s4.deepest());
		
		System.out.println(s1.values());
		System.out.println(s3.values());
		System.out.println(s4.values());
	}
}