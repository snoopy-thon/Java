package programmers;

public class AntArmy {
    public int solution(int hp) {
        int sum = 0;
        int []antAttackArr = {5,3,1};
//      1. 장군개미로 나눈다 sum += 23/5, hp = 23%5
//      2. sum += hp / 3, hp = hp % 3
//      3. sum += hp / 1

        for(int i:antAttackArr){
            sum += hp / i;
            hp = hp % i;
        }

        return sum;
    }
}
