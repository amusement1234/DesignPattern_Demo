package oop46.test;

public class TestBuilder {
    public String name;
    public int min = 8;
    public int max = 8;

    public ResourcePoolConfig builder() {
        if (name == null)
            throw new IllegalArgumentException("...");
        if (min > max)
            throw new IllegalArgumentException("...");
        return new ResourcePoolConfig(this);
    }

    public TestBuilder setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("...");
        this.name = name;
        return this;
    }

    public TestBuilder setMin(int min) {
        if (min <= 0)
            throw new IllegalArgumentException("...");
        this.min = min;
        return this;
    }

    public TestBuilder setMax(int max) {
        if (max <= 0)
            throw new IllegalArgumentException("...");
        this.max = max;
        return this;
    }
}
