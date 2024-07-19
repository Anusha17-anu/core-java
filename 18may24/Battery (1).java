class Battery{

   String name;
   String weight;
   
   
   public boolean createBattery(String name,String weight){
      System.out.println("Charging");
	  boolean isBatteryCreated=false;
	  if(name!=null && weight!=null){
		  this.name=name;
		  this.weight=weight;
		  isBatteryCreated=true;
	  }
	  return isBatteryCreated;
   }
   
   public void displayInfo(){
	   System.out.println("The name of the battery is :"+this.name);
	   System.out.println("The Weight of the battery is :"+this.weight);
	 
   }

}