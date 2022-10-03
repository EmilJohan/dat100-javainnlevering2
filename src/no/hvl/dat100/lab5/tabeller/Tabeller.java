package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		
		for(int i=0;i<tabell.length;i++) {
		    System.out.println(tabell[i]);	   
    }
		// TODO


	}

	// b)
	
	public static String tilStreng(int[] tabell) {
		String answer = "[";
		String end = "";
		String [] slutt = new String[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			slutt[i] = String.valueOf(tabell[i]);
			
		}
		int i = 1;
		for(i=0;i<slutt.length;i++) {
			end = (slutt[i]);
			if (i!=slutt.length-1)
			answer = answer + end + ",";
			else 
			answer = answer + end;
			}
		answer = answer + "]";
		return answer;
		
		// TODO
		
	}

	// c)
	public static int summer(int[] tabell) {
//		int sum = 0;
//		for(int i=0;i<tabell.length;i++) {
//			sum = tabell[i] + sum;
//	}
//		int sum = 0;
//		int tall = 0;
//		while (tall<tabell.length) {
//			sum = tabell[tall] + sum;
//			tall++;
//		}
		int sum = 0;
		for (int tall: tabell)
			sum += tall;
		return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i = 0; i< tabell.length; i++) {
			if (tall == tabell[i]) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i< tabell.length; i++) {
			if (tall == tabell[i]) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int [] reversert = new int[tabell.length];
		int f = 0;
        for(int i=tabell.length-1;i>-1;i--) {
			reversert[i] = tabell[f];
			f++;
        }
			return reversert;
			
		}
				

	// g)
	public static boolean erSortert(int[] tabell) {
		int f = 1;
		if (tabell.length == 1)
			f = 0;
		for (int i = 0; i< tabell.length; i++){
			if (tabell[i]<=tabell[f]) {

			}
			else
				return false;
			if (f < tabell.length-1) {
					f++;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int ltotal = tabell1.length + tabell2.length;
		int [] answer = new int[ltotal];
		for(int i = 0; i<tabell1.length;i++) 
			answer[i] = tabell1[i];
		
		
		for(int g = tabell1.length; g<ltotal; g++) 
			answer[g] = tabell2[g-tabell1.length];
		
		return answer;
	}
	
}



