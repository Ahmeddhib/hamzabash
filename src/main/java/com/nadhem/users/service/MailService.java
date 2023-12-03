package com.nadhem.users.service;

import com.nadhem.users.mail.Mail;

public interface MailService {
    void sendMail(String email, Mail mail);

}
