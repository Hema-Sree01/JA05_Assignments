package jdbcdemos;

public class student {

	private int rn;
	private String sname;
	private String branch;

	public student() {

	}

	public student(int rn, String sname, String branch) {
		super();
		this.rn = rn;
		this.sname = sname;
		this.branch = branch;
	}

	public int getrn() {
		return rn;
	}

	public void setrn(int rn) {
		this.rn = rn;
	}

	public String getsname() {
		return sname;
	}
}