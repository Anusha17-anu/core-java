public class GiriasRunner {

	public static void main(String[] applainces) {
		
		boolean isApplianceAdded = Girias.createHomeAppliance("Refrigerator");
		System.out.println("Appliance added: " + isApplianceAdded);

		isApplianceAdded = Girias.createHomeAppliance("Washing Machine");
		System.out.println("Appliance added: " + isApplianceAdded);

		isApplianceAdded = Girias.createHomeAppliance("Microwave Oven");
		System.out.println("Appliance added: " + isApplianceAdded);

		isApplianceAdded = Girias.createHomeAppliance("Television");
		System.out.println("Appliance added: " + isApplianceAdded);

		isApplianceAdded = Girias.createHomeAppliance("Air Conditioner");
		System.out.println("Appliance added: " + isApplianceAdded);

		isApplianceAdded = Girias.createHomeAppliance("Vacuum Cleaner");
		System.out.println("Appliance added: " + isApplianceAdded);

		isApplianceAdded = Girias.createHomeAppliance("Induction Cooker");
		System.out.println("Appliance added: " + isApplianceAdded);

		isApplianceAdded = Girias.createHomeAppliance("Water Purifier");
		System.out.println("Appliance added: " + isApplianceAdded);

		isApplianceAdded = Girias.createHomeAppliance("Hair Dryer");
		System.out.println("Appliance added: " + isApplianceAdded);

		isApplianceAdded = Girias.createHomeAppliance("Electric Kettle");
		System.out.println("Appliance added: " + isApplianceAdded);

		isApplianceAdded = Girias.createHomeAppliance("Toaster");
		System.out.println("Appliance added: " + isApplianceAdded);

		isApplianceAdded = Girias.createHomeAppliance("Blender");
		System.out.println("Appliance added: " + isApplianceAdded);

		Girias.getHomeAppliances();
	}
}
