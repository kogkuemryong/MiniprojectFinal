package Final;


class DTO_Member {
	
	private String name;
	private String tel;
	private String id;
	private String pw;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	//DTO 객체 확인
	@Override
	public String toString() {
		 return "InFoDTO [name=" + name + ", tel=" + tel + ", id=" + id
	                + ", pw="  + pw + "]";

	}
	

}
