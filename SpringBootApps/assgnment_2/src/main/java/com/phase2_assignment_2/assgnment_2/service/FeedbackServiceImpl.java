package com.phase2_assignment_2.assgnment_2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phase2_assignment_2.assgnment_2.Repo.FeedbackRepo;
import com.phase2_assignment_2.assgnment_2.model.Feedback;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    FeedbackRepo frepo;

    @Override
    public String AddFeedback(Feedback fedbck) {
        Feedback f = frepo.save(fedbck);
        if (f != null) {
            return "Success";
        } else {
            return "Error";
        }
    }

    @Override
    public List<Feedback> ShowAll() {
        return frepo.findAll();

    }

    @Override
    public Feedback GetFeedback(int id) {
        Optional<Feedback> cmnt = frepo.findById(id);

        if (cmnt.isPresent()) {
            return cmnt.get();
        }
        return null;
    }

    @Override
    public String UpdateFeedback(Feedback fedbck) {
        // TODO Auto-generated method stub
        Feedback cmnt = frepo.saveAndFlush(fedbck);
        if (cmnt != null) {
            return "Success";
        }
        return "Error";
    }

}
