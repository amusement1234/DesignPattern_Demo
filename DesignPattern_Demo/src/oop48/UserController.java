package oop48;

public class UserController implements IUserController {

    @Override
    public boolean login(String telephone, String password) {
        System.out.println("登录成功！");
        return true;
    }

    @Override
    public boolean register(String telephone, String password) {
        System.out.println("注册成功！");
        return true;
    }

}
