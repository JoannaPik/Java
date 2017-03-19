import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;

public class dzialania {

	public void konsola()
	{
		  List<String> lista= new ArrayList<String>();
		  String dane="";
			  /**
			   * pobieranie linijki dopoki uzytkownik nie wpisze slowa "koniec"
			   */
		  while(dane!="koniec")
		  {
			  System.out.println("Podaj wyrazenie");
			  Scanner odczyt= new Scanner(System.in);
			  dane=odczyt.nextLine();
			  System.out.println("Podany ciag: "+dane);
			  
				  licz(dane);
			  }
			 
			//  System.exit(0);

	}
	/**
	 * funkcja obliczajaca wynik podanego wyrazenia
	 * @param s
	 */
	public void licz(String s)
	{
		Double wynik;
		Scanner linia=new Scanner(s);
		List <Double> liczby2= new ArrayList<Double>();
		List <String> dzialania2= new ArrayList<String>();
		List<Double> liczby;
		List<String> dzialania;
		/**
		 * Dzielenie stringa na liczby i znaki dzialan
		 */
		while(linia.hasNext())
		{
			if(linia.hasNextDouble())
				liczby2.add(linia.nextDouble());
			else
				dzialania2.add(linia.next());
		}
		linia.close();
		/*for(int i=0;i<liczby2.size();i++)
			System.out.println("Liczbt "+ liczby2.get(i));
		for(int i=0;i<dzialania2.size();i++)
			System.out.println("Dzialania "+ dzialania2.get(i));
		*/
		Obliczenia o=new Obliczenia();
		dzialania=dzialania2;
		liczby=liczby2;
		int i=0;
		while(dzialania.size()!=0&&i<dzialania.size())
		
		//for(int i=0;i<dzialania.size();i++)
		{
			if(liczby.size()>1)
			{  
				wynik=o.operacje(liczby.get(i), liczby.get(i+1), dzialania.get(i));
				liczby.set(i, wynik);
				liczby.remove(i+1);
				dzialania.remove(i);
				//System.out.println("Wynik: "+wynik);
			}
			
		}
		System.out.println("Wynik koncowy: "+liczby.get(0));

	}
	/**
	 * Funkcja licz¹ca wyrazenia pobierane z pliku
	 * @param nazwa	-	 nazwa pliku z danymi
	 * @throws FileNotFoundException
	 */
	public void plik(String nazwa)throws FileNotFoundException
	{
		Scanner a = new Scanner(new File(nazwa));
		String obliczenia;
		while(a.hasNext())
		{
			obliczenia=a.nextLine();
			if(!StringUtils.isAlpha(obliczenia))
			{
				licz(obliczenia);
			}
		}
		a.close();	
	}
}