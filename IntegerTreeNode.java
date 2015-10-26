public class IntegerTreeNode {

    private int value;
    private IntegerTreeNode leftNode;
    private IntegerTreeNode rightNode;
	private StringBuilder sb;
	//
	private final String EMPTY_BRACKETS = "%s[]";
	private final String BRACKETS = "[%s L%s R%s]";
	

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
	
	public String toString() {
	
		sb = new StringBuilder();
		//sb.append(value==0 ? String.format(BRACKETS,"","") : String.format(BRACKETS,"",value))
		//	.append(leftNode == null ? String.format(BRACKETS,"L","") : String.format(BRACKETS,"L",leftNode) )
		//	.append(rightNode == null ? String.format(BRACKETS,"R","") : String.format(BRACKETS,"R",rightNode) );
		return String.format(BRACKETS, Integer.toString(value)
			, (leftNode == null ? "[]" : leftNode)
			, (rightNode == null ? "[]" : rightNode));
//		String valueAsString = Integer.toString(value);
//		String nodeValues = (leftNode == null ? String.format(BRACKETS,"L","") : String.format(BRACKETS,"L",leftNode))
//			+ (rightNode == null ? String.format(BRACKETS,"R","") : String.format(BRACKETS,"R",rightNode));
//		return String.format(String.format(BRACKETS,valueAsString,nodeValues));
//		sb.append(value==0 ? String.format(BRACKETS,"","") : String.format(BRACKETS,"",value));
//			.append(leftNode == null ? String.format(BRACKETS,"L","") : String.format(BRACKETS,"L",leftNode) )
//			.append(rightNode == null ? String.format(BRACKETS,"R","") : String.format(BRACKETS,"R",rightNode) );
//		return sb.toString();
	}
}
