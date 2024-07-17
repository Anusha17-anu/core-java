class GoldItem{
static String  goldItemName="sari";
static String address="";

   static String goldNames[]={null,null,null,null,null,null,null};
   static int goldNameindex;
   
   public static boolean createGoldNames(String goldName){
   System.out.println("gold Item started");
   boolean isGoldNameCreated=false;
   if(goldNameindex<goldNames.length){
   if(goldName !=null){
   goldNames[goldNameindex]=goldName;
  goldNameindex++;
   isGoldNameCreated=true;
   }
   else{
   System.out.println("Gold name is null ");
   }
   }
   System.out.println("Gold Item ended ");
   return isGoldNameCreated;
   }
   public static boolean updateGoldNames(String oldGoldName, String newGoldName){
				System.out.println("newGoldName updated");
	boolean isUpdateGoldName = false;
	for(int index = 0;index<goldNames.length; index++){
						if(oldGoldName == goldNames[index]){
							goldNames[index] = newGoldName;
							isUpdateGoldName = true;
						}
					}
					if(isUpdateGoldName == false){
							System.out.println(oldGoldName + "not found");
					}
				System.out.println(" updated goldName ended");
				return isUpdateGoldName;
			}			
		public static void getGoldNames(){
			for(String goldName:goldNames)
				System.out.println("The name of gold: " + goldName);
				
	}

					
   
   
   }