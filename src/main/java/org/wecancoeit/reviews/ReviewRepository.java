package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long,Review> reviewList = new HashMap<>();

    public ReviewRepository(){
        Review amosBurton = new Review(1L,"Badass Review: Amos Burton","https://imgix.bustle.com/uploads/image/2020/4/30/2ac3cc8c-fa39-4592-92b7-d5c3fcfd12a8-expanse-amos-beard.jpg?w=1000&h=665.8333333333334&auto=format%2Ccompress&cs=srgb&q=70&fit=max&crop=faces","9/10","Review: ","https://www.youtube.com/watch?v=Dmqd9ofpW-s");
        Review johnWick = new Review(2L,"Badass Review: John Wick","https://imgix.gizmodo.com.au/content/uploads/sites/2/2015/08/gizmodo_movie_night_john_wick_1.jpg?ar=16%3A9&auto=format&fit=crop&q=65&w=1280","8.5/10","Review: ","https://www.youtube.com/watch?v=mlb8bSQzSxg");
        Review nathanDrake = new Review(3L,"Badass Review: Nathan Drake","https://www.wallpaperup.com/uploads/wallpapers/2013/03/21/56782/64e28465a5c97416ee6276fbac955a3c.jpg","10/10","Review: ","https://www.youtube.com/watch?v=1zyBDk3KPhk");
        Review jackReacher = new Review(4L,"Badass Review: Jack Reacher","https://hips.hearstapps.com/digitalspyuk.cdnds.net/17/03/1484740909-jack-reacher-tom-cruise.jpg","8.6/10","Review: ","https://www.youtube.com/watch?v=opL6JUzukEY");
        Review jackRyan = new Review(5L,"Badass Review: Jack Ryan","https://www.rollingstone.com/wp-content/uploads/2018/08/tom-clancy-s-jack-ryan-Tom-Clancys-Jack-Ryan-John-Krasinski_rgb.jpg","7/10","Review: ","https://www.youtube.com/watch?v=uRkbmgsA4E0");
        Review raylanGivens = new Review(6L,"Badass Review: Raylan Givens","https://cdn.vox-cdn.com/thumbor/e0pFE1oDU5kuiw7rUHDS2OQDxgc=/0x0:1200x869/1200x800/filters:focal(585x234:777x426)/cdn.vox-cdn.com/uploads/chorus_image/image/68983081/G7N7EYNPDZ4R6Y3IVSV2B5F6V4.0.jpg","7/10","Review: ","https://www.youtube.com/watch?v=qpNK5uZSfto");
        Review sherlockHolmes = new Review(7L,"Badass Review: Sherlock Holmes","https://economictimes.indiatimes.com/thumb/msid-68266481,width-1200,height-900,resizemode-4,imgsize-584851/robert-downey-jr-starrer-sherlock-holmes-3-to-now-release-in-2021.jpg?from=mdr","9.5/10","Review:","https://www.youtube.com/watch?v=u-z5139CW1I");
        reviewList.put(amosBurton.getId(),amosBurton);
        reviewList.put(johnWick.getId(),johnWick);
        reviewList.put(nathanDrake.getId(),nathanDrake);
        reviewList.put(jackReacher.getId(),jackReacher);
        reviewList.put(jackRyan.getId(),jackRyan);
        reviewList.put(raylanGivens.getId(),raylanGivens);
        reviewList.put(sherlockHolmes.getId(),sherlockHolmes);

    }

    public ReviewRepository(Review...reviewsToAdd){
        for (Review review: reviewsToAdd){
            reviewList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll(){
        return reviewList.values();
    }
}
