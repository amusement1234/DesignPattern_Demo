package oop44;

public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {

    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }

}
