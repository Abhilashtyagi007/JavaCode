package construtor;

public class Main {

	public static void main(String[] args) {
		//create contactManger object
		ContactsManager myContactManager= new ContactsManager();
		//create a new Contact object for James
		Contact friendJames = new Contact();
		//set the fields
		friendJames.name = "James";
		friendJames.phoneNumber = "00228844223399";
		//add James Contact to the contactManager
		myContactManager.addContact(friendJames);
		
		//create a new Contact object for Cezanne
		Contact friendCezanne = new Contact();
		
		//set the fields
		friendCezanne.name = "Cezanne";
		friendCezanne.phoneNumber = "987654322";
		
		//add Cezanne Contact to the contactManager
		myContactManager.addContact(friendCezanne);
		
		//create a new object for Jessica 
		Contact friendJessica = new Contact();
		
		//set the fields 
		friendJessica.name = "Jessica";
		friendJessica.phoneNumber = "33445225534";
		
		//add Contact to the contactManager 
		myContactManager.addContact(friendJessica);
		
		//now try to search and display contact their phone number
		Contact result = myContactManager.searchContact("James");
		
		System.out.println(result.phoneNumber);
		System.out.println(result.name);
	}

}
