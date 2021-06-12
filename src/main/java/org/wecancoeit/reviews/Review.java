package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String title;
    private String rating;
    private String content;
    private String date;
    private String imageUrl;

    public Long getId() {
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getCategory(){
        return rating;
    }

    public String getContent(){
        return content;
    }

    public String getDate(){
        return date;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Review(long id, String title, String rating, String content, String date, String imageUrl) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.content = content;
        this.date = date;
        this.imageUrl = imageUrl;
    }

}
