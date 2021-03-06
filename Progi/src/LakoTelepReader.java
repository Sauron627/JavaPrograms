import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LakoTelepReader {
   
    public static lakotelep read(String FilePath) throws IOException {
    	
    			    	
    	        BufferedReader inputStream = null;
    	        int tomb[][];
    	        try {
    	            inputStream = new BufferedReader(new FileReader(FilePath));
    	           

    	            String beSzoveg;
    	            String[] Szoveg = null;
    	            beSzoveg = inputStream.readLine();
    	            Szoveg = beSzoveg.split(" ");
    	            int x = Integer.parseInt(Szoveg[0]);
    	            int y = Integer.parseInt(Szoveg[1]);
    	            
    	            tomb = new int[x][y];
    	            
    	            for(int i=0; i<x;i++){
    	            beSzoveg = inputStream.readLine();
    	            	for(int j=0; j<y;j++)
    	            		tomb[i][j]= (beSzoveg.charAt(j)-48);
    	            }
    	               
    	        } finally {
    	            if (inputStream != null) {
    	                inputStream.close();
    	            }
    	        }
    	        lakotelep ltp = new lakotelep(tomb);
    	        return ltp;
    }
}