package com.lcw.ratings.RatingService.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("User_ratings")
public class Rating {

    @Id
    private String ratingId;
    private String userId;
    private int hotelId;
    private int rating;
    private String feedback;

}

