import java.util.ArrayList;
import java.util.Scanner;

public class Pgcd {
	
	//Retourne le max de deux entiers 
	 public static int max(int a, int b)
     {
         if (a > b) return a;
         else return b; 
     }

	 // Retourne le min de deux entiers 
     public static int min(int a, int b)
     {
         if (a < b) return a;
         else return b;
     }
     

     // Retourne le max d'une liste d'entiers 
     public static int maxList(ArrayList<Integer> l)
     {
         int maxlist = 0;
         for(int i=0; i < l.size(); i++) {
        	 maxlist = max (maxlist, l.get(i));
         }
      
         return maxlist;
     }


     // Calcul le PGCD
     public static int Pgcdnombre(int a, int b)
     {
         int c = max(a, b);
         int d = min(a, b);
         int r;
         
         // liste où seront stockés les diviseurs communs
         ArrayList<Integer> s = new ArrayList<Integer>();

         r = c % d;
         while (r < d && d!=1)
         {
             if (r == 0)
             {
            	 
                 s.add(d);
                 s.add(c / d);
                 return maxList(s);
             }
             else if (r == 1) return 1;

             c = d;
             d = r;
             r = c % d;
         }
         return 1;
     }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b;
		System.out.println("Calcul de PGCD : entrez deux entiers");
		Scanner r = new Scanner (System.in);
		a = r.nextInt();
		
		Scanner p = new Scanner (System.in);
		b = p.nextInt();
		
		System.out.println(String.format("Le PGCD de %d et %d est %d", a,b, Pgcdnombre(a,b)));
		

	}

}
