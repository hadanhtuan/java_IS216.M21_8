/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import java.util.*;
import java.util.Properties;
import java.util.logging.Logger;

import javax.mail.*;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
     public static void sendmail(String recepient, String title, String text) throws Exception{
    	Properties p = new Properties();
    	p.put("mail.smtp.auth", "true");
    	p.put("mail.smtp.starttls.enable", "true");
    	p.put("mail.smtp.port", "587");
    	p.put("mail.smtp.host", "smtp.gmail.com");
    	p.put("mail.smtp.ssl.protocols", "TLSv1.2");
    	String email = "q4z3xd@gmail.com";
    	String pass = "cnatceokksyikvia";
    	
    	Session session = Session.getInstance(p, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(email, pass);
            }
        });
        
        Message message = prepareMessage(session, email, recepient, title, text);

        
        Transport.send(message);
        System.out.println("oke babe");
        
        
    }
    private static Message prepareMessage(Session s, String email, String recepient, String title, String text)
    {
    	try {
    		Message m = new MimeMessage(s);
    		m.setFrom(new InternetAddress(email));
    		m.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
    		m.setSubject(title);
    		m.setText(text);
    		return m;
    	} catch (Exception e)
    	{
    	}
    
    	return null;
    }
    
}

