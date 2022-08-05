package Abstraction;

public abstract class StudentData {
	private int St_RN;
	private String St_Nm;
	
	public int getSt_RN() {
		return St_RN;
	}
	public void setSt_RN(int St_RN) {
		this.St_RN = St_RN;
	}
	public String getSt_Nm() {
		return St_Nm;
	}
	public void setSt_Nm(String St_Nm) {
		this.St_Nm = St_Nm;
	}
	abstract void CGL_Nm();
	abstract void CGL_StBranch();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
