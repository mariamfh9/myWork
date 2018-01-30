package dna;


public class FastaRecord implements Comparable<FastaRecord>, DNARecord 
{
	private String			defline;
	private String			sequence;
	
	//
	// Add a precondition check: throw FastqException if the 1st char of the defline is 
	// not '>'. You will have to change the ctor declaration to say that it throws
	// the exception. The exception should contain a useful informative message.
	//
	public FastaRecord(String defline, String sequence)
	{
		this.defline = defline;
		this.sequence = sequence;
	}
	
	
	// Initialize defline and sequence from the input record. For the defline, convert the
	// 1st char ('@') to '>'.
	public FastaRecord(FastqRecord fastqRec)
	{

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
	// compareTo should compare first by defline, then by sequence.
	//
	// equals should be compatible with compareTo.
	//
	
	
	public String toString()
	{
		return defline + "\n" + sequence + "\n";
	}
	
	

	//
	// Provide a hashCode() method that returns the sum of the hashcodes of 
	// defline and sequence.
	//
}
