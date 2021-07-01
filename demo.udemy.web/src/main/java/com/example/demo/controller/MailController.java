package com.example.demo.controller;

import com.example.demo.mail.MailSender;
import com.example.demo.mail.MockMailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class MailController {

    private MailSender mailSender;

    public MailController(MailSender smtp){
        this.mailSender = smtp;
    }

    @RequestMapping("/mail")
    public String mail() throws MessagingException {

        mailSender.send("karamel.seramik@gmail.com","Naber kız","dedi naber dedim iyidir");

        return "Maili de yolladın helal olsun";
    }
}
