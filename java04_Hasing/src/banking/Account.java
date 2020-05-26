package banking;
/*
 * 통장의 정보를 저장하는 클래스
 */
public class Account {
	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	
	
	public double getBalance() {
		return balance;
	}


	public void deposit(double amt) {
		//balance = balance + amt; 여기서는 this. 안 붙임. 왜냐하면 필드이니까
		//근데 개발자들은 위와 같이 코딩 안 함
		balance += amt; // 이게 성능이 좋음
	}
	public void withdraw(double amt) {
		balance -= amt;
	}

}
