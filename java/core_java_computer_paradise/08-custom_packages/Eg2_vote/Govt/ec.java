
package Govt;
import java.util.Date;

public class ec
{
public boolean canVote( String dob )
{
 Date d = new Date();
 int age = (d.getYear()+1900) - Integer.parseInt( dob.split("-")[2] );
 return age>=18? true: false;
}
}