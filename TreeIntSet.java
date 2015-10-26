public class TreeIntSet implements IntSet{

	private int value;
    private TreeIntSet leftNode;
    private TreeIntSet rightNode;
	//
	private final String SIMPLE_BRACKETS = "[%s%s%s]";
	
    public TreeIntSet(int value) {

        this.value = value;
		leftNode = null;
		rightNode = null;
    }

	public void add(int newNumber) {
		
		if (newNumber == value) {
			return;
		}

        if (newNumber > this.value) {
            if (rightNode == null) {
                rightNode = new TreeIntSet(newNumber);
            } else {
                rightNode.add(newNumber);
            }
        } else {
            if (leftNode == null) {
                leftNode = new TreeIntSet(newNumber);
            } else {
                leftNode.add(newNumber);
            }
        }
    }
	
	public boolean contains(int n) {
		return containsVerbose(n, false);
	}
	
	public boolean containsVerbose(int n) {
		return containsVerbose(n, true);
	}
		
    private boolean containsVerbose(int n, boolean report) {
        
		if (report) {
			System.out.println("Checking " + n + " against value " + value);
		}
        if (n == this.value) {
            return true;
        } else if (n > this.value) {
            if (rightNode == null) {
                return false;
            } else {
                return rightNode.containsVerbose(n, report);
            }
        } else {
            if (leftNode == null) {
                return false;
            } else {
                return leftNode.containsVerbose(n, report);
            }
        }
    }


	public String toString() {
	
		return String.format(SIMPLE_BRACKETS,  Integer.toString(value) + (leftNode == null && rightNode== null ? "" : " ")
			, (leftNode == null ? "" : leftNode)
			, (rightNode == null ? "" : rightNode));
	}
}