package java_day3;
class Flower{
	void petals() {
		System.out.println("Flowers have lot of petals");
	}
}

class Sunflower extends Flower{
	void color() {
		System.out.println("Sunflower blooms in yellow");
	}
}

class Lotus extends Flower{
	void color() {
		System.out.println("Lotus blooms in pink");
	}
}
public class HierarchicalInheritance {
	public static void main(String[]args) {
		Flower f=new Flower();
		Sunflower s=new Sunflower();
		Lotus l=new Lotus();
		
		f.petals();
		s.color();
		l.color();
	}

}
