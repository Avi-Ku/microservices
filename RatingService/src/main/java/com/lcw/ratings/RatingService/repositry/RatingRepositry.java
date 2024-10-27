package com.lcw.ratings.RatingService.repositry;

import com.lcw.ratings.RatingService.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepositry extends MongoRepository<Rating, String> {
    //create custom method

    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);

}
