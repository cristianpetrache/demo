package at.herold.demo;

import java.util.LinkedList;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class SomeCoolService
{
   
   @Resource
   private MODCallable abcCallable;

   @Resource
   private MODCallable defCallable;
   
   public List<String> doTheCoolAction()
   {

      List<String> result = new LinkedList<>();
      result.addAll(abcCallable.call("hey abc"));
      result.addAll(defCallable.call("hey def"));
      result.add("hey user!");

      return result;
   }

   public MODCallable getAbcCallable()
   {
      return abcCallable;
   }

   public void setAbcCallable(MODCallable abcCallable)
   {
      this.abcCallable = abcCallable;
   }

   public MODCallable getDefCallable()
   {
      return defCallable;
   }

   public void setDefCallable(MODCallable defCallable)
   {
      this.defCallable = defCallable;
   }
}
