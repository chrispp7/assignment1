package models;

public class User {

    private String fName, lName, gender, birthDate, wAddress, hAddress;

    public User() {
	super();
    }

//	public User(String fName, String lName, String wAddress, String hAddress) {
//		super();
//		this.fName = fName;
//		this.lName = lName;
//		this.wAddress = wAddress;
//		this.hAddress = hAddress;
//	}
//	
    public User(String fName, String lName, String gender, String birthDate) {
	super();
	this.fName = fName;
	this.lName = lName;
	this.gender = gender;
	this.birthDate = birthDate;
    }

    public String getfName() {
	return fName;
    }

    public void setfName(String fName) {
	this.fName = fName;
    }

    public String getlName() {
	return lName;
    }

    public void setlName(String lName) {
	this.lName = lName;
    }

    public String getGender() {
	return gender;
    }

    public void setGender(String gender) {
	this.gender = gender;
    }

    public String getBirthDate() {
	return birthDate;
    }

    public void setBirthDate(String birthDate) {
	this.birthDate = birthDate;
    }

    public String gethAddress() {
	return hAddress;
    }

    public void sethAddress(String hAddress) {
	this.hAddress = hAddress;
    }

    @Override
    public String toString() {
	return "User [fName=" + fName + ", lName=" + lName + ", gender=" + gender + ", birthDate=" + birthDate + "]";
    }
}
