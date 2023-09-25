package programmers;
import java.util.ArrayList;
public class CalMultiple {

        public int[] solution(int n, int[] numlist) {
            // 1. 3의 배수인지 아닌지 확인
            //      numlist를 3으로 나눴을때 나머지가 0이면 3의 배수
            //      for문으로 numlist의 요소들을 numlist % n == 0 한다.
            //      나머지가 0일 경우 answer arraylist에 추가한다.
            // 2. arraylist를 배열로 바꾼다.
            //      바꾼 배열을 return한다.

            ArrayList<Integer> answer = new ArrayList<>();
            for(int i : numlist){
                if(i % n == 0)
                    answer.add(i);
            }
            int[] answer2 = answer.stream().mapToInt(i->i).toArray();



            return answer2;
        }

}
