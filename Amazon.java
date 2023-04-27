//Constructor Overloading
class Amazon
{
	String uname;
	String password;
	String reenterpwd;
	long mob;
	String mail;
	
	String location;
	long amob;
	String dob;
	int age;
	
	Amazon()
	{
	}
	
	Amazon(String uname,String password,String reenterpwd,long mob,String mail)
	{
		this.uname=uname;
		this.password=password;
		this.reenterpwd=reenterpwd;
		this.mob=mob;
		this.mail=mail;
	}
	
	Amazon(String uname,String password,String reenterpwd,long mob,String mail,String location)
	{
		this.(uname,password,reenterpwd,mob,mail);
		this.location=location;
	}
	
	Amazon(String uname,String password,String reenterpwd,long mob,String mail,String location,long amob)
	{
		this.(uname,password,reenterpwd,mob,mail,location);
		this.amob=amob;
	}
	
	Amazon(String uname,String password,String reenterpwd,long mob,String mail,String location,long amob,String dob)
	{
		this.(uname,password,reenterpwd,mob,mail,location,amob);
		this.dob=dob;
	}
	
	Amazon(String uname,String password,String reenterpwd,long mob,String mail,String location,long amob,String dob,int age )
	{
		this.(uname,password,reenterpwd,mob,mail,location,amob,dob);
		this.age=age;
	}
	
	public void displayAmazonAcc()
	{
		
		System.out.println("Name of Customer: "+uname);
		System.out.println("Password: "+password);
		System.out.println("Re-enter password: "+reenterpwd);
		System.out.println("Mobile number: "+mob);
		System.out.println("Email ID: "+mail);
		System.out.println("Location: "+location);
		System.out.println("Alternative number: "+amob);
		System.out.println("Date of birth: "+dob);
		System.out.println("Age: "+age);
		System.out.println("=========================================================================");
	}
}