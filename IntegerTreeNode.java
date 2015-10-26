public class IntegerTreeNode {

    private int value;
    private IntegerTreeNode leftNode;
    private IntegerTreeNode rightNode;
	//
	private final String BRACKETS = "[%s L%s R%s]";
	private final String SIMPLE_BRACKETS = "[%s%s%s]";
	

    public IntegerTreeNode(int value) {
		
		this();
        this.value = value;
    }
	
	public IntegerTreeNode() {

		leftNode = null;
		rightNode = null;
    }

    public void add(int newNumber) {

        if (newNumber > this.value) {
            if (rightNode == null) {
                rightNode = new IntegerTreeNode(newNumber);
            } else {
                rightNode.add(newNumber);
            }
        } else {
            if (leftNode == null) {
                leftNode = new IntegerTreeNode(newNumber);
            } else {
                leftNode.add(newNumber);
            }
        }
    }

    public boolean contains(int n) {
        
        if (n == this.value) {
            return true;
        } else if (n > this.value) {
            if (rightNode == null) {
                return false;
            } else {
                return rightNode.contains(n);
            }
        } else {
            if (leftNode == null) {
                return false;
            } else {
                return leftNode.contains(n);
            }
        }
    }
	public int depth() {
		
			return Math.max((leftNode == null ? 0 : 1 + leftNode.depth()) , (rightNode == null ? 0 : 1 + rightNode.depth()));		
	}
	
	public void remove(int n) {
		
	}
	
	
	public int searchFor(int n) {
        
        if (n == this.value) {
            return 1;
        } else if (n > this.value) {
            if (rightNode == null) {
                return 0;
            } else {
                return rightNode.searchFor(n) + 1;
            }
        } else {
            if (leftNode == null) {
                return 0;
            } else {
                return leftNode.searchFor(n) + 1;
            }
        }
    }
	
	public int getMax(){
		
		if ( rightNode == null) {
			return value;
		} else {
			return rightNode.getMax();
		}		
	}
	
	public int getMin() {
		
		if ( leftNode == null) {
			return value;
		} else {
			return leftNode.getMin();
		}	
	}
	
	public String _toString() {
	
		return String.format(BRACKETS, Integer.toString(value)
			, (leftNode == null ? "[]" : leftNode)
			, (rightNode == null ? "[]" : rightNode));
	}
	
	public String toString() {
	
		return String.format(SIMPLE_BRACKETS,  Integer.toString(value) + (leftNode == null && rightNode== null ? "" : " ")
			, (leftNode == null ? "" : leftNode)
			, (rightNode == null ? "" : rightNode));
	}
}
