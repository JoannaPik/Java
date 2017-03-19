import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Kalkulator {
	public static void main(String[] args) throws FileNotFoundException {
		String wybor;
		dzialania proba1= new dzialania(); 
		System.out.println("Jezeli chcesz podawac wyrazenia nacisnij 1\n Jezeli wyrazenia maja sie wczytywac z pliku, nacisnij 2");
		 System.out.println("Podaj decyzje");
		  Scanner odczyt= new Scanner(System.in);
		  wybor=odczyt.next();
		if(wybor.matches("1"))
		{	
			proba1.konsola();
		} 
		else if(wybor.matches("2"))
		{
			String nazwaPliku;
			System.out.println("Podaj nazwe pliku");
			  Scanner odczyt2= new Scanner(System.in);
			  nazwaPliku=odczyt2.next();
			proba1.plik(nazwaPliku);
		} 
		  System.out.println("Koniec");
		  System.exit(0);
	  }
	
	
}
