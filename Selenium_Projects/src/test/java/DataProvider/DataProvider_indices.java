package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_indices {

		@Test(dataProvider = "dp")
		public void test(String[] s) {
			for (int i = 0; i < s.length; i++) {
				System.out.println(s[i]);
			}
			
			System.err.println("<>><><><><><>");
		}
		// TODO Auto-generated method stub

	
	@DataProvider()
	public String[][] dp() {
		String[][] data = new String[][] {
			{"123","abc","xyz"},{"123", "456", "7890"},
		};
		return data;
	}

}
