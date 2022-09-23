package Test923;

import java.util.Scanner;

public class Bank {
	String name= "자바맨";
	String bankNum = "123-456";
	static int balance = 1000; //잔액
	
	int outcash; //인출
	int incash;
	
	void outmoney(int outcash){
		this.outcash = outcash;
		balance = balance-outcash;
		if(balance<0) {
			System.out.println("잔액이 부족합니당");
		}else {
			System.out.println("인출금은" + outcash);
		}
	}
		
	void inmoney(int incash){
		balance += incash;
		System.out.println(balance);
		balance += incash;
		System.out.println(balance);
	}
	
	public String toString() {
		return( "예금주 : " + name + " / 계좌번호 : " + bankNum + " / 잔액 : " + balance) ;
	}
		


	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		
		System.out.println(b.toString());
		
		System.out.println("얼마인출하실꺼에요?");
		b.outmoney(sc.nextInt());
		System.out.println(balance +"원남으셨습니다");
	
		
		System.out.println("얼마입금하실꺼임?");
		b.inmoney(sc.nextInt());
		System.out.println(balance +"원남으셨습니다");
	
	}

}
