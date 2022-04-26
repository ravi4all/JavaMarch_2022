package OOPS;

import java.util.Date;
import java.util.Scanner;

class User {
    private String UserId;
    private String password;

    public String getUserId() {
        return this.UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class Message {
    private String msg;
    private String userId;
    private Date date;

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    

}

class View {
    void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ID : ");
        String id = scanner.next();
        System.out.println("Enter your password : ");
        String password = scanner.next();
        DB db = new DB();
        // Message msg = db.checkLogin(id, password);
        User user = new User();
        user.setUserId(id);
        user.setPassword(password);

        Message msg = db.checkLogin(user);

        System.out.println(msg.getMsg());
        System.out.println(msg.getDate());
        System.out.println(msg.getUserId());
        scanner.close();
    }
}

class DB {
    Message checkLogin(User user) {
        String message = "";
        // Date date;
        Message  msg = new Message();
        if(user.getUserId().equals(user.getPassword())) {
            message = "Login Success..";
            // date = new Date();
        }
        else {
            message = "Login Failed..";
        }
        msg.setMsg(message);
        msg.setDate(new Date());
        msg.setUserId(user.getUserId());
        return msg;
    }
}

public class PassObjectByReference {
    public static void main(String[] args) {
        View view = new View();
        view.login();
    }
}
