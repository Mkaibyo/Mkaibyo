import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.sequence.Sequence;
import components.sequence.Sequence1L;

public class GlossaryTest {

    @Test
    public void order_colors() {
        Sequence<String> test = new Sequence1L<>();
        test.add(0, "red");
        test.add(1, "blue");
        test.add(2, "yellow");
        test.add(3, "white");
        Sequence<String> expected = new Sequence1L<>();
        expected.add(0, "blue");
        expected.add(1, "red");
        expected.add(2, "white");
        expected.add(3, "yellow");
        Glossary.order(test);
        assertEquals(expected, test);
    }

    @Test
    public void order_hellos() {
        Sequence<String> test = new Sequence1L<>();
        test.add(0, "hello");
        test.add(1, "hola");
        test.add(2, "hi");
        test.add(3, "heya");
        Sequence<String> expected = new Sequence1L<>();
        expected.add(0, "hello");
        expected.add(1, "heya");
        expected.add(2, "hi");
        expected.add(3, "hola");
        Glossary.order(test);
        assertEquals(expected, test);
    }

    @Test
    public void order_withnums() {
        Sequence<String> test = new Sequence1L<>();
        test.add(0, "hello1");
        test.add(1, "hello3");
        test.add(2, "heya9");
        test.add(3, "heya1");
        Sequence<String> expected = new Sequence1L<>();
        expected.add(0, "hello1");
        expected.add(1, "hello3");
        expected.add(2, "heya1");
        expected.add(3, "heya9");
        Glossary.order(test);
        assertEquals(expected, test);
    }

}
