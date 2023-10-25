package programmers;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    public static void main(String[] args) {

        int answer = 425;
        int guessNum = 452;
        int strike = 0;
        int ball = 0;

        int[] answerArr = new int[3];
        int[] guessArr = new int[3];
        //String userInput = Console.readLine();
        List<Integer> computer = new ArrayList<>(){{
            add(guessNum / 100);
            add(2);
            add(3);
        }};
        // 배열에 한자리씩 넣기
        answerArr[0] = answer / 100; // 4
        answerArr[1] = (answer % 100) / 10; // 2
        answerArr[2] = (answer % 100) % 10; // 5

        guessArr[0] = guessNum / 100;
        guessArr[1] = (guessNum % 100) / 10;
        guessArr[2] = (guessNum % 100) % 10;

        for(int i=0; i<answerArr.length; i++){
            for(int j=0; j<guessArr.length; j++){
                if(answerArr[i] == guessArr[j]) {
                    if(i==j){
                        strike++;
                    }else{
                        ball++;
                    }
                }
            }
        }
        if(strike==0 && ball==0){
            System.out.println("nothing!");
        }

        System.out.printf("%d 스트라이크, %d 볼 입니다.",strike,ball);



    }


}
