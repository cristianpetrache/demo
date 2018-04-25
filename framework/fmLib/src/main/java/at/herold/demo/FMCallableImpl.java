package at.herold.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FMCallableImpl implements FMCallable
{
   private static final Logger LOGGER = LogManager.getLogger(FMCallableImpl.class);

   private static final String FINGERPRINT = "fmLib - at.herold.demo.FMCallableImpl: ";

   @Override
   public String call(String message)
   {
      LOGGER.debug("at.herold.demo.FMCallableImpl.call: " + message);
      return FINGERPRINT + message;
   }
}
