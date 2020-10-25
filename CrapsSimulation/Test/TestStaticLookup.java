import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.princeton.cs.introcs.StdOut;

class TestStaticLookup
{

	@Test
	void test_static_medthods_dont_Override()
	{
		Die die = new CrookedDie1();
		
		assertEquals("Die.testStatic()", die.testStatic(), "error for this");
		
		
	}
	
	@Test
	void test_downcasting_doesnt_change_Static()
	{
		Die die = new CrookedDie1();
		
		assertEquals("CrookedDie1.testStatic()", ((CrookedDie1)die).testStatic());
		
		
	}
}
