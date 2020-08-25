package essai;
import java.util.Date;
import java.util.Scanner;
public class Bonjour{
	public static void main(String [] args){
		System.out.println("Bienvenue a la tdsi");
		System.out.println("il est "+new Date());
		System.out.println("racine(16)="+Math.sqrt(16));
		Date d =new Date();
		for(int i=0;i<5;i=i+2){
		System.out.println("il est "+d);
		}

		Scanner clavier = new Scanner(System.in);
		int k,e;
		System.out.println("Entrez un nombre");
		k = clavier.nextInt();
		System.out.println("Entrez un second nombre");
		e = clavier.nextInt();
		for(int i=k+1;i<e;i++){
		if (i%2== 0){
		System.out.println(i);
}


		
}
		int m,n;
		System.out.println("Entrez un nombre");
		n = clavier.nextInt();
		System.out.println("Entrez un deuxieme nombre");
		m = clavier.nextInt();
		do{
		System.out.println("le produit de:" +n+ "*" +m+ " est =:"+n*m);
		

		}while(n!=0 && m!=0);

}
		
		



		

}