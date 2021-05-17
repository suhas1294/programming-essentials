
import java.io.*;
import java.util.*;

class SMTP implements Serializable
{
private String m_to , m_from , m_subject;
private String m_date , m_msg;


public void setTo( String to ){m_to = to;}
public String getTo( ) { return m_to; }

public void setFrom( String from){m_from = from;}
public String getFrom() { return m_from; }

public void setSubject( String subject){m_subject = subject;}
public String getSubject( ){ return m_subject; }

public void setDate() { m_date = new Date().toString(); }
public String getDate() { return m_date; }

public void setMessage(String msg){ m_msg = msg;}
public String getMessage() { return m_msg; }

}

class MailApp
{
public static void main(String v[])
{

Scanner key = new Scanner( System.in );
SMTP mail = new SMTP();

System.out.println ("To   :");
		mail.setTo( key.nextLine() );
	
System.out.println ("From   :");
		mail.setFrom( key.nextLine() );

System.out.println ("Subject:");
		mail.setSubject( key.nextLine() );
		mail.setDate();

System.out.println ("Mail body :");
		mail.setMessage( key.nextLine() );
		
try
{
  ObjectOutputStream stream = new ObjectOutputStream( new FileOutputStream("gmail.txt"));
  stream.writeObject ( mail );
  stream.close();
}
catch( Exception e )
{
  System.out.println(e);
}

}
}
	