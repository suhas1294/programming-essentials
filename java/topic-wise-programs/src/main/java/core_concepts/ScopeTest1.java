package core_concepts;

public class ScopeTest1 {
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	private int x ;
	int initial_value = 10;
	public ScopeTest1(){
		this.initial_value = 20;
	}
}
