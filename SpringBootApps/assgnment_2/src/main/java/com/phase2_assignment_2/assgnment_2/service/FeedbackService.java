package com.phase2_assignment_2.assgnment_2.service;

import java.util.List;

import com.phase2_assignment_2.assgnment_2.model.Feedback;

public interface FeedbackService {

    public String AddFeedback(Feedback fedbck);

    public List<Feedback> ShowAll();

    public Feedback GetFeedback(int id);

    public String UpdateFeedback(Feedback fedbck);

    // public String DeleteFeedback(int id);
}
