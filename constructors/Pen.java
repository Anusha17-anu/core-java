class Pen{
String name;
int price;
String colour;

public Pen(String name,int price,String colour){
	System.out.println("writing");
	this.name=name;
	this.price=price;
	this.colour=colour;
}
public void getPenDetails(){

	System.out.println("the name is"+name);
	System.out.println("the price is"+price);
	System.out.println("the colour is"+colour);
}

}