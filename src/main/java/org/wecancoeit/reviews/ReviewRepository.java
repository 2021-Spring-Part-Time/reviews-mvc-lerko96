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
        Review parasite = new Review(1L, "Parasite", "Movie", "A+", "2019");
        Review tenaciousD = new Review(2L, "Tenacious D", "Movie", "B", "2006");
        Review casino = new Review(3L, "Casino", "Movie", "A", "1995");

        reviewsList.put(parasite.getId(), parasite);
        reviewsList.put(tenaciousD.getId(), tenaciousD);
        reviewsList.put(casino.getId(), casino);
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
