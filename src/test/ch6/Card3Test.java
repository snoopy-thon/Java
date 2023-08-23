package ch6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Card3Test {

   @Test
    void testRank(){
        Card3[] arr = new Card3[5];
        arr[0] = new Card3("H",5);
        arr[1] = new Card3("H",4);
        arr[2] = new Card3("H",7);
        arr[3] = new Card3("H",8);
        arr[4] = new Card3("D",6);

        Card3 c = new Card3();
        System.out.println(c. rankCheck(arr));
        assertEquals("STRAIGHT",c.rankCheck(arr));
    }

}