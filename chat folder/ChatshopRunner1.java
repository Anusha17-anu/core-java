class ChatshopRunner1{
public static void main(String[] shop){
	
boolean addedchat=Chatshop.createchatName("Bhelpuri");
System.out.println("the given chat is :"+addedchat);

addedchat=Chatshop.createchatName("panipuri");
System.out.println("the given chat is :"+addedchat);


addedchat=Chatshop.createchatName("sev puri");
System.out.println("the given chat is :"+addedchat);

addedchat=Chatshop.createchatName("masala lpuri");
System.out.println("the given chat is :"+addedchat);

addedchat=Chatshop.createchatName("tikki puri");
System.out.println("the given chat is :"+addedchat);

addedchat=Chatshop.createchatName("dahi puri");
System.out.println("the given chat is :"+addedchat);

Chatshop.getchatName();

boolean nextchat=Chatshop.chatUpdated("tikki puri","kachori");
System.out.println("the given chat is" +nextchat);
Chatshop.getchatName();

boolean deletedchat=Chatshop.deleteChatName("tikkipuri");
System.out.println("the deleleted chat is :" +deletedchat);
Chatshop.getchatName();
}
}
