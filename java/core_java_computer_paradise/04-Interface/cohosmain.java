interface COHOS
{
  void connect( );
  void transaction();
}
class Oracle implements COHOS
{
  public void connect( )
  {
    System.out.println("Connecting to oracle database...");
  }
  public void transaction( )
  {
    System.out.println(". New patient (oracle)");
    System.out.println(". Doctor details ( oracle )");
    System.out.println(". Pharmacy details ( oracle )");
  }
}
class SqlServer implements COHOS
{
  public void connect( )
  {
    System.out.println("Connecting to Sqlserver database...");
  }
  public void transaction( )
  {
    System.out.println(". New patient (Sqlserver)");
    System.out.println(". Doctor details ( Sqlserver )");
    System.out.println(". Pharmacy details ( Sqlserver )");
  }
}
class cohosmain
{
  public static void main(String v[])
  {
    COHOS c;
    int ch = Integer.parseInt( v[0] );
    if( ch == 1 )
      c = new Oracle();
    else
      c = new SqlServer();
    c.connect( );
    c.transaction( );
  }
}