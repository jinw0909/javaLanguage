package ex04;

public class JypEntertainment {
	
	// 오디션 공고
	
	// 연기자 오디션
	// 연기 기능을 가진 사람만 받자
	public void actorAudition(Act actor) {
		actor.act();
	};
	
	// 아이돌 오디션
	// 노래 기능을 가진 사람만 받자
	public void idolAudition(Sing singer) {
		singer.sing();
	};
}
