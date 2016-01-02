package yuanyu.demo.model;

public class NumberSet {
	//¬O§_³Q²¾°£
	private boolean removed;
	//­È
	private int value;
	
	
	public NumberSet(boolean removed, int value) {
		this.removed = removed;
		this.value = value;
	}
	
	public boolean isRemoved() {
		return removed;
	}
	
	public void setRemoved(boolean removed) {
		this.removed = removed;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "NumberSet [removed=" + removed + ", value=" + value + "]";
	}


	
	
	
}
