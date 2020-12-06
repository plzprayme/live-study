import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class StandardTests {

    @BeforeAll
    static void initAll() {
        System.out.println("BEFORE ALL");
    }

    @BeforeEach
    void init() {
        System.out.println("BEFORE EACH");
    }

    @Test
    void succeedingTest(){}

    @Test
    @DisplayName("Hello JUnit")
    void fallingTest() {
        assumeTrue(true);
    }

    @Test
//    @Disabled("for demonstration purposes")
    void skippedTest() {}

    @Test
    void abortedTest() {
        assumeTrue(true);
    }

    @AfterEach
    void tearDown() {}

    @AfterAll
    static void tearDownAll() {}
}
