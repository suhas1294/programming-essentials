package computations;;

import java.util.Random;
import java.util.Scanner;

class Car
{
	private int maxspeed=230,speed;
	private String model,name,color;
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	
	public String toString() {
		return name+"\t"+model+"\t"+color+"\t"+speed;
	}
}

public class Race {
	
	public static String generatename() {
		Random r=new Random();
		String name="";
		for(int i=0;i<10;i++)
		{
			name+=(char)(65+r.nextInt(26));
		}
		return name;
	}
	public static String generatecolor() {
		Random r=new Random();
		String color="";
		int ch=r.nextInt(5);
		switch (ch) {
			case 1:color="Black";
				break;
			case 2:color="Blue";
				break;
			case 3:color="Red";
				break;
			case 4:color="White";
				break;
			case 5:color="Grey";
				break;
		}
		return color;
	}
	public static String generatemodel(){
		Random r=new Random();
		String name="";
		for(int i=0;i<4;i++)
		{
			if(r.nextInt(2)==0){
				name+=(char)(65+r.nextInt(26));
			}
			else{
				name+=r.nextInt(26);
			}
		}
		return name;
	}
	public static int generatespeed(Car c){
		Random r=new Random();
		return r.nextInt(c.getMaxspeed());
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of cars");
		
		int max=s.nextInt();
		
		System.out.println("The cars in race:");
		Car c[]=new Car[max];
		for(int i=0;i<max;i++)
		{
			c[i]=new Car();
			c[i].setColor(generatecolor());
			c[i].setModel(generatemodel());
			c[i].setName(generatename());
			c[i].setSpeed(generatespeed(c[i]));
			System.out.println(c[i]);
		}
	}
}
