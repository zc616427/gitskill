package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
}

public class Test1{
  @Test public void aa() {
    System.out("Hello1")
  }
  }
public class Test2{
  @Test public void aa() {
    System.out("Hello2")
  }
  }
public class Test3{
  @Test public void aa() {
    System.out("Hello3")
  }
  }
public class Test4{
  @Test public void aa() {
    System.out("Hello4")
  }
  }
public class Test5{
  @Test public void aa() {
    System.out("Hello5")
  }
  }

