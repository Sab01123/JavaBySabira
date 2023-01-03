/* 
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
public class Main {
	static class Data implements Comparable<Data> {
		int id;
		String name;
		String department;
		int salary;

		public Data() {
		}

		public Data(int id, String name, String department, int salary) {
			this.id = id;
			this.department = department;
			this.name = name;
			this.salary = salary;
		}

		@Override
		public int compareTo(Data o) {
			return this.id < o.id ? 1:-1;
		}

		@Override
		public String toString() {
			return "id-"+id+" name-"+name+" dep-"+department+" sal-"+salary;
		}
	}
	public static Map<String,Integer> processData(ArrayList<String> array) {
		/* 
		 * Modify this method to process `array` as indicated
		 * in the question. At the end, return a Map containing
		 * the appropriate values
		 *
		 * Please create appropriate classes, and use appropriate
		 * data structures as necessary.
		 *
		 * Do not print anything in this method.
		 *
		 * Submit this entire program (not just this method)
		 * as your answer
		 */
		//22, Rajan Anand, Engineering, 1600000
		
		List<Data> list = new ArrayList<>();
		for(String i : array) {
			String[] elem= i.split(",");

			int id = Integer.parseInt(elem[0].trim());
			String name =elem[1].trim();
			String department = elem[2].trim();
			int salary = Integer.parseInt(elem[3].trim());
			
			list.add(new Data(id,name,department,salary));
//			System.out.println(Arrays.toString(elem));
		}

		Collections.sort(list);
		for(Data i: list)
		System.out.println(i);
		

		Map<String, Integer> retVal = new TreeMap<String, Integer>();

		for(Data i: list) {
			if(!retVal.containsKey(i.department)) {
				
				retVal.put(i.department, i.salary);
			}
		}


		return retVal;
	}

	public static void main (String[] args) {
		ArrayList<String> inputData = new ArrayList<String>();
		String line;
		try {
			Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
			while(in.hasNextLine())
				inputData.add(in.nextLine());
			Map<String,Integer> retVal = processData(inputData);
			PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
			for(Map.Entry<String,Integer> e: retVal.entrySet())
				output.println(e.getKey() + ": " + e.getValue());
			output.close();
		} catch (IOException e) {
			System.out.println("IO error in input.txt or output.txt");
		}
	}
}
