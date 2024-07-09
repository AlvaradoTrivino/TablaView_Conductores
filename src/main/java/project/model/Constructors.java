package project.model;

//Kevin Steven lema Coro
public class Constructors {

	/*
	 * ? Estructure
	 * constructorid int
	 * constructorRef String
	 * name String
	 * nationality String
	 * url String
	 */

	int constructorId;
	String constructorRef;
	String constructorName;
	String constructorNationality;
	String constructorUrl;

	public Constructors(int constructorId, String constructorRef, String constructorName, String constructorNationality,
			String constructorUrl) {
		this.constructorId = constructorId;
		this.constructorRef = constructorRef;
		this.constructorName = constructorName;
		this.constructorNationality = constructorNationality;
		this.constructorUrl = constructorUrl;
	}

	public int getConstructorId() {
		return constructorId;
	}

	public void setConstructorId(int constructorId) {
		this.constructorId = constructorId;
	}

	public String getConstructorRef() {
		return constructorRef;
	}

	public void setConstructorRef(String constructorRef) {
		this.constructorRef = constructorRef;
	}

	public String getConstructorName() {
		return constructorName;
	}

	public void setConstructorName(String constructorName) {
		this.constructorName = constructorName;
	}

	public String getConstructorNationality() {
		return constructorNationality;
	}

	public void setConstructorNationality(String constructorNationality) {
		this.constructorNationality = constructorNationality;
	}

	public String getConstructorUrl() {
		return constructorUrl;
	}

	public void setConstructorUrl(String constructorUrl) {
		this.constructorUrl = constructorUrl;
	}

}
