

	class BasicModel
	{
	public void Call()
	{
	 System.out.println("Call feature");
	}

	public void Sms()
	{
	 System.out.println("Sms feature");
	}	
	}

	class ExtendedModel extends BasicModel
	{
	public void Camera()
	{
	 System.out.println("Camera feature");
	}

	public void Gesture()
	{
	 System.out.println("Identify application based on gesture");
	}
	
	}

	
	class eg14
	{
	public static void main(String v[])
	{
	 ExtendedModel e = new ExtendedModel();
		
		e.Call();
		e.Sms();
		e.Camera();	
		e.Gesture();
	}
	}
	
	

