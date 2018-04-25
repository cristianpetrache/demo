package at.herold.demo;

import java.util.List;

import org.junit.Test;

public class MODCallableABCImplTest
{

   private static final String TEST_MESSAGE = "test message";
   
   private MODCallable modCallable = new MODCallableABCImpl();
   
   @Test
   public void testMessage() {
      List<String> result = modCallable.call(TEST_MESSAGE);
      assert result.stream()
            .anyMatch(string -> string.contains(modCallable.getClass().getCanonicalName()));
      assert result.stream()
            .anyMatch(string -> string.endsWith(TEST_MESSAGE));
   }
}
