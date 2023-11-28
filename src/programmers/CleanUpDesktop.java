package programmers;

public class CleanUpDesktop {
    public int[] solution(String[] wallpaper) {
        // lux : 가장 위에 있는 #의 인덱스 찾기
        // luy : 2차원 배열에서 가장 왼쪽에 있는 #의 인덱스 찾기
        // rdx : 가장 밑에 있는 #의 인덱스+1 찾기
        // rdy : 가장 오른쪽에 있는 #의 인덱스+1 찾기

        int lux = wallpaper.length-1;
        int luy = wallpaper[0].length() - 1;
        int rdx = 1;
        int rdy = 1;

        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j)=='#'){
                    if(lux >= i) lux = i;
                    if(luy >= j) luy = j;
                    if(rdx <= i+1) rdx = i+1;
                    if(rdy <= j+1) rdy = j+1;
                }
            }
        }

        int[] answer = {lux,luy,rdx,rdy};



        return answer;
    }
}
