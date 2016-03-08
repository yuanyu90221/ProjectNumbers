package demo;

public class Tree {

    private int height = -1;
    private int accessable = 0;
    public int getAccessable() {
		return accessable;
	}

	public void setAccessable(int accessable) {
		this.accessable = accessable;
	}

	private Node current;
    
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public Node getCurrent() {
		return current;
	}
	
	public void setCurrent(Node current) {
		this.current = current;
	}
    
    public void trasverse(){
    	if(current != null){
    		trasverseNode(current);
    	}
    	else{
    	  System.out.println("null Tree");
    	}
    }
    
    public void trasverseNode(Node node){
        if(node!=null){
        	System.out.print("(" + node.getValue() + ",");
        	trasverseNode(node.getLeftNode());
        	System.out.print(",");
        	trasverseNode(node.getRightNode());
        	System.out.print(")");
        	if(node.getLeftNode()!=null){
	    	  if(height == -1){
	    		 height+=2;
	    	  }
	    	  else{
	    		 height++;
	    	 }
        	}
        }
        else{
        	System.out.print("Null");
        	return;
        }
    }
}
