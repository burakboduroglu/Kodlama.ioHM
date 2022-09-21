
public class Teacher extends User {

	private String _Detail;
	
	public Teacher() {
		
	}

	public Teacher(String _Detail) {
		super();
		this._Detail = _Detail;
	}

	public String getDetail() {
		return _Detail;
	}

	public void setDetail(String detail) {
		_Detail = detail;
	}
}
