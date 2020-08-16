package epicoweo.oweolib.test;

import java.io.FileReader;
import java.util.ArrayList;

import epicoweo.oweolib.io.CSVReader;
import epicoweo.oweolib.io.CSVWriter;
import epicoweo.oweolib.misc.AnsiColour;

public class Main {

	@SuppressWarnings("serial")
	public static void main(String[] args) throws Exception {
		CSVReader reader = new CSVReader(new FileReader(System.getProperty("user.dir") + "/src/epicoweo/oweolib/test/test.csv"));
		reader.printTable();
		reader.close();
		
		CSVWriter writer = new CSVWriter(System.getProperty("user.dir") + "/src/epicoweo/oweolib/test/write.csv");
		
		writer.newCol("hi", new ArrayList<String>());
		writer.newCol("there", new ArrayList<String>());
		writer.newCol("my", new ArrayList<String>());
		writer.newCol("dudes", new ArrayList<String>());
		
		writer.newRow(new ArrayList<String>() {{
			add("my");
			add("dudes");
			add("are");
			add("very");
		}});
		writer.newRow(new ArrayList<String>() {{
			add("my");
			add("dfudes");
			add("are");
			add("vfery");
		}});
		writer.newRow(new ArrayList<String>() {{
			add("my");
			add("retudes");
			add("are");
			add("wvery");
		}});
		writer.newRow(new ArrayList<String>() {{
			add("my");
			add("ddudes");
			add("awrtre");
			add("vtwrery");
		}});
		writer.write();
	}

}
