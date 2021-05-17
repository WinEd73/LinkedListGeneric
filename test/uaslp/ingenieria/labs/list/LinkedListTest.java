package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Test;
import uaslp.ingenieria.labs.list.list.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {

    //Given_When_then

    @Test
    public void givenANewList_ThenListIsEmpty(){
        //Given:

        //When:
        ArrayList<Integer> lista  = new ArrayList<>();

        //Then:
        //Aserciones -> asserts
        assertEquals(0, lista.getSize());
    }
}
