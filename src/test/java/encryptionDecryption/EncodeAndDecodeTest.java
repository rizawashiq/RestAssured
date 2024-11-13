package encryptionDecryption;

import java.util.Base64;

import org.testng.annotations.Test;

public class EncodeAndDecodeTest {
	
	@Test
	public void demo() {
		String x = new String(Base64.getEncoder().encode("riza".getBytes()));
		System.out.println(x);
		
		String y = new String(Base64.getDecoder().decode(x.getBytes()));
		System.out.println(y);
		
	}
}
