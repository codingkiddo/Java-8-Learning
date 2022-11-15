package com.example.generics;


class XY {
	int x;
	int y;
	XY(int x, int y) {
		this.x = x; this.y = y;
	}
}

class AB implements Cloneable {
	int a;
	int b;
	XY xy;
	AB(int a, int b, XY xy) {
		this.a = a; this.b = b; this.xy = xy;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ClonableMain {

	public static void main(String[] args) throws CloneNotSupportedException {

		XY xyObj1 = new XY(1, 2);
		AB ob1 = new AB(11, 22, xyObj1);
		AB ob2 = (AB) ob1.clone();
		
	}

}
