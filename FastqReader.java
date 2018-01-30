package dna;

import java.io.*;


//
// Reads lines from a BufferedReader and builds a FastqReader.
//


public class FastqReader 
{
	private BufferedReader			theBufferedReader;
	
	
	public FastqReader(BufferedReader theBufferedReader)
	{
		this.theBufferedReader = theBufferedReader;
	}
	
	
	// Returns next record in the file, or null if EOF.
	public FastqRecord readRecord() throws IOException, FastqException
	{
		// Read the defline. Return null if you read null, indicating end of file.
		String defline = theBufferedReader.readLine();
		if (defline == null)
			return null;
		
		// Read the next 3 lines from the buffered reader. Construct and return
		// a FastqRecord.

	}
}
