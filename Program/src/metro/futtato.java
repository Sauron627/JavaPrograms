package metro;

import java.io.IOException;

public class futtato {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MetroReader.read("input.txt");
		Megoldo megoldas = new Megoldo();
		megoldas.megalloszam();
		megoldas.leghosszabbVonalak();
		megoldas.csakMetroval();
	}

}
