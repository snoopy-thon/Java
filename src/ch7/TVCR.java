package ch7;
// 예제 7-4
// 외부적으로는 TVCR 클래스의 인스턴스를 사용하는 것처럼 보이지만 내부적으로는 VCR클래스의 인스턴스를 생성해서 사용하는 것.
// VCR 클래스의 메서드의 내용이 변경되더라도 TVCR 클래스의 메서드들 역시 변경된 내용이 적용되는 결과를 얻을 수 있음.

class Tv2{
	boolean power;    // 전원상태(on/off)
	int channel;      // 채널
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class VCR{
	boolean power;
	int counter = 0;
	void power() {power = !power;}
	void play() { /* 내용생략*/ }
	void stop() { /* 내용생략*/ }
	void rew()  { /* 내용생략*/ }
	void ff()   { /* 내용생략*/ }
	
}
public class TVCR extends Tv2{
	VCR vcr = new VCR();
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}
