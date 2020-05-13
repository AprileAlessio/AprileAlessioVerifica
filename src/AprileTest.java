import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AprileTest {

	@Test
	void testAprileMet1() {
		AprileClass ac=new AprileClass();
		float risAtteso=2187;
		float risOttenuto= ac.aprileMet(3, 7);
				assertEquals(risAtteso, risOttenuto, 0.0001);
	}
	@Test
	void testAprileMet2() {
		AprileClass ac=new AprileClass();
		float risAtteso=0;
		float risOttenuto= ac.aprileMet(0, 1);
				assertEquals(risAtteso, risOttenuto, 0.0001);
	}
	@Test
	void testAprileMet3() {
		AprileClass ac=new AprileClass();
		float risAtteso=1;
		float risOttenuto= ac.aprileMet(0, 0);
				assertEquals(risAtteso, risOttenuto, 0.0001);
	}
}
