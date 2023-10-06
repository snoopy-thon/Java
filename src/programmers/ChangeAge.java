package programmers;

public class ChangeAge {
    public String solution(int age) {
        String answer = "";
        // age / 10 -> 몫이 0일때까지 나눈다.
        // age % 10 -> 끝자리 수 뽑아내기
        // 숫자에 해당하는 알파벳을 answer에 추가한다.
        // a->0, b->1, c->2, d->3, e->4, f->5, ..., j->9
        while(true){
            switch(age % 10){
                case 0:
                    answer += "a";
                    age = age / 10;
                    break;
                case 1:
                    answer += "b";
                    age = age / 10;
                    break;
                case 2:
                    answer += "c";
                    age = age / 10;
                    break;
                case 3:
                    answer += "d";
                    age = age / 10;
                    break;
                case 4:
                    answer += "e";
                    age = age / 10;
                    break;
                case 5:
                    answer += "f";
                    age = age / 10;
                    break;
                case 6:
                    answer += "g";
                    age = age / 10;
                    break;
                case 7:
                    answer += "h";
                    age = age / 10;
                    break;
                case 8:
                    answer += "i";
                    age = age / 10;
                    break;
                case 9:
                    answer += "j";
                    age = age / 10;
                    break;
            }

            if(age == 0)
                break;
        }
        StringBuffer sb = new StringBuffer(answer);
        String reversedAnswer = sb.reverse().toString();
        return reversedAnswer;
    }
}

