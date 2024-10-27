package com.lcw.ratings.RatingService.services;

import com.lcw.ratings.RatingService.entities.Rating;

import java.util.List;

public interface RatingService {
    //create
    Rating create(Rating rating);

    //for get All
    List<Rating> getAllRatings();

    //for get by id
    List<Rating> getRatingByuserId(String userId);

    //for get by hotel id
    List<Rating>getRatingsByHotelId(String hotelId);

}
