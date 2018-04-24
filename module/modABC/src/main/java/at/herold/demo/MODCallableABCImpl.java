package at.herold.demo;

import java.util.LinkedList;
import java.util.List;

public class MODCallableABCImpl implements MODCallable
{
   private static final String FINGERPRINT = "message from " + 
         MODCallableABCImpl.class.getCanonicalName() + ": ";
   
   private FMCallable fmCallable = new FMCallableImpl();

   @Override public List<String> call(String message)
   {
      List<String> result = new LinkedList<>();
      result.add(FINGERPRINT + message);
      result.add(fmCallable.call(message));
      result.add(FMUtil.call(message));
      return result;
   }
}
