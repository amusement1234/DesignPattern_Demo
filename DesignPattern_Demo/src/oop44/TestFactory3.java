package oop44;

//工厂方法
public class TestFactory3 {

    public static IRuleConfigParser createParser(String configFormat) {
        IRuleConfigParserFactory factory = null;
        if ("json".equalsIgnoreCase(configFormat))
            factory = new JsonRuleConfigParserFactory();
        else if ("xml".equalsIgnoreCase(configFormat))
            factory = new JsonRuleConfigParserFactory();

        return factory.createParser();
    }
}
