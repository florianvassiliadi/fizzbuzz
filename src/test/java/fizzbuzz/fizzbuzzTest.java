package fizzbuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class fizzbuzzTest{
	
	protected fizzbuzz op;
	
	@Before
	public void setUp() throws Exception {
		op=new fizzbuzz();
		
	}
	
	@Test
	public void testBuzz() throws Exception {
		Assert.assertEquals(true, op.isBuzz(5));
	}

}
