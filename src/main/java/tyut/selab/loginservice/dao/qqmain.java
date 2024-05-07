package tyut.selab.loginservice.dao;

import tyut.selab.loginservice.config.Email;

import javax.mail.MessagingException;
import java.util.Scanner;

public class qqmain {
    public static void main(String[] args) throws MessagingException {
        Email qq=new Email();
        System.out.println("请输入QQ号");
        String QQmail="1752304164@qq.com";
        String head="囧架架";
        String body="你好呀";
        qq.qqemai(QQmail, head, body);
    }
}
