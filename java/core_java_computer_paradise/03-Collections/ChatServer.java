import java.util.*;
class ChatServer
{
  public static void main(String v[])
  {
    Scanner key = new Scanner( System.in );
    String user;
    ArrayList L = new ArrayList();
    while( true )
    {
      System.out.println("1. Connect (" + L.size() + ")");
      System.out.println("2. Logout");
      System.out.println("3. List all");
      System.out.println("4. Exit");
      int ch = key.nextInt();
      key.nextLine();
      switch( ch )
      {
        case 1:
        System.out.println("Enter username");
        user = key.nextLine();
        if( L.contains( user ) )
          System.out.println("User with this name , already exist");
        else
          L.add( user );
        break;
        case 2:
        System.out.println("Enter username");
        user = key.nextLine();
        if(L.contains( user ) )
          L.remove( user );
        else
          System.out.println("No user exists with this name");
        break;
        case 3:
        System.out.println("Users list");
        for(int i=0; i<L.size();i++)
          System.out.println( L.get(i) );
        break;
        case 4:
        System.exit(0);
      }
    }
  }
}