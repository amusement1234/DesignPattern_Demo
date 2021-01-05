package oop46.test;

public class ResourcePoolConfig {
    private String name;
    private int min;
    private int max;

    public ResourcePoolConfig(TestBuilder builder) {
        this.name = builder.name;
        this.min = builder.min;
        this.max = builder.max;
    }
}
