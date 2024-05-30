package com.rating.service.ratingservice.service;

import com.rating.service.ratingservice.entity.Rating;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RatingService {

    Rating createRating(Rating rating);

    List<Rating> getAllRatings();

    List<Rating> getAllRatingsByUserId(String userId);


    List<Rating> getAllRatingsByHotelId(String hotelId);
}
