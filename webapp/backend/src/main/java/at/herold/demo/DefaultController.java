package at.herold.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController
{

   @Autowired
   private SomeCoolService someCoolService;

   @RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
   public List<String> index()
   {
      return someCoolService.doTheCoolAction();
   }

   public SomeCoolService getSomeCoolService()
   {
      return someCoolService;
   }

   public void setSomeCoolService(SomeCoolService someCoolService)
   {
      this.someCoolService = someCoolService;
   }
}
