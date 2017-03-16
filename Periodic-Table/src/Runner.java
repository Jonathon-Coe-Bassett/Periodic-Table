import java.io.*;
import java.util.*;
public class Runner
	{
		public static ArrayList<Element> elements = new ArrayList<Element>();
		public static void main(String[] argsv) throws IOException
			{
				createTable();
				for(Element x : elements)
					{
						System.out.println(x);
					}
			}
		public static void createTable() throws FileNotFoundException
		{
			Scanner file = new Scanner(new File("periodicTable"));
			while(file.hasNext())
				{
					String[] el = file.nextLine().split(",", 5);
					elements.add(new Element(Integer.parseInt(el[0]), el[1], el[2], Double.parseDouble((el[3].replace("(.)", ""))), Integer.parseInt(el[4])));
				}
			
			
		}
		
	}
