package at.herold.demo;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SomeCoolServiceTest
{

   @MockBean(name = "abcCallable")
   private MODCallable abcCallable;

   @MockBean(name = "defCallable")
   private MODCallable defCallable;

   @Autowired
   private SomeCoolService someCoolService;

   private List<String> abcList = new LinkedList<String>()
   {{
      add("abc1");
      add("abc2");
   }};

   private List<String> defList = new LinkedList<String>()
   {{
      add("def1");
      add("def2");
      add("def3");
      add("def4");
   }};

   @Before
   public void setUp()
   {
      given(abcCallable.call("hey abc")).willReturn(abcList);
      given(defCallable.call("hey def")).willReturn(defList);
   }

   @Test
   public void testDoTheCoolAction()
   {
      List<String> result = someCoolService.doTheCoolAction();
      Assert.isTrue(
            result.stream()
                  .anyMatch(string -> string.endsWith("hey user!")),
            "the \"hey user!\" string is missing!");
      Assert.isTrue(
            result.stream()
                  .anyMatch(string -> string.equals("abc1")),
            "the \"abc1\" string is missing!");
      Assert.isTrue(
            result.stream()
                  .anyMatch(string -> string.equals("abc2")),
            "the \"abc2\" string is missing!");
      Assert.isTrue(
            result.stream()
                  .anyMatch(string -> string.equals("def1")),
            "the \"def1\" string is missing!");
      Assert.isTrue(
            result.stream()
                  .anyMatch(string -> string.equals("def2")),
            "the \"def2\" string is missing!");
      Assert.isTrue(
            result.stream()
                  .anyMatch(string -> string.equals("def3")),
            "the \"def3\" string is missing!");
      Assert.isTrue(
            result.stream()
                  .anyMatch(string -> string.equals("def4")),
            "the \"def4\" string is missing!");
   }
}
