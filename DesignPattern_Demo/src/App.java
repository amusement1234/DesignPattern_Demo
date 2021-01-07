import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        // oop41.Logger logger1 = oop41.Logger.getInstance();
        // oop41.Logger logger2 = oop41.Logger.getInstance();
        // Runnable r1 = () -> {
        //     for (int i = 0; i < 100; i++) {
        //         String s = i + "r1: is a test " + System.currentTimeMillis() + "\n";
        //         logger1.log(s);
        //     }

        // };
        // Runnable r2 = () -> {
        //     for (int i = 0; i < 100; i++) {
        //         String s = i + "r2: is a test " + System.currentTimeMillis() + "\n";
        //         logger2.log(s);
        //     }

        // };

        // Thread t1 = new Thread(r1);
        // Thread t2 = new Thread(r2);
        // t1.run();

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

        // 原型模式
        oop47.PrototypeTest obj1 = new oop47.PrototypeTest();
        oop47.PrototypeTest obj2 = (oop47.PrototypeTest) obj1.clone();
        System.out.println("obj1==obj2?" + (obj1 == obj2));

        //代理模式：基于接口
        oop48.IUserController userController = new oop48.TestUserControllerProxy(new oop48.UserController());
        userController.login("111", "222");

        // 代理模式：基于类的继承
        oop48.IUserController userController2 = new oop48.TestUserControllerProxy2();
        userController2.login("333", "444");

        // 代理模式：动态代理
        oop48.TestUserControllerProxy3 proxy = new oop48.TestUserControllerProxy3();
        oop48.IUserController userController3 = (oop48.IUserController) proxy.createProxy(new oop48.UserController());
        userController3.login("555", "666");
    }
}
