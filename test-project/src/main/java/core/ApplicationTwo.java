package core;

public class ApplicationTwo {

    public String coveredMethod(String str) {
        String base = "base_";
        return base + str;
    }

    public String notCoveredMethod() {
        return "I'm not covered";
    }

    public String coveredConditionsMethod(boolean bool) {
        return bool ? "I'm true" : "I'm false";
    }

    public String halfCoveredConditionsMethod(boolean bool) {
        return bool ? "I'm true" : "I should be not covered";
    }

}
