import java.util.Arrays;
class Gym{

	static String gymName = "Classic Fittness";
	static String ownerName = "N Nagraja";
	static String gymEquips[] = {null,null,null,null,null,null,null,null};
	static int gymindex;
	
	public static boolean createGymEquipments(String gymEquip){
	
	System.out.println("List of equipments strated");
		boolean isListCreated = false;
		if(gymEquips != null){
		gymEquips[gymindex] = gymEquip;
		gymindex++;
		isListCreated = true;
		}
		System.out.println("List of equipments ended");
		return isListCreated;
	} 
	public static void getEquipments(){
	System.out.println("Getting the list ");
	
	for(String gymEquip : gymEquips)
	System.out.println(gymEquip);

	System.out.println("Got the list");
	}
	public static boolean equipmentDeleted(String gymitemtobedeleted){
		System.out.println("equipmentDeleted started");
		boolean isequipmentsdelited=false;
		int newIndex,oldIndex;
		for(newIndex=0,oldIndex=0;oldIndex<gymEquips.length;oldIndex++){
			if(gymEquips[oldIndex]!= gymitemtobedeleted){
				gymEquips[newIndex]= gymEquips[oldIndex];
				newIndex++;
			}
		}
		gymEquips=Arrays.copyOf(gymEquips,newIndex);
		if(gymEquips!=null){
			isequipmentsdelited=true;
			
		}
		if(isequipmentsdelited=false){
			System.out.println(gymEquips+"notfound");
		}
		System.out.println("equipmentDeleted ended");
		return isequipmentsdelited;
	}
}