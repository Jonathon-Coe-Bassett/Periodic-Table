
public class Element
	{
		private int atomicNumber;
		private String symbol;
		private String name;
		private double atomicMass;
		private String color;
		public Element(int an, String s, String n, double am, String c)
		{
			this.atomicNumber=an;
			this.symbol=s;
			this.name=n;
			this.atomicMass=am;
			this.color=c;
		}
		public String toString()
		{
			return this.getName()+ " " + this.getSymbol() + "  " + this.getAtomicNumber() + " " + this.getAtomicMass() + " " + this.getColor();
			
		}
		public int getAtomicNumber()
			{
				return atomicNumber;
			}
		public void setAtomicNumber(int atomicNumber)
			{
				this.atomicNumber = atomicNumber;
			}
		public String getSymbol()
			{
				return symbol;
			}
		public void setSymbol(String symbol)
			{
				this.symbol = symbol;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public double getAtomicMass()
			{
				return atomicMass;
			}
		public void setAtomicMass(double atomicMass)
			{
				this.atomicMass = atomicMass;
			}
		public String getColor()
			{
				return color;
			}
		public void setColor(String color)
			{
				this.color = color;
			}
		
	}
