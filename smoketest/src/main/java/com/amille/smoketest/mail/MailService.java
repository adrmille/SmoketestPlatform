package com.amille.smoketest.mail;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.subethamail.wiser.Wiser;
import org.subethamail.wiser.WiserMessage;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Using Wiser, see https://github.com/voodoodyne/subethasmtp/blob/master/Wiser.md
 */
@Service
public class MailService {

    @Value("${mail.server.port:25}")
    private int port;

    @Value("${mail.server.autostart:false}")
    private boolean autostart;

    private Wiser server;

    @PostConstruct
    public void autoStart() {
        if (autostart) {
            server = new Wiser();
            server.setPort(port);
            server.start();
        }
    }

    /* FIXME For later use */
    public List<WiserMessage> getMessages() {
        return server.getMessages();
//        for (WiserMessage message : server.getMessages())
//        {
//            String envelopeSender = message.getEnvelopeSender();
//            String envelopeReceiver = message.getEnvelopeReceiver();
//
//            MimeMessage mess = message.getMimeMessage();
//
//            // now do something fun!
//        }
    }

}
