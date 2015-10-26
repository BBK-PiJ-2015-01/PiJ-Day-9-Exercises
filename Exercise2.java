import java.util.Random;

public class Exercise2 {

	public static void main(String[] args) {
		
//		new Exercise2().exercise2Runner_1();
//		new Exercise2().exercise2Runner_2();
//		new Exercise2().exercise2Runner_2_Random();
//		new Exercise2().exercise2Runner_3();
		new Exercise2().exercise2Runner_3_Random();
	}
	
	private void exercise2Runner_1() {
	
		TreeIntSet root = new TreeIntSet(55);
		root.add(55);
		System.out.println(root);		
		
		root.add(11);
		root.add(11);
		System.out.println(root);	
		
		root.add(66);
		root.add(66);
		System.out.println(root);	
	}
	
	private void exercise2Runner_2() {
		
		System.out.println(new TreeIntSet(55).containsVerbose(29));	
	}
	
	private void exercise2Runner_2_Random() {
	
		long  observationCount = 100;
		TreeIntSet root = new TreeIntSet(1);
		Random r = new Random(observationCount);
		int lookFor = 0;
					
		for (long l = 0; l < observationCount; l++) {
			
			lookFor = r.nextInt();
			root.add(lookFor);
		}
		System.out.println(root.containsVerbose(lookFor));
	}
	
	private void exercise2Runner_3() {
	
		ListIntSet root = new ListIntSet(55);
		root.add(55);
		System.out.println(root);		
		
		root.add(11);
		root.add(11);
		System.out.println(root);	
		
		root.add(66);
		root.add(66);
		System.out.println(root);	
	}
	
	private void exercise2Runner_3_Random() {
	
		long  observationCount = 100;
		ListIntSet root = new ListIntSet(1);
		Random r = new Random(observationCount);
		int lookFor = 0;
					
		for (long l = 0; l < observationCount; l++) {
			
			lookFor = r.nextInt();
			root.add(lookFor);
		}
		System.out.println(root.containsVerbose(lookFor));
	}
}	