package com.lcw.ratings.RatingService.services.impl;

import com.lcw.ratings.RatingService.entities.Rating;
import com.lcw.ratings.RatingService.repositry.RatingRepositry;
import com.lcw.ratings.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingImpl implements RatingService {
    @Autowired
    private RatingRepositry repositry;
    @Override
    public Rating create(Rating rating) {
        return repositry.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return repositry.findAll();
    }

    @Override
    public List<Rating> getRatingByuserId(String userId) {
        return repositry.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingsByHotelId(String hotelId) {
        return repositry.findByHotelId(hotelId);
    }
}
