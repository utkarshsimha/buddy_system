
public class Node
{
	Node parent,left,right;
	int size,x,y;
	boolean used;
	byte [] b;
	public Node( Node parent, int size, int x, int y )
	{
		this.parent = parent;
		this.size = size;
		this.x = x;
		this.y = y;
		this.left = null;
		this.right = null;
		this.used = false;
	}
	
	public void allocateMem( int size )
	{
		this.b = new byte[size];
		this.used = true;
	}

}
