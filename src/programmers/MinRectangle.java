package programmers;

public class MinRectangle  {
    public int solution(int[][] sizes) {
        // 1. 가로, 세로의 길이를 비교하여 큰 숫자를 가로에 넣기
        // 2. 가로에서 가장 큰 숫자 찾기
        // 3. 세로에서 가장 큰 숫자 찾기
        // 4. 두 수를 곱하기
        int answer;
        int maxW = sizes[0][0];
        int maxH = sizes[0][1];
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = 0;
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }

        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] > maxW){
                maxW = sizes[i][0];
            }
            if(sizes[i][1] > maxH){
                maxH = sizes[i][1];
            }
        }
        answer = maxW * maxH;
        return answer;
    }
}
