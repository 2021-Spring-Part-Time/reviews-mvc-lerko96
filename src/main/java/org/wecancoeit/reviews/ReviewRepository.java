package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    //constructor to handle our database
    public ReviewRepository() {
        Review parasite = new Review(1L, "Parasite", "B", "I liked this movie, plenty of imagery and a wild story to go along.  Happily watch again.", "2019", "/images/parasite.jpg");
        Review tenaciousD = new Review(2L, "Tenacious D", "B", "Laid back comedy with great original music. ", "2006", "/images/tenaciousd.jpg");
        Review resevoirDogs = new Review(3L, "Resevoir Dogs", "B+", "Movie takes place in one setting mostly, I like how the storyline gets delivered in pieces as the movie continues.", "1992", "/images/resevoirDogs.jpg");
        Review ironGiant = new Review(4L, "The Iron Giant", "A", "Great movie with a positive ending.  Can sit down and watch anytime.", "1999", "/images/irongiant.jpg");

        reviewsList.put(parasite.getId(), parasite);
        reviewsList.put(tenaciousD.getId(), tenaciousD);
        reviewsList.put(resevoirDogs.getId(), resevoirDogs);
        reviewsList.put(ironGiant.getId(), ironGiant);
    }

    //constructor for testing purposes only...uses varArgs to add none or as many objects as we want
    public ReviewRepository(Review... reviewsToAdd) {
        for (Review review : reviewsToAdd) {
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}
