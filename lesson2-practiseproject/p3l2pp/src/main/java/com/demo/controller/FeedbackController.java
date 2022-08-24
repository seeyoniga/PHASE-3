package com.demo.controller;


import com.demo.model.Feedback;
import com.demo.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FeedbackController {

@Autowired
    FeedbackRepository feedbackRepository;
	@RequestMapping(value = "/feedback", method = RequestMethod.POST)
    public Feedback createNote(@RequestParam("userid") int userid, @RequestParam("username") String username, @RequestParam("useremail") String useremail , @RequestParam("userfeedback") String userfeedback) {
		Feedback b = new Feedback(userid,username,useremail,userfeedback);
		Feedback data = feedbackRepository.save(b);
        if (data!=null) {
        	System.out.println("Feedback added succesfully!");
    	}
    	else {
    		System.out.println("Unable to add the feedback");
    	}
        return data;
    }
}