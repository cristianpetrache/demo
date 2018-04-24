package at.herold.demo;

public class FMUtil
{

   private static final String FINGERPRINT = "fmLib - at.herold.demo.FMUtil: ";

   public static String call(String message) {
      return FINGERPRINT + message;
   }
}
