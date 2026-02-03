package kr.co.training;

public class Ex21_3_Sorceress {
	// Charactor 클래스를 상속 받습니다.
	Ex21_3_CharacterAbility ca;
	
	// 소서리스 객체 생성 시 힘10, 민첩7, 지력 35로 생성됩니다.
	Ex21_3_Sorceress(Ex21_3_CharacterAbility ca) {
		this.ca = ca;
	}
	
	// attack 메서드 (오버라이딩)
	//	- "지팡이를 휘두릅니다." 출력
	//	- 경험치 25 증가, 체력 10 감소
	//	- 체력이 10 미만일 경우 "체력이 부족합니다." 출력
	@Override
	public void attack() {
		
	}
	
	// skil 메서드 (오버라이딩)
	//	- "아이스 애로우를 사용합니다." 출력
	//	- 경험치 37 증가, 마력 23 감소
	//	- 마력이 23 미만일 경우 "마력이 부족합니다." 출력
	
	// levelUp 메서드
	//  - "레벨업을 하여 지력이 5 증가합니다." 출력
	//	- 지력 5 증가
	
}



















