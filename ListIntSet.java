public class ListIntSet implements IntSet{

	private int value;
    private ListIntSet next;
	
    public ListIntSet(int value) {

        this.value = value;
		next = null;
    }

	public void add(int newNumber) {
		
		if (newNumber == value) {
			return;
		}
        if (next == null) {
			next = new ListIntSet(newNumber);
        } else {
			next.add(newNumber);
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
		if (n == value) {
			return true;
		} else if (next != null) {
			return next.containsVerbose(n, report);
		}
        return false;
    }

	public String toString() {
	
		return Integer.toString(value) +  ", " + (next == null ? "" : next);
	}
}