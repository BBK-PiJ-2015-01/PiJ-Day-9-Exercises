import java.util.Random;

public class Exercise1 {


	public static void main(String[] args) {
		
//		new Exercise1().exercise1Runner_1();
		new Exercise1().exercise1Runner_1_Random();
	
	}
	
	private void exercise1Runner_1() {
	
		IntegerTreeNode root = new IntegerTreeNode(55);
		root.add(13);
		root.add(66);
		int lookFor = 13;
		System.out.println("Tree " + (root.contains(lookFor) ? "CONTAINS " : "DOES NOT contain ") + lookFor );
		System.out.println("Search for " +  lookFor + " took " + root.searchFor(lookFor) + " iterations" );
		System.out.println(root);
		
	}
	
	private void exercise1Runner_1_Random() {
	
		long  observationCount = 1000000;
		IntegerTreeNode root = new IntegerTreeNode();
		Random r = new Random(observationCount);
		int lookFor = 0;
					
		for (long l = 0; l < observationCount; l++) {
			
			lookFor = r.nextInt();
			root.add(lookFor);
		}
		System.out.println("Tree " + (root.contains(lookFor) ? "CONTAINS " : "DOES NOT contain ") + lookFor );
		System.out.println("Search for " +  lookFor + " took " + root.searchFor(lookFor) + " iterations" );
		
		System.out.println("Tree " + (root.contains(lookFor-1) ? "CONTAINS " : "DOES NOT contain ") + (lookFor-1) );
		System.out.println("Search for " +  (lookFor-1) + " took " + root.searchFor(lookFor-1) + " iterations" );		
		System.out.println(root);
	}
}