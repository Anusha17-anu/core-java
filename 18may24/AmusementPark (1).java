class AmusementPark{
	
	String name;
	int noOfGames;
	String place;

public boolean getReadytoPlay( String name, int noOfGames, String place){

  boolean isPlayGames=false;
  if(name!=null && noOfGames>0 && place!=null ){
  
  this.name=name;
  this.noOfGames=noOfGames;
  
  this.place=place;
  isPlayGames=true;
  }
  
  return isPlayGames;
  }
   
   public void displayGames(){
   
  System.out.println("The Brand name :"+ this.name);
  System.out.println("The no of Games"+this.noOfGames);
  System.out.println("The Place is"+this.place);
  }
 
}