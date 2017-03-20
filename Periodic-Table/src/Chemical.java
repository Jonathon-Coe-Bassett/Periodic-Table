import java.util.*;
public class Chemical extends Element
	{
		private ArrayList<Element> contents=new ArrayList<>();
//		public Chemical(ArrayList<Element> e)
//		{
//			super(-1, name, name, atomicMass, atomicNumber);
//			this.contents=e;
//		}
		public Chemical(Element e, int num)
		{
			super(-1, e.getSymbol()+ num, e.getName(), num * (e.getAtomicMass()), num*(((Chemical) e).calcCharge()));
			for(int i=0; i<num; i++)
			contents.add(e);
		}
		public Chemical(Chemical a, Chemical b)
		{
			super(-1, a.getSymbol()+b.getSymbol(), a.getName()+ " " + b.getName(), addMass(a, b), a.getCharge()+b.getCharge());
			this.contents.add(a);
			this.contents.add(b);
			
		}
		@Override
		public String toString()
		{
			return null;
			//for now
		}
		public static double addMass(Element e, Element b)
		{
			return e.getAtomicMass()+b.getAtomicMass(); 
		}
		public int calcCharge()
		{
			return 0;
		}
	}
