package core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationOneTest {

    private ApplicationOne application = new ApplicationOne();

    @Test
    void coveredMethod() {
        assertEquals("base_str", application.coveredMethod("str"));
    }

    @Test
    void coveredConditionsMethodTrue() {
        assertEquals("I'm true", application.coveredConditionsMethod(true));
    }

    @Test
    void coveredConditionsMethodFalse() {
        assertEquals("I'm false", application.coveredConditionsMethod(false));
    }

    @Test
    void halfCoveredConditionsMethodTrue() {
        assertEquals("I'm true", application.halfCoveredConditionsMethod(true));
    }

}
