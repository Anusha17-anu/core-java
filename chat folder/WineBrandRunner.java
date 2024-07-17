class WineBrandRunner{

public static void main(String wine[]){

System.out.println("main started");
    boolean wineCreate=WineBrand.createWineNames("Kendall Jackson");
	System.out.println(wineCreate);
	wineCreate=WineBrand.createWineNames("Wycliff");
	System.out.println(wineCreate);
	wineCreate=WineBrand.createWineNames("Yellow Tail");
	System.out.println(wineCreate);
	wineCreate=WineBrand.createWineNames("Belair");
	System.out.println(wineCreate);
	wineCreate=WineBrand.createWineNames("Copper Ridge Vineyards");
	System.out.println(wineCreate);
	wineCreate=WineBrand.createWineNames("Brut");
	System.out.println(wineCreate);
	wineCreate=WineBrand.createWineNames("Sutter");
	System.out.println(wineCreate);
	wineCreate=WineBrand.createWineNames("Cartier");
	System.out.println(wineCreate);
	wineCreate=WineBrand.createWineNames("Martini");
	System.out.println(wineCreate);wineCreate=WineBrand.createwineNames("Foxhorn");
	System.out.println(wineCreate);
	wineCreate=WineBrand.createWineNames("Beringer Vineyards");
	System.out.println(wineCreate);
	wineCreate=WatchBrand.createWatchNames("Sutter Home");
	System.out.println(wineCreate);
	wineCreate=WineBrand.createWineNames("Cavit");
	System.out.println(wineCreate);
	wineCreate=WineBrand.createWineNames("BridleWood");
	System.out.println(wineCreate);
	wineCreate=WineBrand.createWineNames("Red Rock");
	System.out.println(wineCreate);
	
	WineBrand.getWineNames();
	boolean wineUpdate=WineBrand.updateWineNames("Martini","Cellars");
	WineBrand.getWineNames();
	System.out.println("main ended");
	

}


}