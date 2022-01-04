package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long,Review> reviewList = new HashMap<>();

    public ReviewRepository(){
        Review amosBurton = new Review(1L,"Badass Review: Amos Burton","https://imgix.bustle.com/uploads/image/2020/4/30/2ac3cc8c-fa39-4592-92b7-d5c3fcfd12a8-expanse-amos-beard.jpg?w=1000&h=665.8333333333334&auto=format%2Ccompress&cs=srgb&q=70&fit=max&crop=faces","9/10","If there is one word to describe Burton’s driving force as a phenomenal character that word is survival. Burton has been singularly focused on surviving for most of his life and whether it was the mean streets of Baltimore or the harsh expanse of space he has proven more than capable of doing just that. He has the resilience of a cockroach, the attitude of a honey badger, and the musculature of an ox. That’s  already a scary combo and that’s before you factor in his skill with shotgun. \n" +
                "\n" +
                "Burton versatility doesn’t end with violence, he’s also managed to transform from knee breaker to adept ship mechanic without a technical education. Where Amos Burton really shines is in his emotional detachment. He has been hardened by the harsh environment he was raised in and as a result has developed a callousness that allows him to be absolutely  cutthroat or uniquely diplomatic depending on what the moment calls for. His willingness to survive the “churn” has yielded a man capable of doing just about whatever it takes without hesitation or remorse.\n" +
                "\n","https://www.youtube.com/watch?v=jilbDz5z1Ss");
        Review johnWick = new Review(2L,"Badass Review: John Wick","https://imgix.gizmodo.com.au/content/uploads/sites/2/2015/08/gizmodo_movie_night_john_wick_1.jpg?ar=16%3A9&auto=format&fit=crop&q=65&w=1280","8.5/10","What hasn’t been said about Baba Yaga himself? The gun-fu master assassin has put together 3 films worth of ass-kicking the likes of which we haven’t really seen for quite sometime. Obviously everyone wants to talk the guns when they talk Wick and to be fair that is undeniably one of his strongest areas. The way he fights with fire arms is undoubtedly impressive and just fun to watch (unless you find yourself on the business end of one of his gun barrels). But I’d argue the main factor that contributes to the legend that is John Wick is what I like to call killrativity. Wick is obviously one of the most skilled assassins in media history but it is the way he takes out enemies that makes him this almost boogeyman like character. If you upset Baba Yaga it’s not just the guns and knifes you have to be careful of, it’s the vehicles, horses, and god forbid pencils! When it feels like anything in the world can be used as a murder weapon the imagination can begin to wander to some dark places. That’s what makes Wick so awesome and very scary. ","https://www.youtube.com/watch?v=mlb8bSQzSxg");

        Review nathanDrake = new Review(3L,"Badass Review: Nathan Drake","https://www.wallpaperup.com/uploads/wallpapers/2013/03/21/56782/64e28465a5c97416ee6276fbac955a3c.jpg","10/10","Am I biased because I grew up playing the Uncharted games? Yes. Does this invalidate the super-badass that is Nathan Drake? ABSOLUTELY NOT! Nathan Drake is 10x the hero Indiana Jones was and it’s not even close (yes I said it). We are talking about a intelligent treasure hunter who is part historian, part parkour expert, and part weapon specialist, a total package that exudes the fun and fiery nature of a quintessential action hero. He’s got the brains, the brawn, and the boldness to get in and out of a lot of trouble. He’s discovered ancient treasures and thwarted mythical curses all while destroying THOUSANDS of bad guys in exceptionally cinematic fashion. I think the element of Drake that makes him seem un-killable despite the situation is his good fortune. Throughout the games Drake’s seemingly mythical good fortune has gotten him out of some pretty dicey situations. This may just appear to be dumb luck to some but given the story elements of the games, this appears to be Drake fulfilling ancestral  destiny. That combined with the variety of skill Drake already posses makes him really really really hard to stop if you are trying to do so. Just try asking Lazarevic and his Serbian private army. Good luck getting a response though. (PS. Tom Holland better not mess up the film adaptation or so help me there will be blood!) ","https://www.youtube.com/watch?v=1zyBDk3KPhk");

        Review jackReacher = new Review(4L,"Badass Review: Jack Reacher","https://hips.hearstapps.com/digitalspyuk.cdnds.net/17/03/1484740909-jack-reacher-tom-cruise.jpg","8.6/10","I have to admit I was really surprised when I first saw this movie by how B.A. Reacher was. I know just about everyone considers Tom Cruise as an action start I just never took him as super serious in that role. I’m not sure if it’s just the characters he has played or if it’s Cruise’s height but I just always felt meh about his characters. Jack Reacher is a different story. There is a strong aura of “mess around and find out” that exudes from Reacher before he does anything violent. You just know the guy is dangerous. Not only is he devastatingly proficient in hand-to-hand combat but he’s a pretty versatile fighter in several disciplines. His military police experience have sharpened his investigative skills to a fine point. Nothing gets past him and once he’s on the scent he is unyielding in getting answers. That singular focus is what makes Reacher relatively unique. Reacher has this innate sense of what will happen, how long it will take, and what he will do next as a result. He will layout the event of a brawl and how it will end before throwing the first punch. There’s not much you can do when your opponent has such a lock onto your every move and tell. That’s what makes Reacher truly unique. ","https://www.youtube.com/watch?v=opL6JUzukEY");

        Review lisbethSalander = new Review(8L,"Badass Review: Lisbeth Salander","https://variety.com/wp-content/uploads/2016/11/the-girl-with-the-dragon-tattoo-1.jpg","8.2/10","Hackers don’t get the respect they deserve for being really cool and impactful badasses. Usually they presented as comical geeks who support a team of  more “physically” skilled heisters. With Salander you get the world-class hacker elite and the punk-rock rebel who will take a baseball bat to the side of your head. She’s also a master of disguise, a super sleuth, and has an eidetic memory. Salander isn’t part of a heist team she  IS the heist team, or at least she could be if she wasn’t dedicating herself to the exposing corrupt politicians, sex offenders, etc. Investigative journalism in itself is pretty B.A. and Salander has a very batman-esque sense of justice that makes her method a bit…extreme. However, no matter how intense things get the one outstanding quality that makes Lisbeth Salander so difficult to deal with is her resilience. She doesn’t care about intimidation tactics or being tortured. She’s versatile enough to get into anywhere and become anyone. Once you are in the cross-hairs she’s going to take you down or die trying. ","https://www.youtube.com/watch?v=cQmBe9hSv_E");


        Review jackRyan = new Review(5L,"Badass Review: Jack Ryan","https://www.rollingstone.com/wp-content/uploads/2018/08/tom-clancy-s-jack-ryan-Tom-Clancys-Jack-Ryan-John-Krasinski_rgb.jpg","7/10","“Bright Boy” is one those action stars that some would consider sneaky because he doesn’t wow you with a lot of flashing martial arts moves or crazy shoot outs. Jack Ryan is what happens when you pair a golden boy with a talented analytical thinker. Although he starts out as an analyst monitoring wire transactions for terrorist activity, he does well enough to end up actually thwarting an attack. It is refreshing to have a character who wins so consistently with his mind rather than with  cool kung fu moves and bazookas (not that those things are bad, just used a lot). One of the things I really freaking love about Jack Ryan (amazon prime show) is the obstacles he overcomes while starting out as a field agent. There are several times where he is learning the ropes and has to work the old noggin to get out of a tricky bind. Sometimes his tactics go against the protocols but he seems to always make the necessary call that know one knew was there. Adaptability and intelligence are not ordinarily associated with being a badass but Jack Ryan isn’t ordinary.  ","https://www.youtube.com/watch?v=uRkbmgsA4E0");

        Review raylanGivens = new Review(6L,"Badass Review: Raylan Givens","https://cdn.vox-cdn.com/thumbor/e0pFE1oDU5kuiw7rUHDS2OQDxgc=/0x0:1200x869/1200x800/filters:focal(585x234:777x426)/cdn.vox-cdn.com/uploads/chorus_image/image/68983081/G7N7EYNPDZ4R6Y3IVSV2B5F6V4.0.jpg","7/10","Smooth as a glass of Kentucky bourbon and twice as fiery. Deputy U.S. Marshall Raylan Givens is a classic quick-draw lawman who exudes cool like no one else. He’s more laid back and balanced than a lot of individuals in the compendium. He doesn’t have any special fighting abilities, in fact he gets he loses way more fist fights than wins throughout the airing of the show. So you might be thinking, “Why the heck is this guy on the list?”. The answer: speed kills. Raylan Givens at the end of the day is a shooter and a damn good one. He’s insanely quick of the draw and extremely accurate. Regardless of the situation he finds himself in, he only needs a fraction of a second to completely turn the tables. Raylan isn’t only quick off the draw, he’s also really quick witted. He can decipher the obscure plans of criminals and quickly deduce a plan that outsmarts them. And he makes it look so easy! ","https://www.youtube.com/watch?v=qpNK5uZSfto");

        Review sherlockHolmes = new Review(7L,"Badass Review: Sherlock Holmes","https://economictimes.indiatimes.com/thumb/msid-68266481,width-1200,height-900,resizemode-4,imgsize-584851/robert-downey-jr-starrer-sherlock-holmes-3-to-now-release-in-2021.jpg?from=mdr","9.5/10","You may have noticed by now that I have a proclivity for intelligent bad-assery. I’m not ashamed to admit it. Some of the coolest moments in media history stemmed from 1000 IQ plans that blew our minds. With Sherlock Holmes you are getting your mind blown regularly and it is AMAZING! Sherlock Holmes is not only a master of deduction but, with his genius intellect, is actually a master of just about everything he puts his attention toward for an extended period of time. He can learn languages or musical instruments or maybe develop a new gadget. He can quickly figure out what has happened (or what will) by picking up on the smallest of details and using them to paint a picture. In a scrap his genius intellect isn’t lost in translation. He can gauge his opponents moves like a master chest player (which he is) and counter even some of the most skilled combatants with unorthodox yet effective maneuvers. He never stop thinking and there does not seem to be an equal to his innate intelligence. This Sherlock Holmes a sort one-man team, he has so many different skillsets wrapped in his head that he just simply go to the tool box and apply the right one for the task in front of him. It’s quite elementary.","https://www.youtube.com/watch?v=u-z5139CW1I");
        reviewList.put(amosBurton.getId(),amosBurton);
        reviewList.put(johnWick.getId(),johnWick);
        reviewList.put(nathanDrake.getId(),nathanDrake);
        reviewList.put(jackReacher.getId(),jackReacher);
        reviewList.put(jackRyan.getId(),jackRyan);
        reviewList.put(raylanGivens.getId(),raylanGivens);
        reviewList.put(sherlockHolmes.getId(),sherlockHolmes);
        reviewList.put(lisbethSalander.getId(),lisbethSalander);

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
