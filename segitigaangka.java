import java.util.Scanner;
public class segitigaangka {
		  public static void main(String args[]){
	            
	    Scanner input = new Scanner(System.in);
	       
	    System.out.println("##  Program Java Segitiga Angka  ##");
	    System.out.println("===================================");
	    System.out.println();
	     
	    int tinggi_segitiga,i,j;
	  
	    System.out.print("Input tinggi segitiga: ");
	    tinggi_segitiga = input.nextInt();
	     
	    System.out.println();
	    
	    for(i=1; i<=tinggi_segitiga; i++) {
	      for(j=1; j<=i; j++) {
	        System.out.print(i+" ");
	      }
	      System.out.println();
	    }
	     
	  }
	}

