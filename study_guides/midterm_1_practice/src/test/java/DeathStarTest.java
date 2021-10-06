

import static org.junit.Assert.*;
import org.mockito.*;

import org.junit.Test;

public class DeathStarTest {

	/*
	 * Preconditions: A new DeathStar deathStar is created
	 *                A new Planet planet is created with hit points 10
	 * Execution Steps: shoot planet with deathStar
	 * PostConditions: Return value of deathStar.shoot(planet) is "Wimpy planet was hit by the superlaser!"
	 *                 Planet receives a damage of 100 hit points
	 */
	@Test
	public void testGetDamageShootTwice() {
		// DONE
		DeathStar deathStar = new DeathStar();
		Planet planet = Mockito.mock(Planet.class);
		Mockito.when(planet.getHitPoints()).thenReturn(10);
		Mockito.when(planet.toString()).thenReturn("Wimpy planet");
		assertEquals("Wimpy planet was hit by the superlaser!", deathStar.shoot(planet));
		Mockito.verify(planet).damage(100);
	}
}
