
import java.io.*;
import java.util.*;

class SMTP implements Serializable
{
private String m_to , m_from , m_subject;
private String m_date , m_msg;
private int msgtype;

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

class Pop
{
public static void main(String v[])
{

SMTP mail;
try
{
  ObjectInputStream stream = new ObjectInputStream( new FileInputStream("gmail"));
  mail = (SMTP)stream.readObject ( );

 System.out.println("*******************");
 System.out.println( mail.getTo() );
 System.out.println( mail.getFrom() );
 System.out.println( mail.getSubject() );
 System.out.println( mail.getDate() );
 System.out.println( mail.getMessage() );
 System.out.println("*********************");
 stream.close();
}
catch( Exception e )
{
  System.out.println(e);
}

}
}
	