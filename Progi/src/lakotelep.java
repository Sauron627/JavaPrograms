
public class lakotelep {
	private int[][] TelepMatrix;
	private int[] szintTomb = new int[50];
	
	private void fillSzint(){
		for(int i =0; i<TelepMatrix.length;i++){
			for(int j=0; j<TelepMatrix[0].length;j++){
				szintTomb[TelepMatrix[i][j] - 1] += 1;
			}	
		}	
	}
	public lakotelep(int TelepMatrix[][]){
		this.TelepMatrix = TelepMatrix;
		fillSzint();
		writeSzintEloszlas();
		System.out.printf("Körpanorámás házak száma: %d", getKorPanoramasHazakSzama());
	}
	public int HazakSzama(){
		int x = TelepMatrix.length;
		int y = TelepMatrix[0].length;
		return x*y;
	}
	public float getNSzintesHazakRata(int szint)
	{
		szint-=1;
		int HazakSzama = HazakSzama();
		float rata = (((float)(szintTomb[szint]))/HazakSzama)*100;
		return rata;
		
		
	}
	public void writeSzintEloszlas()
	{
		System.out.printf("Egy szintes: %.0f%%\n",  getNSzintesHazakRata(1));
        System.out.printf("Kettő szintes: %.0f%%\n",  getNSzintesHazakRata(2));
        System.out.printf("Három szintes: %.0f%%\n",  getNSzintesHazakRata(3));
        System.out.printf("Négy szintes: %.0f%%\n",  getNSzintesHazakRata(4));
        System.out.printf("Ötszintes: %.0f%%\n",  getNSzintesHazakRata(5));
        System.out.printf("Hat szintes: %.0f%%\n",  getNSzintesHazakRata(6));
        System.out.printf("Hét szintes: %.0f%%\n",  getNSzintesHazakRata(7));
        System.out.printf("Nyolc szintes: %.0f%%\n",  getNSzintesHazakRata(8));
        System.out.printf("Kilenc szintes: %.0f%%\n",  getNSzintesHazakRata(9));
	}
	
	public int getKorPanoramasHazakSzama(){
		int panorama = 0;
		for(int i=0;i<TelepMatrix.length; i++){
	       	 for(int j=0; j<TelepMatrix[0].length; j++){	   
        	   if( (TelepMatrix[i][j]>TelepMatrix[(((i+1)==TelepMatrix.length)?i:(i+1))][j]) && (TelepMatrix[i][j]> TelepMatrix[i][((j+1)==TelepMatrix[0].length)?j:(j+1)]) ){
        		   panorama +=1;
        	   }	
        	   if((TelepMatrix[i][j]>TelepMatrix[(((i-1)<0)?i:(i-1))][j]) && (TelepMatrix[i][j]> TelepMatrix[i][((j-1)<0)?j:(j-1)]))
        	   {
        		   panorama +=1;
        	   }
	       	 }
        }
        return panorama;
	}
}
