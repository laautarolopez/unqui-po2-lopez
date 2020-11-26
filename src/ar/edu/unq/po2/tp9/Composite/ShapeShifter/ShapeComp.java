package ar.edu.unq.po2.tp9.Composite.ShapeShifter;

import java.util.ArrayList;
import java.util.List;

public class ShapeComp implements IShapeShifter {
	// Compositer
	private List<IShapeShifter> shapes = new ArrayList<IShapeShifter>();
	
	public ShapeComp(List<IShapeShifter> shapes) {
		this.shapes = shapes;
	}
	
	public IShapeShifter compose(IShapeShifter shape) {
		List<IShapeShifter> l = new ArrayList<IShapeShifter>();
		l.add(this);
		l.add(shape);
		return new ShapeComp(l);
	}
	
	public int deepest() {
		int resultado = 1;
		for (IShapeShifter s : shapes) {
			resultado += s.deepest();
		}
		return resultado;
	}
	
	public IShapeShifter flat() {
		List<IShapeShifter> l = new ArrayList<IShapeShifter>();
		for(IShapeShifter s : shapes) {
			l.add(s);
		}
		return new ShapeComp(l);
	}
	
	public List<Integer> values() {
		List<Integer> l = new ArrayList<Integer>();
		for (IShapeShifter s : shapes) {
			l.addAll(s.values());
		}
		return l;
	}
}