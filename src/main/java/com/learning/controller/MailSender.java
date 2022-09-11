package com.learning.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MailSender {

    @PostMapping("sendMail")
    public String sendMail() {
        return "sent a mail";
    }
}
