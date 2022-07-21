package Constructor;

import java.util.Iterator;
import java.util.TreeSet;

public class ConstructorDemo03 implements Comparable<ConstructorDemo03> {
	int num;
	String name;

	public ConstructorDemo03(int num, String name) {
		this.num = num;
		this.name = name;
	}

	public static void main(String[] args) {
		ConstructorDemo03 a = new ConstructorDemo03(10, "sad");
		ConstructorDemo03 b = new ConstructorDemo03(20, "das");
		ConstructorDemo03 c = new ConstructorDemo03(30, "fog");

		TreeSet ts = new TreeSet();
		ts.add(a);
		ts.add(b);
		ts.add(c);
		
		Iterator<ConstructorDemo03> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().name);
		}

	}

	@Override
	public int compareTo(ConstructorDemo03 o) {
		if (this.num < o.num) {
			return 1;
		} else if (this.num > o.num) {
			return -1;
		} else {
			return 0;
		}
	}

}
