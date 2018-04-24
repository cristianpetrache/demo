package at.herold.demo;

public class FMCallableImpl implements FMCallable
{

   private static final String FINGERPRINT = "fmLib - at.herold.demo.FMCallableImpl: ";

   @Override
   public String call(String message)
   {
      return FINGERPRINT + message;
   }
}
