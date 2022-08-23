
package com.test.hib.model.User;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Application")
public class ApplicationTest {

  @Test
  @DisplayName("Is the world on fire?")
  void smokeTest() {
    assertThat(true).isEqualTo(true);
  }
  @Test
  @DisplayName("But really, is it?")
  void antiSmokeTest() 
  {
	assertThat(false).isEqualTo(false);
  }
}
