package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_1 {

		@Test(dataProvider = "dp")
		public void test(String[] s) {
			
				System.out.println(s);
			
			
			System.err.println("<>><><><><><>");
		}
		// TODO Auto-generated method stub

	
	@DataProvider(indices = {1,4})
	public String[] dp() {
		String[] data = new String[]{
			"123","abc","xyz","12344555","efwr32r"
		};
		return data;
	}

}
