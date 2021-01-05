package oop44;

import java.util.HashMap;
import java.util.Map;

//简单工厂（缓存）
public class TestFactory2 {
    private static Map<String, IRuleConfigParser> cache = new HashMap<>();
    static {
        cache.put("json", new JsonRuleConfigParser());
        cache.put("xml", new XmlRuleConfigParser());
    }

    public static IRuleConfigParser createParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty())
            return null;
        IRuleConfigParser r = cache.get(configFormat.toLowerCase());
        return r;
    }
}
