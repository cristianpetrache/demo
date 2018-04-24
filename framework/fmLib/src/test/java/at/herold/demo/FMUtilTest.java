package at.herold.demo;

import org.junit.Test;

public class FMUtilTest
{

   private static final String TEST_MESSAGE = "test message";
   
   @Test
   public void testMessage() {
      String result = FMUtil.call(TEST_MESSAGE);
      assert result.contains(FMUtil.class.getCanonicalName());
      assert result.endsWith(TEST_MESSAGE);
   }
}
