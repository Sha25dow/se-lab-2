package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

  @Test
  void fire_Success(){
    // Arrange
    TorpedoStore store = new TorpedoStore(1, 0);

    // Act
    boolean result = store.fire(1);

    // Assert
    assertEquals(true, result);
  }

  @Test
  void empty(){
    // Arrange
    TorpedoStore store = new TorpedoStore(0);

    // Act
    boolean result = store.isEmpty();
    int numResult = store.getTorpedoCount();

    // Assert
    assertEquals(true, result);
    assertEquals(0, numResult);
  }

  @Test
  void fire_exception(){
    // Arrange
    TorpedoStore store = new TorpedoStore(1, 0);

    // Act

    // Assert
    assertThrows(IllegalArgumentException.class , () -> store.fire(2), "numberOfTorpedos");
  }

  @Test
  void fire_fail(){
    // Arrange
    TorpedoStore store = new TorpedoStore(1, 1);

    // Act
    boolean result = store.fire(1);

    // Assert
    assertEquals(false, result);
  }

  
}
