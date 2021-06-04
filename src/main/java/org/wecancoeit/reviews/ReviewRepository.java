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
        Review parasite = new Review(1L, "Parasite", "Movie", "Rating: B+.  I liked this movie, plenty of imagery and a wild story to go along.  Happily watch again.", "2019");
        Review tenaciousD = new Review(2L, "Tenacious D", "Movie", "Rating: B.  Laid back comedy with great original music. ", "2006");
        Review casino = new Review(3L, "Resevoir Dogs", "Movie", "Rating: B+.  Movie takes place in one setting mostly, I like how the storyline gets delivered in pieces as the movie continues.", "1992");

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
