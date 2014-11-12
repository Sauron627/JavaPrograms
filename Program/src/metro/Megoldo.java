package metro;

public class Megoldo {
	
		public void megalloszam(){
					
			String[]  allomas= new String[12];
			String[]	allomasok_ossz = new String[12];
			int k =0;
			for(String[] megallok : MetroReader.allomasok){
				for(String megallo: megallok){
					allomas[k] = megallo;
					k++;
				}
			}
			for(int i=0;i<12;i++)
			{
				for(k =0;k<12;k++){
					if(allomas[i] != allomasok_ossz[k]) allomasok_ossz[i] = allomas[i];
				}
			}
			
			for(String s : allomasok_ossz){
				System.out.println(s);
			}
			
			
			
		
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
		public void csakMetroval(){
			
		}
		public Megoldo(){
			;
			
		}
}
