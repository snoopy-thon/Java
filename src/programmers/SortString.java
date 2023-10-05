package programmers;
import java.util.ArrayList;
import java.util.Collections;
public class SortString {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> arrList = new ArrayList<> ();
        // my_string을 한글자씩 판단한다.
        // 아스키코드값이 48~57이면 answer에 추가하기
        for(int i=0; i<my_string.length(); i++){
            char char_i = my_string.charAt(i);
            if(char_i>=48 && char_i<=57){
                arrList.add(char_i-'0');
            }
        }
        Collections.sort(arrList);
        return arrList;
    }
}
