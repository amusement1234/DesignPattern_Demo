package oop48;

// 代理模式：基于接口
public class TestUserControllerProxy implements IUserController {

    private MetricsCollector metricsCollector;
    private UserController userController;

    public TestUserControllerProxy(UserController userController) {
        this.userController = userController;
        this.metricsCollector = new MetricsCollector();
    }

    @Override
    public boolean login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        // 委托
        boolean b = userController.login(telephone, password);

        long endTimeStamp = System.currentTimeMillis();
        metricsCollector.recordRequest("start:" + startTimestamp + ",end:" + endTimeStamp);
        return b;
    }

    @Override
    public boolean register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        // 委托
        boolean b = userController.register(telephone, password);

        long endTimeStamp = System.currentTimeMillis();
        metricsCollector.recordRequest("start:" + startTimestamp + ",end:" + endTimeStamp);
        return b;
    }

}
