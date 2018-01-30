package dna;

//
// FastqRecord contains the defline, sequence, and quality string
// from a record in a fastq file.
//

public class FastqRecord implements Comparable<FastqRecord>, DNARecord 
{
	private String			defline;
	private String			sequence;
	private String			quality;
	
	
	//
	// Add a precondition check: throw FastqException if the 1st char of the defline is 
	// not '@'. You will have to change the ctor declaration to say that it throws
	// the exception. The exception should contain a useful informative message.
	//
	public FastqRecord(String defline, String sequence, String quality)
	{
		this.defline = defline;
		this.sequence = sequence;
		this.quality = quality;
	}
	
	
	// 
	// Provide the 2 methods that satisfy the interface.
	//

	

	//
	// Provide equals() and compareTo() methods. Be sure to get the arg and
	// return types right. When comparing string variables, be sure to do it
	// like this:  
	//              this.defline.equals(that.defline) 
	// and not like this:  
	//              this.defline == that.defline
	//
	// compareTo should compare first by defline, then by sequence, then by quality.
	//
	// equals should be compatible with compareTo.
	//
	
	
	
	//
	// Provide a hashCode() method that returns the sum of the hashcodes of 
	// defline, sequence, and quality.
	//
	
	
	//
	// Complete this. Return true if the first char of quality is '!'.
	//
	public boolean qualityIsHigh()
	{

	}
	
	
	public String toString()
	{
		return defline + "\n" + sequence + "\n+\n" + quality;
	}
}
