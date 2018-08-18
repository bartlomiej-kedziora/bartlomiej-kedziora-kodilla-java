package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User david = new Millenials("david");
        User kate = new YGeneration("kate");
        User tom = new ZGeneration("tom");

        //When
        String davidsPost = david.sharePost();
        System.out.println("David posts using: " + davidsPost);
        String katesPost = kate.sharePost();
        System.out.println("Kate posts using: " + katesPost);
        String tomsPost = tom.sharePost();
        System.out.println("Tom posts using: " + tomsPost);

        //Then
        Assert.assertEquals("Facebook post", davidsPost);
        Assert.assertEquals("Snapchat post", katesPost);
        Assert.assertEquals("Twitter post", tomsPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User david = new Millenials("david");

        //When
        String davidsPost = david.sharePost();
        System.out.println("David posts using: " + davidsPost);
        david.setSocialPublisher(new TwitterPublisher());
        davidsPost = david.sharePost();
        System.out.println("Now David posts using: " + davidsPost);

        //Then
        Assert.assertEquals("Twitter post", davidsPost);

    }
}
