package com.masai.Service;


import java.util.*;

import com.masai.Exception.FeedbackException;
import com.masai.Model.Feedback;

public interface IFeedbackServer {
	public Feedback addFeedback(Feedback feedback) throws FeedbackException;
    public Feedback findbyfeedbackid(Integer feedbackid);
    public List<Feedback> findbycustomerid(Integer Customerid) throws FeedbackException;
    public List<Feedback> viewallfeedbacks() throws FeedbackException;
    public Feedback delteById(Integer id) throws FeedbackException;
    
}
