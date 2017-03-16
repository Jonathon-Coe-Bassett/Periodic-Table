import java.util.*;
public class Chemical extends Element
	{
		private ArrayList<Element> contents=new ArrayList<>();
		public Chemical(ArrayList<Element> e)
		{
			super(-1, name, name, atomicMass, atomicNumber);
			this.contents=e;
		}
		public Chemical(Element e, int num)
		{
			for(int i=0; i<num; i++)
			contents.add(e);
		}
		public Chemical(Chemical a, Chemical b)
		{
			this.contents.add(a);
			this.contents.add(b);
			
		}
		public 
		public String toString()
		{
			return null;
			//for now
		}
		public int addMass()
		{
			
		}
	}
