package com.phase2_assignment_2.assgnment_2.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phase2_assignment_2.assgnment_2.model.Feedback;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Integer> {

}
