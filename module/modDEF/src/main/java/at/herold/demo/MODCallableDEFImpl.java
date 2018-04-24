package at.herold.demo;

import java.util.LinkedList;
import java.util.List;

public class MODCallableDEFImpl implements MODCallable
{
   private static final String FINGERPRINT = "message from " +
         MODCallableDEFImpl.class.getCanonicalName() + ": ";
   
   private FMCallable fmCallable = new FMCallableImpl();

   @Override public List<String> call(String message)
   {
      List<String> result = new LinkedList<>();
      result.add(FINGERPRINT + message);
      result.add(fmCallable.call(message));
      return result;
   }
}
