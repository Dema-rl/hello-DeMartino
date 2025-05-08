import java.io.*;
public class hello {
	public static void main(String[] args){
		System.out.println("Hello DeMartino");

		//stampo 3 volte il nome 
		for(int i=0;i<3;i++){
			System.out.println("DeMartino");
		}

		//stampo la data di nascita 
		System.out.println("22/12/2007");

		//stampo il tifo della squadra 
		System.out.println("Forza Spezia!");

		//Array d icaratteri con lettere del nome "DeMartino"
		char[] nome = {'D','e','M','a','r','t','i','n','o'};

		//Stampo le lettere dell'array 
		for(char lettera:lettere){
			System.out.println(lettera + "");
		}

		Vector<Character> lettere = new Vector<>();
		lettere.add('D');
		lettere.add('e');
		lettere.add('M');
		lettere.add('a');
		lettere.add('r');
		lettere.add('t');
		lettere.add('i');
		lettere.add('n');
		lettere.add('o');

		for(Character lettera:lettere){
			System.out.println(lettera);
		}
	}	
}


