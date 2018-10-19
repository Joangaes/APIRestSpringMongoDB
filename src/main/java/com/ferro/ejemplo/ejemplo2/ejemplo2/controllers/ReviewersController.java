package com.ferro.ejemplo.ejemplo2.ejemplo2.controllers;


import com.ferro.ejemplo.ejemplo2.ejemplo2.repositories.ReviewsRepository;
import com.ferro.ejemplo.ejemplo2.ejemplo2.models.Reviews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewersController {
    @Autowired
    ReviewsRepository reviewsRepository;

    @RequestMapping(method=RequestMethod.GET, value="/reviews")
    public Iterable<Reviews> reviews() {
        return reviewsRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST, value="/reviews")
    public String save(@RequestBody Reviews review) {
        reviewsRepository.save(review);

        return review.getId();
    }

    @RequestMapping(method=RequestMethod.GET, value="/reviews/{id}")
    public Reviews show(@PathVariable String id) {
        return reviewsRepository.findById(id).get();
    }

    @RequestMapping(method=RequestMethod.PUT, value="/reviews/{id}")
    public Reviews update(@PathVariable String id, @RequestBody Reviews review) {
        Reviews rev = reviewsRepository.findById(id).get();
        if(review.getDate() != null)
            rev.setDate(review.getDate());
        if(review.getRating()!= null)
            rev.setDate(review.getDate());
        if(review.getReviewer()!= null)
            rev.setReviewer(review.getReviewer());
        if(review.getText() != null)
            rev.setText(review.getText());
        
        
        reviewsRepository.save(review);
        return review;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/reviews/{id}")
    public String delete(@PathVariable String id) {
        Reviews review = reviewsRepository.findById(id).get();
        reviewsRepository.delete(review);

        return "product deleted";
    }
}
