class WatchBrandRunner{

public static void main(String watch[]){

System.out.println("main started");
    boolean watchCreate=WatchBrand.createWatchNames("Citizen");
	System.out.println(watchCreate);
	watchCreate=WatchBrand.createWatchNames("Rolex");
	System.out.println(watchCreate);
	watchCreate=WatchBrand.createWatchNames("Seiko");
	System.out.println(watchCreate);
	watchCreate=WatchBrand.createWatchNames("Belair");
	System.out.println(watchCreate);
	watchCreate=WatchBrand.createWatchNames("Tissot");
	System.out.println(watchCreate);
	watchCreate=WatchBrand.createWatchNames("Obaku");
	System.out.println(watchCreate);
	watchCreate=WatchBrand.createWatchNames("Movado");
	System.out.println(watchCreate);
	watchCreate=WatchBrand.createWatchNames("Cartier");
	System.out.println(watchCreate);
	watchCreate=WatchBrand.createWatchNames("Shinola");
	System.out.println(watchCreate);
	watchCreate=WatchBrand.createWatchNames("Tudor");
	System.out.println(watchCreate);
	WatchBrand.getWatchNames();
	boolean watchUpdate=WatchBrand.updateWatchNames("Seiko","Hubert");
	WatchBrand.getWatchNames();
	System.out.println("main ended");
	

}


}