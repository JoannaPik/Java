import java.util.List;

/**
 * 
 * @author Karol
 * Klasa z obliczeniami 
 *
 */

public class Obliczenia {
	/**
	 * Zmienna "wynik" przechoduje wynik po wykoaniu danego dzialania
	 */
	protected double wynik;

	public double operacje(double l1, double l2, String znak)
	  { double w=0;
		  if("+".equals(znak))
		  {
			  return l1+l2;
		  }
		  else if(znak.equals("-"))
		  {
			  return l1-l2;
		  }
		  else if(znak.equals("*"))
		  {
			return l1*l2;  
		  }
		  else if(znak.equals("/"))
		  {
			  return l1/l2;
		  }
		  return w;
	  }
}
