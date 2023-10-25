package programmers;

public class ChangeAge2 {
    public String solution(int age) {
        String answer = "";
        // age / 10 -> 몫이 0일때까지 나눈다.
        // age % 10 -> 끝자리 수 뽑아내기
        // 숫자에 해당하는 알파벳을 answer에 추가한다.
        // a->0, b->1, c->2, d->3, e->4, f->5, ..., j->9
        while (age<0) {
            // 스위치문 안쓰고 해보기
            // 내일 다시 하기
        }
        StringBuffer sb = new StringBuffer(answer);
        String reversedAnswer = sb.reverse().toString();
        return reversedAnswer;
    }
}
