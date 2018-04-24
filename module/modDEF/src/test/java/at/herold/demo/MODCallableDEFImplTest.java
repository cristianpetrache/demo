package at.herold.demo;

import java.util.List;

import org.junit.Test;

public class MODCallableDEFImplTest
{

   private static final String TEST_MESSAGE = "test message";
   
   private MODCallable modCallable = new MODCallableDEFImpl();
   
   @Test
   public void testMessage() {
      List<String> result = modCallable.call(TEST_MESSAGE);
      assert result.stream()
            .filter(string -> string.contains(modCallable.getClass().getCanonicalName()))
            .findAny()
            .isPresent();
      assert result.stream()
            .filter(string -> string.endsWith(TEST_MESSAGE))
            .findAny()
            .isPresent();
   }
}
