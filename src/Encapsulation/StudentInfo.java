package Encapsulation;

public class StudentInfo extends CollegeSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentInfo SI=new StudentInfo();
		SI.setSt_Nm("Saiprasad");
		SI.setSt_RN(3854);
		SI.setSt_Id(1205390048);
		SI.setSt_Branch("Engineering");
		
		System.out.println(SI.getSt_Nm());
		System.out.println(SI.getSt_RN());
		System.out.println(SI.getSt_Id());
		System.out.println(SI.getSt_Branch());		
	}

}
