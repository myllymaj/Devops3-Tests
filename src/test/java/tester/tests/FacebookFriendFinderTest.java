package tester.tests;

import static org.junit.Assert.*;

//import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FacebookFriendFinderTest {

	private FacebookFriendFinder facebookFriendFinder;
	
	@Before
    public void setUp() {
      
		facebookFriendFinder = new FacebookFriendFinder();
    }
	
	
	//Positive test
	@Test
    public void testFindFriendsValidProfile() {
		  String[] friends = facebookFriendFinder.findFriends("https://www.facebook.com/randomname");
	        //assertNotNull(friends);
	        //assertTrue(friends.length > 0);
		  assertArrayEquals(new String[]{"Jake", "DevOpser", "Developer"}, friends);
    }
	//Negative test
    @Test
    public void testFindFriendsinValidProfile() {

        String[] friends = facebookFriendFinder.findFriends("invalid_profile_link");
        assertNull(friends);
    }
    @Test
    void testFindFriendsPerformance() {
        long startTime = System.currentTimeMillis();

        // Call the getFriendsList method multiple times here to measure performance
        facebookFriendFinder.findFriends("https://www.facebook.com/randomname");
        facebookFriendFinder.findFriends("https://www.facebook.com/randomname");
        facebookFriendFinder.findFriends("https://www.facebook.com/randomname");
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        assertTrue(executionTime < 1000); // Set an appropriate threshold (e.g., 1000 milliseconds)
    }
}

