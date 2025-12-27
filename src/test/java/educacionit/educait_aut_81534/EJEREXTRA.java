package educacionit.educait_aut_81534;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EJEREXTRA {
	
	@Test
	public void test() {	
		//Precondition
		int a=2;
		int b=3;
		//Expected Result
		int expectedResult=5;
		// Steps
		int sumNumber=a+b;
		//Validation
		System.out.println("===========================");
		System.out.println("Resultado Esp.:" + expectedResult);
		System.out.println("Resultado Obtenido:" + sumNumber);
		Assertions.assertEquals(expectedResult, sumNumber);
		
		
	}

}
