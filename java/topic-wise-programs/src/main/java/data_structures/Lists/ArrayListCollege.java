package data_structures.Lists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

class Student
{
	private int m_regno;
	private String m_name;
	public void setRegno(int regno)
	{
		m_regno= regno;
	}
	public void setName( String name)
	{
		m_name = name;
	}
	public int getRegno() { return m_regno;}
	public String getName() { return m_name;}
	public String toString()
	{
		return m_regno + "\t\t" + m_name;
	}
}

class College
{
	private LinkedList<Student> L;
	public College()
	{
		L = new LinkedList();
	}
	public void Addnew(Student s)
	{
		L.add( s );
	}
	public int getCount()
	{
		return L.size();
	}
	public Student getRecord( int i )
	{
		return L.get(i);
	}
}

class ArrayListCollege
{
	public static void main(String v[]) throws IOException
	{
		BufferedReader key = new BufferedReader( new InputStreamReader( System.in ));
		College NIE = new College();
		while( true )
		{
			System.out.println("1. Addnew");
			System.out.println("2. Display all");
			System.out.println("3. Exit");
			int ch = Integer.parseInt(key.readLine());
			switch( ch )
			{
				case 1:
					Student s = new Student();
					s.setRegno( Integer.parseInt(key.readLine()));
					s.setName( key.readLine() );
					NIE.Addnew( s );
					break;
				case 2:
					for(int i=0; i<NIE.getCount(); i++)
					{
						Student rec = NIE.getRecord(i);
						System.out.println(rec);
					}
					break;
				case 3:
					System.exit(0);
			}
		}
	}
}
