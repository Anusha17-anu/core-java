class SunGlasses{
	
	String brandName;
	
	String type;
	double price;

public boolean getStyling( String brandName,  String type, double price){

  boolean isStylingGlass=false;
  if(brandName!=null && type!=null && price>0){
  
  this.brandName=brandName;
  this.type=type;
  this.price=price;
  isStylingGlass=true;
  }
  
  return isStylingGlass;
  }
   
   public void displayEyeInfo(){
   
  System.out.println("The Brand name :"+ this.brandName);
  System.out.println("The Type is"+this.type);
  System.out.println("The Price is"+this.price);
  }
 
}