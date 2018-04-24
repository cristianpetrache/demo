package at.herold.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration
{

   @Bean
   public MODCallable abcCallable() {
      return new MODCallableABCImpl();
   }

   @Bean
   public MODCallable defCallable() {
      return new MODCallableDEFImpl();
   }
   
}
