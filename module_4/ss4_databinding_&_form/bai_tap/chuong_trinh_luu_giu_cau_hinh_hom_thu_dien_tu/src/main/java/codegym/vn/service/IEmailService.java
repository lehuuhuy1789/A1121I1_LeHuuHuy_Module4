package codegym.vn.service;

import codegym.vn.entity.MailBox;

import java.util.List;

public interface IEmailService {
    List<MailBox> showAll();
    MailBox findById(Integer id);
    void update(MailBox mailBox);
}
