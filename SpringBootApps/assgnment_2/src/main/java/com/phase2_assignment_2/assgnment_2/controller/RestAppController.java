package com.phase2_assignment_2.assgnment_2.controller;

import java.util.List;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phase2_assignment_2.assgnment_2.model.Feedback;
import com.phase2_assignment_2.assgnment_2.service.FeedbackService;

@RestController
@RequestMapping("/app/api")
public class RestAppController {

    @Autowired
    FeedbackService fs;

    @GetMapping(value = "/comment")
    public ResponseEntity<List<Feedback>> ViewAll() {

        List<Feedback> cmtall = fs.ShowAll();
        if (cmtall.isEmpty()) {
            return new ResponseEntity("List is empity", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Feedback>>(cmtall, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}/comment")
    public ResponseEntity<Feedback> ViewOne(@PathVariable Integer id) {
        Feedback cmnt = fs.GetFeedback(id);

        if (cmnt == null) {
            return new ResponseEntity("Not exixts", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Feedback>(cmnt, HttpStatus.OK);
    }

    @PutMapping(value = "/comment/{id}")
    public ResponseEntity<String> UpdateProduct(@PathVariable Integer id, @RequestBody Feedback febk) {
        if (fs.GetFeedback(id) != null) {
            String res = fs.UpdateFeedback(febk);
            if (res.equals("Success")) {
                return new ResponseEntity<String>("Feedback updated", HttpStatus.OK);
            }
            return new ResponseEntity<String>("Feedback not updated", HttpStatus.OK);
        }
        return new ResponseEntity<String>("Feedback not exists", HttpStatus.NOT_FOUND);
    }
}
