package banking.test;

import banking.Customer;
import banking.Account;

public class BankClientTest {

	public static void main(String[] args) {
		/*
		 * james라는 이름의 고객을 생성... 주민번호는 1234
		 * James가 잔액 10,000원을 가진 계좌를 하나 개설
		 * 새로 만든 계좌를 통해서
		 * 5,000원, 12,000원을 입급함
		 * 7,000원을 출금함
		 * 최종적으로 James통장의 잔액을 출력
		 */
		Customer custom1 = new Customer("James", 1234);
		custom1.setAccount(new Account(10000)); // 통장 개설, 클래스 데이터 수준의 값은 객체니까 무조건 new
		//객체가 association되어 있으면 즉 Customer 안에 Account가 있으면 
		
		Account james=custom1.getAccount(); // 중요
		System.out.println("12000을 입금합니다");
		james.deposit(12000.0);
		
		System.out.println("5000원을 입금합니다");
		james.deposit(5000);
		
		System.out.println("7000원을 출금합니다.");
		james.withdraw(7000);
		
		System.out.println("James's GetBalance");
		System.out.println(james.getBalance());
		

	}

}
