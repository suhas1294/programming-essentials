

	import java.io.*;
	import java.util.*;
	import java.util.zip.*;
	 
	class FileCompress
	{
	public static void main(String v[])
	{

	try 
	{

       // Create the GZIP output stream
       String outFilename = "outfile.gz";

       GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream(outFilename));


    String inFilename = v[0];

    FileInputStream in = new FileInputStream(inFilename);

    // Transfer bytes from the input file to the GZIP output stream
    
    byte[] buf = new byte[1024];
    int len;

    while ((len = in.read(buf)) > 0) 
   {
        out.write(buf, 0, len);
    }
    in.close();

    // Complete the GZIP file
    out.finish();
    out.close();
    } catch (IOException e) { }

     }	
   }
