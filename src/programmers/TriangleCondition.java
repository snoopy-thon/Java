package programmers;

public class TriangleCondition {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0],sides[1]);
        int min = Math.min(sides[0],sides[1]);
        // 1. 주어진 두 변(a,b) 중 하나가 가장 긴 변일 경우
        //    c는 b-a보다는 크고 a,b중 큰 수보다 작거나 같아야 한다.
        // 2. 새로운 변(c)이 가장 긴 변일 경우
        //    c는 a+b의 합보다 작고 a,b중 큰 수보다 커야 한다.

        for(int c=max-min+1; c<=max; c++){
            answer++;
        }
        for(int c=max+1; c<max+min; c++){
            answer++;
        }

        return answer;
    }
}
