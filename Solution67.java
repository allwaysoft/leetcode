import java.util.Arrays;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution67 {
	public String addBinary(String a, String b) {

		 return Long.toBinaryString(Long.parseLong(a, 2) + Long.parseLong(b, 2));
    
	}

	public static void main(String[] args) {

		Solution67 s = new Solution67();

		String a = "1010", b = "1011";
		System.out.println(s.addBinary(a, b));
	}
}
