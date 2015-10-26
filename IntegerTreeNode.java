public class IntegerTreeNode {

    private final int value;
    private IntegerTreeNode leftNode;
    private IntegerTreeNode rightNode;

    public IntegerTreeNode(int value) {

        this.value = value;
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
}
