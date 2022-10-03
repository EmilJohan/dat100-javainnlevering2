package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
	for (int i = 0; i < matrise.length; i++)
			 
          
            for (int j = 0; j < matrise[i].length; j++)
                System.out.print(matrise[i][j] + " ");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String answer = "";
		String end = "";
		String [] slutt = new String[matrise.length];
		int x = 0;
        
		for (int j = 0; j < matrise.length; j++) {
		    for (int i = 0; i < matrise[j].length; i++) {
		    	slutt[i] = String.valueOf(matrise[j][i]);
		    	int h = 1;
		    	x++;
		    	
			if (slutt.length == x) {
			x = 0;
			
			for(h=0;h<slutt.length;h++) {
				end = (slutt[h]);
				if (h!=slutt.length-1)
				answer = answer + end + " ";
				else 
				answer = answer + end;
				}
			answer = answer + " \n";}
		}
	}
		return answer;
            			
	}	

	

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

	int[][] answer = new int[matrise.length][];
	int å = 0;
	    for(int[] tabell : matrise)	{
			answer[å] = tabell; å++;
			}
	    
		for(int ø=0;ø<matrise.length;ø++) {
			
			for(int æ = 0;æ<matrise[ø].length;æ++) {
				answer[ø][æ]*=tall;
				
			}
			
		}
		return answer;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {			
	
		if (a.length == b.length) {
			for (int e = 0; e<a.length;e++) {
				if (a[e].length == b[e].length) {
					for (int g = 0; g<a[e].length;g++) {
						if (a[e][g] != b[e][g]) {
							return false;
						}
					}
				}
			    else 
			    	return false;
			}
			
			return true;
		}

		return false;
	}			
// Alternativ metode
	
//				boolean flag = true;
//				int row1, col1, row2, col2;
//			
//			row1 = a.length;
//			col1 = a[0].length;
//			
//			row2 = b.length;
//			col2 = b[0].length;
//			
//			if(row1 != row2 || col1 != col2) {
//				System.out.println("Ikke like)");
//				}
//			else {
//			    for(int i=0; i<row1; i++) {
//					for(int j=0; j<col2; j++) {
//					    if(a[i][j] != b[i][j]) {
//							flag = false;
//							break;
//					  }				
//					}		
//				}
//			}
//			return flag;
//        }
	

	// e)
	public static int[][] speile(int[][] matrise) {

        int r, c;
		r = matrise.length;
		c = matrise[0].length;
		
		for(int i=0; i<r; i++) 
		{
			for(int j=(c-1);j>=0;j--)
			{
				System.out.print(matrise[i][j]);
			}
			    System.out.println();	
			}
		
		





		// TODO
	//	throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
