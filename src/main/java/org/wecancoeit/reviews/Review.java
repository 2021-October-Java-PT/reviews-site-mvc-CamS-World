package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String title;
    private String imageUrl;
    private String rating;
    private String content;
    private String videoEvidence;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getRating() {
        return rating;
    }

    public String getContent() {
        return content;
    }

    public String getVideoEvidence(){
        return videoEvidence;
    }

    public Review(Long id, String title, String imageUrl, String rating, String content, String videoEvidence) {
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.rating = rating;
        this.content = content;
        this.videoEvidence = videoEvidence;
    }
}
