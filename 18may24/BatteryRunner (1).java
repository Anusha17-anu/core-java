class BatteryRunner{
	
public static void main(String battery[]){
	
	Battery ref=new Battery();
	boolean add = ref.createBattery("Exide","18 gm");
	System.out.println(add);
	ref.displayInfo();
	
	boolean add1 = ref.createBattery("Flow battery","14 gm");
	System.out.println(add1);
	ref.displayInfo();
	
	
	boolean add2 = ref.createBattery("Lithium battery","18 gm");
	System.out.println(add2);
	ref.displayInfo();
	
	
	boolean add3 = ref.createBattery("23A Batteries","23 gm");
	System.out.println(add3);
	ref.displayInfo();
	
	
	boolean add4 = ref.createBattery("Su-Kam","18 gm");
	System.out.println(add4);
	ref.displayInfo();
	
}
}