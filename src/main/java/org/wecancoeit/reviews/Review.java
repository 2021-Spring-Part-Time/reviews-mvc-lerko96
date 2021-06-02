package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String title;
    private String category;
    private String content;
    private String date;

    public Long getId() {
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getCategory(){
        return category;
    }

    public String getContent(){
        return content;
    }

    public String getDate(){
        return date;
    }

    public Review(long id, String title, String category, String content, String date) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.content = content;
        this.date = date;
    }

}
