package nl.wiggert.cleancode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void bla() throws Exception {

        assertThat(1 + 1, is(2));


    }
}
