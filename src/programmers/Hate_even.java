package programmers;

public class Hate_even {
    public static void main(String[] args) {
        int[] answer = sol(10);
        for(int i=0; i< answer.length; i++) {
            System.out.print(answer[i]);
        }
    }

    public static int[] sol(int n) {
        // answer[n+1 / 2]
        // for문으로 배열값 넣기
        int[] answer = new int[(n+1) / 2];
        for(int i=0; i< answer.length; i++){
            answer[i] = 2*i+1;
        }
        return answer;
    }
}
