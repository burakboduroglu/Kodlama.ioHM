
public class Student extends User {

	private String _email;

	public Student() {

	}

	public Student(String email) {
		super();
		this._email = email;
	}

	public String get_email() {
		return _email;
	}

	public void set_email(String _email) {
		this._email = _email;
	}

}
