package com.lxisoft.view;
public class ContactView
{
	public static Scanner scanner = new Scanner(System.in);
	private ContactControler controler ;
	public static void main(String[] args)
	{
		ContactView view = new ContactView();
		view.displayOrAddContact(); 
	}
	public void displayOrAddContact()
	{
		controler = new ContactControler(); 
		boolean isTrue = false;
		do
		{
			isTrue = false;
			System.out.println("Press ==> 1.Display All Contact 2.Add New Contact");
			int select = scanner.nextInt();
			switch(select)
			{
				case 1:
					this.displayAllContacts()
					isTrue = true;
					break;
				case 2:
					this.addNewContacts(controler.contacts);
					isTrue = true;
					break;
				default :
					System.out.println("Select options From Above")
					break;
			}
		}while(isTrue);
	}
	public void addNewContacts(ArrayList<ContactModel> contacts)
	{
		contacts.add(new ContactModel());
		for(int i=0;i<contacts.size();i++)
		{
			if(contacts.get(i).getId()==null)
			{
				System.out.println("Enter contactID");
				contacts.get(i).setId(scanner.nextInt());
				System.out.println("Enter Contact Name");
				contacts.get(i).setName(scanner.next());
				System.out.println("Enter Contact Number");
				contacts.get(i).setPhoneNumber(scanner.nextLong());
				break;
			}
		}
	}
	public void displayAllContacts()
	{

	}
}