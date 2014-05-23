import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.swing.text.AbstractDocument.BranchElement;

import sun.security.action.GetBooleanAction;


public class P09_ListOfProducts {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		
		// fills a list with the products
		List<Product> productList = getProducts("ProductListInput/input.txt");
		// Sorts list via lambda expression - REQUIRES JDK 1.8/JRE 8 !!!
		productList.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
		// prints the product list to the desired file
		printProducts(productList, "ProductListInput/output.txt");
		
	}
	
	private static void printProducts(List<Product> products, String outputPath) {
		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter(outputPath));
			for (int i = 0; i < products.size(); i++) {
				Product currentProduct = products.get(i);
				bw.write(currentProduct.getPrice() + " " + currentProduct.getName());
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static List<Product> getProducts(String inputPath) {
		List<Product> productList = new ArrayList<Product>();
		try {
			BufferedReader br = new BufferedReader(
					new FileReader(inputPath));
			String line = br.readLine();
			while (line != null) {
				String[] data = line.split(" ");
				String name = data[0];
				double price = Double.parseDouble((data[1]));
				productList.add(new Product(name, price));
				line = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return productList;
	}

}