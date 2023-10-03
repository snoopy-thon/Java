package programmers;
// 군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
// 암호화된 문자열 cipher를 주고받습니다.
// 그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
public class CipherDecode {

        public String solution(String cipher, int code) {
            String answer = "";
            // for문을 돌린다. for(int i=4-1; i<cipher.length(); i+=4)
            // 해당하는 값을 result에 넣는다.

            for(int i=code-1; i<cipher.length(); i+=code){
                answer += cipher.charAt(i);
            }
            return answer;
        }

}
