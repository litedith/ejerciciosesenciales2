package edu.upc.eetac.dsa.egalmes.ejercicioesenciales2;

public class CuentaAtras extends Thread
{
	public static String UltimaEscritura;
	public String id;
	public int numerin;
	String m;
	
	public CuentaAtras (String a, int b)
	{	
		//super(a);
		this.id = a;
		numerin = b;
		
		
	}
	public synchronized void UltimaEscritura ()
	{
		UltimaEscritura=this.id ;
		System.out.println (id + "-"+numerin +"- Ultima escritura" + this.UltimaEscritura   );
	}
	public void run()
	{
		try
		{
			int i = numerin;
			while (i>0)
			{
		   
		   System.out.println (id + " Cuenta atrás: " + i);
		   numerin --;
		   
			Thread.sleep(1000);
			UltimaEscritura();
			
			}
			 
			int t = Thread.activeCount();
			System.out.println ("Fin. Numero threads activos: " + t);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
	  
	
	