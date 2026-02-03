package kr.co.training;

public class Ex21_Main {

	public static void main(String[] args) {
		Ex21_2_Warlord w = new Ex21_2_Warlord();
		
		w.walk();
		
		// ---------------------------------------
		// 케릭터의 능력치를 가진 객체
		Ex21_3_CharacterAbility ca = new Ex21_3_CharacterAbility();
		
		// 소서리스 객체
		Ex21_3_Sorceress sorceress = new Ex21_3_Sorceress(ca);
		sorceress.attack(ca);
		
	}

}

 






