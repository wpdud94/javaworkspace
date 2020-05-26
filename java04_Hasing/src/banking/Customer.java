package banking;
/*
 * 통장을 개설하고자 하는 고객의 정보를 보여주는 클래스
 * Coustomer + Account ---> Has a Relation
 * Hasing 절차
 * 1. 필드에 Account 선언
 * 2. Account를 주입 ---> 생성자 or setter로 주입(이게 전부)
 */
public class Customer {
	// account와 loose관계
	private String name;
	private int ssn;
	
	//추가
	private Account account;
	private Account balance;

	public Customer(String name, int ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	public void setAccount(Account Account) {
		this.account = Account;
	}

	public Account getAccount() {
		return account;
	}
	public String getCustInf() {
		return name+", "+ssn;
	}
	
	

}
