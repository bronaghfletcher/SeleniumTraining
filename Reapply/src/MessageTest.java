import org.junit.jupiter.api.BeforeAll;

public class MessageTest {

    protected void setUp() throws Exception {
        message = new Message();
    }

    private Message message;

    @BeforeEach
    public void setUp() throws Exception {
        message = new Message();
    }


    @Test
    public void testGetMessageFor() {
        String expected;
        String actual;
        expected = "Hello, world!";
        actual = message.getMessageFor();
        assertEquals(expected, actual);
    }



}
