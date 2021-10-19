package hierarchical_inheritance;

public class HierarchicalInheritanceDemo {
public static void main(String[] args){
	Audi audi = new Audi();
	BMW bmw = new BMW();
	Ferrari ferrari = new Ferrari();
	audi.drive();
	audi.speed();
	bmw.drive();
	bmw.speed();
	ferrari.drive();
	ferrari.speed();
}
}
