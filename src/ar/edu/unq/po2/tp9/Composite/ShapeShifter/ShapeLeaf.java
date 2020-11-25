package ar.edu.unq.po2.tp9.Composite.ShapeShifter;

import java.util.ArrayList;
import java.util.List;

public class ShapeLeaf implements IShapeShifter {
	private int num;
	
	public ShapeLeaf(int numero) {
		this.num = numero;
	}
	
	public IShapeShifter compose(IShapeShifter shape) {
		List<IShapeShifter> l = new ArrayList<IShapeShifter>();
		l.add(this);
		l.add(shape);
		return new ShapeComp(l);
	}
	
	public int deepest() {
		return 0;
	}
	
	public IShapeShifter flat() {
		return this;
	}
	
	public List<Integer> values() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(this.num);
		return l;
	}
}