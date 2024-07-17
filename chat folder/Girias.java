class Girias{

	static String homeAppliances[] = {null, null, null, null, null, null, null, null, null, null, null, null};
	static int index = 0;

	public static boolean createHomeAppliance(String applianceName){

		boolean isApplianceCreated = false;
		if(applianceName != null){
			homeAppliances[index] = applianceName;
			index++;
			isApplianceCreated = true;
		}
		else {
			System.out.println("Invalid appliance name Added");
		}
		
	return isApplianceCreated;
	}

	public static void getHomeAppliances(){
		System.out.println("The home appliances available are:");
		for(String appliance : homeAppliances){
			if(appliance != null){
				System.out.println(appliance);
			}
		}
	}
}
