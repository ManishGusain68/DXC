package springmvc.Model;

public class User {

	private String fullName;
	private String email;

	public User(String fullName, String email) {
		super();
		this.fullName = fullName;
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [fullName=" + fullName + ", email=" + email + "]";
	}

}
