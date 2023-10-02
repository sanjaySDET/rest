package pojoClasses;

public class ProjectLibrary {

	String Firstname;
	String Lastname;
	int age;
	String mail;
	
	public ProjectLibrary(String Firstname,String Lastname,int age,String mail)
	{
		this.Firstname=Firstname;
		this.Lastname=Lastname;
		this.age=age;
		this.mail=mail;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}
