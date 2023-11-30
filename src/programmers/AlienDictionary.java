package programmers;

public class AlienDictionary {
    public static int solution(String[] spell, String[] dic) {
        int answer = 2;
        char[] charSpell = new char[spell.length];

        for (int i = 0; i < dic.length; i++) {
            int result = 0;
            for (int j = 0; j < dic[i].length(); j++) {
                for (int k = 0; k < spell.length; k++) {
                    charSpell[k] = spell[k].charAt(0);
                    if (dic[i].charAt(j) == charSpell[k]) {
                        result += 1;
                        System.out.printf("dic[%d].charAt(%d) : %c, charSpell[%d] : %c, result : %d\n", i, j, dic[i].charAt(j), k, charSpell[k], result);
                    }
                }
            }
        System.out.println("result:" + result);
        if (result == spell.length) {
            answer = 1;
        }
    }
        return answer;
    }

    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic ={"sod", "eocd", "qixm", "adio", "soo"};
        System.out.println(solution(spell,dic));
    }
}
