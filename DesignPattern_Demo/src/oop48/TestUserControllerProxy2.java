package oop48;

// 代理模式：基于类的继承
public class TestUserControllerProxy2 extends UserController {

    private MetricsCollector metricsCollector;

    public TestUserControllerProxy2() {
        this.metricsCollector = new MetricsCollector();
    }

    @Override
    public boolean login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        // 委托
        boolean b = super.login(telephone, password);

        long endTimeStamp = System.currentTimeMillis();
        metricsCollector.recordRequest("start:" + startTimestamp + ",end:" + endTimeStamp);
        return b;
    }

    @Override
    public boolean register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        // 委托
        boolean b = super.register(telephone, password);

        long endTimeStamp = System.currentTimeMillis();
        metricsCollector.recordRequest("start:" + startTimestamp + ",end:" + endTimeStamp);
        return b;
    }

}
