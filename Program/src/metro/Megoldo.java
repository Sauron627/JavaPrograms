package metro;

public class Megoldo {
	
		public static String[]  allomas= new String[(MetroReader.metro+MetroReader.villamos)*4];
		
		public void allomasFeltolto(){
			
			int k = 0;
			for(String[] megallok : MetroReader.allomasok)
			{
				for(String megallo: megallok)
				{
					allomas[k] = megallo;
					k++;
				}
			}
		}
	
		public void megalloszam(){
			
			String[]	allomasok_ossz = new String[(MetroReader.metro+MetroReader.villamos)*4];
			int l=0;
			int ossz =0;
			boolean letezik = false;
			
			
			
			for(int i=0;i<12;i++)
			{
				letezik = false;
				
				for(int j=0; j<12;j++)
				{
						if( allomas[i].equals(allomasok_ossz[j]))
						{
							letezik=true;
						}
				}
				
				if(letezik == false)
				{
					allomasok_ossz[l]=allomas[i];
					l++;
					ossz+=1;
				}
			}
			
			System.out.printf("%d\n",ossz);
			
			
		}
		
		public void leghosszabbVonalak(){
			
			int metroLeghosszabb = 0;
			int villamosLeghosszabb = 0;
			int k = 0;
			
			for(int i=0;i<MetroReader.metro;i++)
			{
				for(String s: MetroReader.allomasok[i])
				{
					 k+=1;
				}
				if(metroLeghosszabb <= k) metroLeghosszabb= k;
				k=0;
			}
			
			k=0;
			
			for(int j = MetroReader.metro; j<(MetroReader.metro+MetroReader.villamos);j++)
			{
				for(String s: MetroReader.allomasok[j])
				{
					k+=1;	
				}
				if(villamosLeghosszabb <= k) villamosLeghosszabb= k;
				
				k=0;
			}
			System.out.printf("%d %d\n", metroLeghosszabb,villamosLeghosszabb);
		}
		
		
		public void csakMetroval()
		{
			
			String[] MetroMegallo = new String[4];
			boolean letezik = false;
			int i;
			
			for(int m =0; m<4 ; m++){
				 MetroMegallo[m]= MetroReader.allomasok[MetroReader.metro][m];
			}
			
			for(i=0;i<4;i++)
			{
				letezik = false;
				
				for(int j=0; j<8;j++)
				{
						if( MetroMegallo[i].equals(allomas[j]))
						{
							letezik=true;
						}
				}
				
				if(letezik == false)
				{
					
					System.out.printf("%s ", MetroMegallo[i]);
				}
			}	
		}
		
		public void leghosszabbUt()
		{
			
		}
		
		public Megoldo(){
			allomasFeltolto();
			
		}
}
