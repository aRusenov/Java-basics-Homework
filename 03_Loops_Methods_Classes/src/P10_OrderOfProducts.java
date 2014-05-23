import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class P10_OrderOfProducts {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		
		// re-use the method from the previous problem
		List<Product> productList = 
				P09_ListOfProducts.getProducts("OrderInput/products.txt");
		// get the orders from the file
		List<String> orderList = getOrders("OrderInput/order.txt"); 
		
		double sum = 0;
		for (int i = 0; i < orderList.size(); i++) {
			// get the order by line
			String[] order = orderList.get(i).split(" ");
			double quantity = Double.parseDouble(order[0]);
			String productName = order[1];
			// searches the list of Products and if it finds a product with
			// the corresponding name -> multiplies its price by quantity
			for (Product product : productList) {
                if (product.getName().equals(productName)) {
                        sum += quantity * product.getPrice();
                }
			}
		}
		printPrice(sum, "OrderInput/output.txt");
	}

	private static void printPrice(double sum, String outputPath) {
		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter(outputPath));
			String formattedSum = String.format("%.2f", sum);
			bw.write(formattedSum);
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static List<String> getOrders(String inputPath) {
		List<String> orderList = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(
					new FileReader(inputPath));
			String line = br.readLine();
			while (line != null) {
				orderList.add(line);
				line = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return orderList;
	}

}
