package Abstraction;

public class Result extends StudentData {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result SD = new Result();
		SD.setSt_RN(385400);
		SD.setSt_Nm("Saiprasad");
		System.out.println(SD.getSt_RN());
		System.out.println(SD.getSt_Nm());

	}

	@Override
	void CGL_Nm() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void CGL_StBranch() {
		// TODO Auto-generated method stub
		
	}

}
