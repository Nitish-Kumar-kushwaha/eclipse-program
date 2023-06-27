package com.phase2_assignment_2.assgnment_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.phase2_assignment_2.assgnment_2.model.Feedback;
import com.phase2_assignment_2.assgnment_2.service.FeedbackService;

@Controller
public class AppController {

    @Autowired
    FeedbackService fs;

    @GetMapping(value = "/")
    public String home() {

        return "index";
    }

    @PostMapping(value = "/insert")
    public String home(@ModelAttribute Feedback fedbck) {

        System.out.println(fedbck);

        String res = fs.AddFeedback(fedbck);
        if (res.equals("Success")) {
            return "index";
        }
        return "home";

    }
}
