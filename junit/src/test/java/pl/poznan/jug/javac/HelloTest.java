package pl.poznan.jug.javac;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void shouldReturnSavedName() {
        //given
        String name = "junit";

        //when
        Hello hello = new Hello(name);

        //then
        assertEquals(name, hello.getName());
    }
}
