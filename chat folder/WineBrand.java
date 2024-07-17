class WineBrand{
static String  wineBrandName="sari";
static String address="";

   static String wineNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
   static int wineNameindex;
   
   public static boolean createWineNames(String wineName){
   System.out.println("wine Brand started");
   boolean isWineNameCreated=false;
   if(wineNameindex<wineNames.length){
   if(wineName !=null){
   wineNames[wineNameindex]=wineName;
   wineNameindex++;
   isWineNameCreated=true;
   }
   else{
   System.out.println("Wine name is null ");
   }
   }
   System.out.println("Wine Brand ended ");
   return isWineNameCreated;
   }
   public static boolean updateWineNames(String oldWineName, String newWineName){
				System.out.println("newWineName updated");
	boolean isUpdateWineName = false;
					for(int index = 0;index<wineNames.length; index++){
						if(oldWineName == wineNames[index]){
							wineNames[index] = newWineName;
							isUpdateWineName = true;
						}
					}
					if(isUpdateWineName == false){
							System.out.println(oldWineName + "not found");
					}
				System.out.println(" updated wineName ended");
				return isUpdateWineName;
			}			
		public static void getWineNames(){
			for(String wineName:wineNames)
				System.out.println("The name of wine: " + wineName);
				
	}

					
   
   
   }