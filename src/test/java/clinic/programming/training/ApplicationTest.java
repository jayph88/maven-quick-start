package clinic.programming.training;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {
    private Application app;

    @Before
    public void setup() {
        app = new Application();
    }


    @Test
    public void testWordCountString() {
        int count = app.wordcount("this is a test");
        assertTrue(count == 4);
    }

    @Test
    public void testWordCountEmpty() {
        int count = app.wordcount("");
        assertTrue(count == 0);
    }

    @Test
    public void testWordCountNull() {
        int count = app.wordcount(null);
        assertTrue(count == 0);
    }

    @Test
    @Ignore
    public void testWordCountMore() {
        int count = app.wordcount("this will be skipped");
        assertTrue(count == 3);
    }

    @Test
    public void testWordCountSingle() {
        int count = app.wordcount("test");
        assertTrue(count == 1);
    }
}
