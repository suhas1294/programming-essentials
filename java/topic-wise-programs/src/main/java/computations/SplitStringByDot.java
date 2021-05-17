package computations;

public class SplitStringByDot {
	public static void main(String[] args) {
		String s = "class tests.online.enduser.flowexecutionInframesandpopup.FlowInFramesTest";
		String[] sa = s.split("\\.");
		System.out.println("pod name is : " + sa[2]);
	}
}
