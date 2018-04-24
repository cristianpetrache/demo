package at.herold.demo;

import org.junit.Test;

public class FMCallableImplTest
{

   private static final String TEST_MESSAGE = "test message";
   
   private FMCallable fmCallable = new FMCallableImpl();
   
   @Test
   public void testMessage() {
      String result = fmCallable.call(TEST_MESSAGE);
      assert result.contains(fmCallable.getClass().getCanonicalName());
      assert result.endsWith(TEST_MESSAGE);
   }
}
