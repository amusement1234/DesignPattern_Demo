public class App {
    public static void main(String[] args) throws Exception {
        //单例模式
        oop41.test.Logger l11 = oop41.test.Logger.getInstance();
        oop41.test.Logger l12 = oop41.test.Logger.getInstance();
        System.out.println("饿汉，是否相等：" + (l11 == l12));

        oop41.test.Logger2 l21 = oop41.test.Logger2.getInstance();
        oop41.test.Logger2 l22 = oop41.test.Logger2.getInstance();
        System.out.println("懒汉，是否相等：" + (l21 == l22));

        oop41.test.Logger3 l31 = oop41.test.Logger3.getInstance();
        oop41.test.Logger3 l32 = oop41.test.Logger3.getInstance();
        System.out.println("双重检测，是否相等：" + (l31 == l32));

        // 工厂模式
        oop44.IRuleConfigParser r = oop44.TestFactory.createParser("json");//简单工厂
        oop44.IRuleConfigParser r2 = oop44.TestFactory2.createParser("json");//简单工厂（缓存）
        oop44.IRuleConfigParser r3 = oop44.TestFactory3.createParser("json");//工厂方法

        //建造者模式
        oop46.ResourcePoolConfig build = new oop46.TestBuilder().setName("aa").setmax(10).setmin(1).build();
        oop46.test.ResourcePoolConfig build2 = new oop46.test.TestBuilder().setName("bb").setMin(10).setMax(20)
                .builder();
    }
}
