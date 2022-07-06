package codegym.vn.service;

import codegym.vn.entity.MailBox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmailService implements IEmailService {
    private static Map<Integer, MailBox> emailList;

    static {
        emailList = new HashMap<>();
        emailList.put(1, new MailBox(1, "English", 25, true, "Thor"));
        emailList.put(2, new MailBox(2, "Vietnamese", 15, false, "Zeus"));
        emailList.put(3, new MailBox(3, "Japanese", 10, true, "Hera"));
    }

    public List<MailBox> showAll() {
        return new ArrayList<>(emailList.values());
    }

    public MailBox findById(Integer id) {
        return emailList.get(id);
    }

    public void update(MailBox mailBox) {
        emailList.put(MailBox.getId(), mailBox);
    }

}
