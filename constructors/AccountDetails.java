class AccountDetails{
int customerId;
String bankName;
int accountNo;
String accType;
public AccountDetails(int customerId,String bankName,int accountNo,String accType){
	System.out.println("the account details are inovked");
this.customerId=customerId;
this.bankName=bankName;
this.accountNo=accountNo;
this.accType=accType;
}
public boolean createAccount(int customerId,String bankName,int accountNo,String accType){
boolean iscreateaccount=false;
if(customerId>0 && bankName!=null && accountNo>0 && accType!=null){
this.customerId=customerId;
this.bankName=bankName;
this.accountNo=accountNo;
this.accType=accType;
iscreateaccount=true;
System.out.println("the account is created");
}
return iscreateaccount;
}
public void getAccountdetails(){
System.out.println("the customerId is "+customerId);
System.out.println("the bankName is "+bankName);
System.out.println("the accountNo is"+accountNo);
System.out.println("the accType is"+accType);
return;
}
}