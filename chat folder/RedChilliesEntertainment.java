import java.util.Arrays;
class RedChilliesEntertainment {

	static String movieActors[] = {null, null, null, null, null, null, null, null, null,null};
	static int index = 0;

	public static boolean addMovieActors(String actorName){

		boolean isActorAdded = false;
		if(actorName != null){
			movieActors[index] = actorName;
			index++;
			isActorAdded = true;
		}
		else {
			System.out.println("Invalid actor name Added");
		}
		
	return isActorAdded;
	}

	public static void getMovieActors(){
		System.out.println("The movie actors available are:");
		for(String actor : movieActors){
			if(actor != null){
				System.out.println(actor);
			}
		}
	public static boolean deleteMoveisActor(String moveinameToBeDeleted){
	System.out.println("deletemoveiName is started");
	boolean ismoveiNameDeleted=false;
	int newIndex,oldIndex;
	for(newIndex=0, oldIndex=0;oldIndex < movieActors.length;oldIndex++){
	if(movieActors[oldIndex]!=moveinameToBeDeleted)
	{
		movieActors[newIndex]=movieActors[oldIndex];
		newIndex++;
	}
	}
	movieActors=Arrays.copyOf(movieActors,newIndex);
	if(movieActors!=null){
		ismoveiNameDeleted=true;
	}
	if(ismoveiNameDeleted==false){
		System.out.println(moveinameToBeDeleted+"notfound");
		
	}
	
	System.out.println("deletemoveiName is ended");
	return ismoveiNameDeleted;
}
}
