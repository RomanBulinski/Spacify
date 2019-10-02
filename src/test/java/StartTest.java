import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StartTest {

    @Test
    public void basicTest() {
        assertEquals("h e l l o   w o r l d",Start.spacify("hello world"));
        assertEquals("1 2 3 4 5",Start.spacify("12345"));
    }

}
