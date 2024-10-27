package com.lcw.ratings.RatingService.controllers;


import com.lcw.ratings.RatingService.entities.Rating;
import com.lcw.ratings.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
   @Autowired
   private RatingService ratingService;
// for create
    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating ratings) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(ratings));
    }
    //Get All Data
    @GetMapping
    public ResponseEntity<List<Rating>>getRatings() {
        return ResponseEntity.ok(ratingService.getAllRatings());
    }
    //get by user id
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>>getRatingsByUserId(@PathVariable String userId) {
        return ResponseEntity.ok(ratingService.getRatingByuserId(userId));
    }
    // get by hotel id
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>>getRatingsByHotelId(@PathVariable String hotelId   ) {
        return ResponseEntity.ok(ratingService.getRatingsByHotelId(hotelId));
    }
@DeleteMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>>deleteRatingsByHotelId(@PathVariable String hotelId) {
        return ResponseEntity.ok(ratingService.getRatingsByHotelId(hotelId));
    }
}
