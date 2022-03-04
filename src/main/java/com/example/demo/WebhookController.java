package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api")
public class WebhookController implements WebhookApi{
    static Logger logger = LoggerFactory.getLogger(com.example.demo.WebhookController.class);

    public String webhook(@RequestBody Webhook object) {
            logger.info("received something!!!");
            logger.info("aaa: " + object.getSub());

        return "okay";
    }
}
