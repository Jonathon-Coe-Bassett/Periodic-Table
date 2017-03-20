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
				Chemical nitrate=new Chemical(new Chemical(elements.get(6), 1), new Chemical(elements.get(7), 2));
				Chemical c=new Chemical(new Chemical(elements.get(45), 1), nitrate);
				System.out.println(c);
			}
		public static void createTable() throws FileNotFoundException
		{
			Scanner file = new Scanner(new File("periodicTable"));
			while(file.hasNext())
				{
					String[] el = file.nextLine().split(",");
					el[3] = el[3].replace("[", "").replace("]", "");
					elements.add(new Element(Integer.parseInt(el[0]), el[1], el[2], Double.parseDouble(el[3]), el[4]));
				}
			
			
		}
		
	}
