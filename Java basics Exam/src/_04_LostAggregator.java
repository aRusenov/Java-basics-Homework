import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class _04_LostAggregator {

	public static class Data {
		public List<String> ips;
		public int duration;
		
		public Data(String ip, int duration) {
			this.ips = new ArrayList<>();
			this.ips.add(ip);
			this.duration = duration;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		List<String[]> list = new ArrayList<String[]>();
		
		// we split the input into 3 pairs (IP, name, duration)
		for (int i = 0; i < n; i++) {
			list.add(input.nextLine().split(" "));
		}
		
		// we sort the strings via lambda expressions by name 
		Collections.sort(list, (x1, x2) -> x1[1].compareTo(x2[1]));
		// we use the linked version of hashMap as to avoid internal sorting
		// that might fuck up the output order
		Map<String, Data> usersMap =
				new LinkedHashMap<>();
		
		// we read each log and add the data to userMap
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i)[1];
			String ip = list.get(i)[0];
			int time = Integer.parseInt(list.get(i)[2]);
			if (usersMap.containsKey(name)) {
				Data data = usersMap.get(name);
				if (!data.ips.contains(ip)) {
					data.ips.add(ip);
				}
				data.duration += time;
			}
			else {
				usersMap.put(name, new Data(ip, time));
			}
		}
		
		for (Map.Entry<String, Data> set : usersMap.entrySet()) {
			System.out.printf("%s: %d ", set.getKey(), set.getValue().duration);
			// sorts the IPs
			Collections.sort(set.getValue().ips, (ip1, ip2) -> ip1.compareTo(ip2));
			System.out.print(Arrays.toString(set.getValue().ips.toArray()));
			System.out.println();
		}
	}

}



