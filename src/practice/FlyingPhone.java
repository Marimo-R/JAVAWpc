package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
    // プログラムを作成
	private int min;
	
	public FlyingPhone(int min) {
		this.min = min;		
	}
	
	public void fly() {
		System.out.println(this.min + "分間、飛びます。");
	}
	
	public void call(String number) {
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです。");
	}
	
	public void powerOff() {
		Flying.super.powerOff();
	}
}