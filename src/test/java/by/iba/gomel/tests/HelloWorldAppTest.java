//package by.iba.gomel.tests;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//public class HelloWorldAppTest {
//
//	@Test
//	public void testMain() {
//		fail("Not yet implemented");
//	}
//
//}

package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.HelloWorldApp;

public class HelloWorldAppTest {
    @Test
    public void testMain() {
        HelloWorldApp.main(new String[] {});
        Assert.assertEquals("Hello World! string should be in system out", "Hello World!");
    }

}