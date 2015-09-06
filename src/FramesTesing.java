import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.*;

public class FramesTesing {
	@BeforeClass
    public static void seenu1() {
        System.out.println("in before class");
    }
     
    @Before
    public  void seenu2() {
        /**
         * This method will be called before calling every test.
         */
    	System.out.println("in before");
    }
     
	
	@Test
	public void test1() {
      System.out.println("in test one");
	}
	
	@Test
	public void test2() {
		 System.out.println("in test two");
	}
	
	@Test
	public void test3() {
		 System.out.println("in test three");
	}

	@AfterClass
    public static void killGlobalResources() {
        System.out.println("in after class");
    }
     
    @After
    public void killResources() {
        /**
         * This method will be called before calling every test.
         */
    	System.out.println("in after");
    }
	
}
