class AccountDetailsRunner{
public static void main(String[] acct){
AccountDetails ref=new AccountDetails(1,"SBI",234567,"savings");
ref.getAccountdetails();
boolean res=ref.createAccount(1,"SBI",234567,"savings");
System.out.println(res);
ref.getAccountdetails();


}
}