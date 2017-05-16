package problem1;

public class stampa {
	
	public static void main(String[] args) {
		//TODO set limit to count che roba è?
		
		/*if(args.length<=0){
			System.err.println("Set limit to count");
			return ;
		}
		int limit=(int) 1e8;
		LogTime logtime=new LogTime();
		logtime.getTime();
		for(int i=0; i<limit; i++);
		logtime.getTime();
		
		for(int i=0; i<limit; i++){
			if (i==1e2)System.out.println("1e2\t"+logtime.showTime());
			if (i==1e4)System.out.println("1e4\t"+logtime.showTime());
			if (i==1e6)System.out.println("1e6\t"+logtime.showTime());
		}
		logtime.getTime();
		for(int i=0; i<limit; i++){
			if (i==1e2)System.err.println("1e2\t"+logtime.showTime());
			if (i==1e4)System.err.println("1e4\t"+logtime.showTime());
			if (i==1e6)System.err.println("1e6\t"+logtime.showTime());
		}
		logtime.getTime();
		for(int i=0; i<limit; i++){
			System.err.println(i);
			if (i==1e2)System.err.println("1e2\t"+logtime.showTime());
			if (i==1e4)System.err.println("1e4\t"+logtime.showTime());
			if (i==1e6)System.err.println("1e6\t"+logtime.showTime());
		}
		logtime.getTime();
		for(int i=0; i<limit; i++){
			System.out.println(i);
			if (i==1e2)System.err.println("1e2\t"+logtime.showTime());
			if (i==1e4)System.err.println("1e4\t"+logtime.showTime());
			if (i==1e6)System.err.println("1e6\t"+logtime.showTime());
		}
		logtime.getTime();
		logtime.getDelta(LogTime.MILLI);
		logtime.getDelta(LogTime.SECOND);
		logtime.getDelta(LogTime.MINUTE);*/
		
		Risultato();
	}
	
	public static void Risultato() {
		
	int primoMultiplo = 3;
	int secondoMultiplo = 5;
	int mcm = primoMultiplo*secondoMultiplo;
	int risultato = 0;
	int ripetizione = 0;
	{
	for (int i = 1; i<=333; i++){
		if (i<=199)
				risultato += secondoMultiplo*i + primoMultiplo*i ;
		else
				risultato += primoMultiplo*i ;
			
		}
	for (int i = 1; i<67; i++){
		ripetizione += mcm*i;
	}

		System.out.print(risultato - ripetizione);
	}
}
}