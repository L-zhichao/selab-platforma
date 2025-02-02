package tyut.selab.loginservice.config;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * @author joker_dj
 * @create 2020-04-13日 18:43
 */
public class Email {

    public void qqemai(String QQmail,String head,String body) throws AddressException, MessagingException {
        Properties properties = new Properties();
        properties.put("mail.transport.protocol", "smtp");// 连接协议
        properties.put("mail.smtp.host", "smtp.qq.com");// 主机名
        properties.put("mail.smtp.port", 465);// 端口号
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.ssl.enable", "true");// 设置是否使用ssl安全连接 ---一般都使用
        properties.put("mail.debug", "true");// 设置是否显示debug信息 true 会在控制台显示相关信息
        // 得到回话对象
        Session session = Session.getInstance(properties);
        // 获取邮件对象
        Message message = new MimeMessage(session);
        // 设置发件人邮箱地址
        message.setFrom(new InternetAddress("2658085067@qq.com"));
        // 设置收件人邮箱地址
        message.setRecipients(Message.RecipientType.TO,
                new InternetAddress[] { new InternetAddress(QQmail) });
        //new InternetAddress();设置同时发送多个好友
        // 设置邮件标题
        message.setSubject(head);
        // 设置邮件内容
        message.setText(body);
        // 得到邮差对象
        Transport transport = session.getTransport();
        // 连接自己的邮箱账户
        transport.connect("2658085067@qq.com", "sriknqmsvzqsebbc");// 密码为QQ邮箱开通的stmp服务后得到的客户端授权码
        // 发送邮件
        int i=0;
        transport.sendMessage(message, message.getAllRecipients());
        System.out.println("成功！");
        transport.close();
    }
}
