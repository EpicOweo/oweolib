package epicoweo.oweolib.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * Creates and writes CSV files from its created rows and columns.
 * 
 * @author EpicOweo
 * @version 0.0.2_ALPHA
 * @since 0.0.2_ALPHA
 * 
 */
public class CSVWriter {

	private ArrayList<ArrayList<String>> columns = new ArrayList<ArrayList<String>>();
	private ArrayList<ArrayList<String>> rows = new ArrayList<ArrayList<String>>();
	private ArrayList<String> headers = new ArrayList<String>();
	
	private String path;
	
	/**
	 * 
	 * @param path	The path to write the CSV file to.
	 * 
	 */
	public CSVWriter(String path) {
		this.path = path;
	}
	
	/**
	 * 
	 * Creates a new row in the table. Does nothing if the amount of elements given
	 * is not equal to the current amount of columns.
	 * 
	 * @param elems	An ArrayList of String elements to add to the row.
	 * 
	 */
	@SuppressWarnings("serial")
	public void newRow(ArrayList<String> elems) {
		if(elems.size() == columns.size()) {
			rows.add(new ArrayList<String>() {{
				for(String e : elems) {
					add(e);
				}
			}});
		}
	}
	
	/**
	 * 
	 * Creates a new column in the table. Does nothing if the amount of elements given
	 * is not equal to the current amount of rows.
	 * 
	 * @param elems		An ArrayList of String elements to add to the column.
	 * @param header	A String which represents the header of the column.
	 * 
	 */
	@SuppressWarnings("serial")
	public void newCol(String header, ArrayList<String> elems) {
		if(elems.size() == rows.size()) {
			headers.add(header);
			columns.add(new ArrayList<String>() {{
				add(header);
				for(String e : elems) {
					add(e);
				}
			}});
		}
	}
	
	/**
	 * 
	 * Writes the table of this writer to a .csv file located at its given path.
	 * This action will overwrite the file.
	 * 
	 */
	public void write() {
		try {
			FileWriter fw = new FileWriter(this.path);
			for(int i = 0; i < headers.size(); i++) {
				if(i == headers.size() - 1) {
					fw.write(headers.get(i) + "\n");
				} else {
					fw.write(headers.get(i) + ",");
				}
			}
			for(int i = 0; i < rows.size(); i++) {
				for(int j = 0; j < rows.get(i).size(); j++) {
					if(j == rows.get(i).size() - 1) {
						fw.write(rows.get(i).get(j) + "\n");
					} else {
						fw.write(rows.get(i).get(j) + ",");
					}
				}
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
