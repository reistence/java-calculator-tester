package org.lessons;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringListTest {

 /*   @BeforeAll
    static void setup(){
        StringList list = new StringList();

    }*/
    @Test
    void addAndGet() {
        StringList list = new StringList();
        list.add("bho");
        assertEquals(list.get(0), "bho");
        list.add("foo");
        assertEquals(list.get(1), "foo");
    }


    @Test
    void size() {
        StringList list = new StringList();
        assertEquals(list.size(), 0);
        list.add("bho");
        assertEquals(list.size(), 1);
        list.add("foo");
        assertEquals(list.size(), 2);
    }

    @Test
    void clear() {
        StringList list = new StringList();
        list.add("bho");
        list.add("foo");
        list.clear();
        assertEquals(list.size(), 0);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
    }

    @Test
    void remove() {
        StringList list = new StringList();
        list.add("foo");
        list.add("bho");
        list.remove(1);
        assertEquals(list.size(), 1);
        assertEquals(list.get(0), "foo");
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(2));
    }


}