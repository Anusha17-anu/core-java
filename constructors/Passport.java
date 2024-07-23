class Passport
{
	 String cprLocation;
	 int dcdrLocation;
	 String surName;
	 String giveName;
	 String dob;
	 String email;
	 boolean isEmailLoginSame;
	 String loginId;
	 String pwd;
	 String confirmPwd;
	 String hintQues;
	 String hintAns;
	 public Passport(String cprLocation, int dcdrLocation, String surName, 
	String giveName, String dob, String email, boolean isEmailLoginSame, 
	String loginId, String pwd, String confirmPwd, String 
	hintQues, String hintAns)
	{
		this.cprLocation = cprLocation;
		this.dcdrLocation = dcdrLocation;
		this.surName = surName;
		this.giveName = giveName;
		this.dob = dob;
		this.email = email;
		this.isEmailLoginSame = isEmailLoginSame;
		this.loginId = loginId;
		this.pwd = pwd;
		this.confirmPwd = confirmPwd;
		this.hintQues = hintQues;
		this.hintAns = hintAns;
	}
	public  boolean createPassport(String cprLocation, int dcdrLocation, String surName, 
	String giveName, String dob, String email, boolean isEmailLoginSame, 
	String loginId, String pwd, String confirmPwd, String 
	hintQues, String hintAns)
	{
		boolean isPassportDataCreated = false;
		if(cprLocation!=null && dcdrLocation>=0 && surName!=null && giveName!=null && dob!=null && email!=null && isEmailLoginSame==true && loginId!=null && pwd!=null && confirmPwd!=null &&  hintQues!=null && hintAns!=null){
		this.cprLocation = cprLocation;
		this.dcdrLocation = dcdrLocation;
		this.surName = surName;
		this.giveName = giveName;
		this.dob = dob;
		this.email = email;
		this.isEmailLoginSame = isEmailLoginSame;
		this.loginId = loginId;
		this.pwd = pwd;
		this.confirmPwd = confirmPwd;
		this.hintQues = hintQues;
		this.hintAns = hintAns;
		isPassportDataCreated=true;
		System.out.println("the passport is created");
		}
		
		return isPassportDataCreated;
	}
	
	public  void getPassportDetails()
	{
		System.out.println("Person cprLocation : " + cprLocation);
		System.out.println("Person dcdrLocation : " + dcdrLocation);
		System.out.println("Person surName : " + surName);
		System.out.println("Person giveName : " + giveName);
		System.out.println("Person dob : " + dob);
		System.out.println("Person email : " + email);
		System.out.println("Person isEmailLoginSame : " + isEmailLoginSame);
		System.out.println("Person loginId : " + loginId);
		System.out.println("Person pwd : " + pwd);
		System.out.println("Person confirmPwd : " + confirmPwd);
		System.out.println("Person hintQues : " + hintQues);
		System.out.println("Person hintAns : " + hintAns);
		
		return;
	}


}