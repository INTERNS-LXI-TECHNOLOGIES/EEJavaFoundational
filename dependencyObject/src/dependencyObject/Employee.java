package dependencyObject;

public class Employee {
	private int id;  
	private String name;  
	private Address address;  
	  
	//setters and getters  
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAddress(Address address)
	{
		this.address=address;
	}
	public Address getAddress()
	{
		return address;
	}
	void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address);  
	}  
}
