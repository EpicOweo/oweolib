package epicoweo.oweolib.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

import static epicoweo.oweolib.util.OweoArrays.*;
import static epicoweo.oweolib.util.OweoInts.*;
import static epicoweo.oweolib.util.OweoStrings.*;

/**
 * 
 * Reads a given CSV file and gives the ability to print out the table in different ways.
 * 
 * @author EpicOweo
 * @version 0.0.2_ALPHA
 * @since 0.0.1_ALPHA
 * 
 */
public class CSVReader extends BufferedReader {
	
	private ArrayList<ArrayList<String>> columns = new ArrayList<ArrayList<String>>();
	private ArrayList<ArrayList<String>> rows = new ArrayList<ArrayList<String>>();
	private ArrayList<String> headers = new ArrayList<String>();
	private String rawText = "";
	
	/**
	 * 
	 * @param in			The Reader object being used to read the file.
	 * @throws IOException	The file does not exist or cannot be read.
	 *
	 */
	public CSVReader(Reader in) throws IOException {
		super(in);
		String line = "";
		//get each row
		while((line = this.readLine()) != null) {
			//set raw text
			this.rawText += line + "\n";
			ArrayList<String> row = new ArrayList<String>();
			for(String s : line.split("[,]")) {
				row.add(s);
			}
			this.rows.add(row);
		}
		//get each column
		for(int i = 0; i < rows.get(0).size(); i++) {
			ArrayList<String > col = new ArrayList<String>();
			for(ArrayList<String> row : this.rows) {
				col.add(row.get(i));
			}
			this.columns.add(col);
		}
		
		this.headers = this.rows.get(0);
	}
	
	/**
	 * 
	 * Print the raw text of the CSV file.
	 * 
	 */
	public void printRaw() {
		System.out.println(this.rawText);
	}
	
	/**
	 * 
	 * Prints a numbered, graphical table of this CSV file to the console.
	 * 
	 */
	public void printTable() {
		int counter = 0;
		int totalRows = 0;
		for(ArrayList<String> row : rows) {
			totalRows++;
		}
		System.out.print(" " + addZeroesBeforeInt(counter, totalRows) + " | ");
		for(String header : headers) {
			counter++;
			System.out.print(header);
			System.out.print(multiply(" ", longestString(this.getColumn(counter-1)).length() - header.length()));
			if(!(counter >= headers.size())) {
				System.out.print(" | ");
			} else {
				System.out.println();
			}
		}
		for(ArrayList<String> col : this.columns) {
			System.out.print(multiply("-", longestString(col).length() + 3));
		}
		System.out.print(multiply("-", digits(totalRows) + 2));
		System.out.println();
		
		boolean run = false;
		int rowcount = 0;
		for(ArrayList<String> row : this.rows) {
			counter = 0;
			if(!run) {
				run = true;
				continue;
			}
			rowcount++;
			System.out.print(" " + addZeroesBeforeInt(rowcount, totalRows) + " | ");
			for(String item : row) {
				counter++;
				
				System.out.print(item);
				System.out.print(multiply(" ", longestString(this.getColumn(counter-1)).length() - item.length()));
				if(!(counter >= row.size())) {
					System.out.print(" | ");
				} else {
					System.out.println();
				}
			}
		}
		
	}
	
	/**
	 * 
	 * Returns the column with the given index.
	 * 
	 * @param index	The index of the column to get.
	 * @return The column with the given index.
	 * 
	 */
	public ArrayList<String> getColumn(int index) {
		return this.columns.get(index);
	}
	
	/**
	 * 
	 * Returns the row with the given index.
	 * 
	 * @param index	The index of the row to get.
	 * @return The row with the given index.
	 * 
	 */
	
	public ArrayList<String> getRow(int index) {
		return this.rows.get(index);
	}
	
	/**
	 * 
	 * Returns all rows in this table.
	 * 
	 * @return An ArrayList of all rows in the table.
	 * 
	 */
	public ArrayList<ArrayList<String>> getRows() {
		return this.rows;
	}
	
	/**
	 * 
	 * Returns all columns in this table.
	 * 
	 * @return An ArrayList of all columns in the table.
	 * 
	 */
	public ArrayList<ArrayList<String>> getCols() {
		return this.columns;
	}

}
