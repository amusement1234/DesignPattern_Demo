package oop47;

//具体原型类
public class PrototypeTest implements Cloneable {
    public PrototypeTest() {
        System.out.println("具体原型创建成功！");
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (PrototypeTest) super.clone();
    }
}
