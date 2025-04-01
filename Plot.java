public class Plot {
	private int x, y, depth, width;
	
	public Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}
	
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	public Plot(Plot p) {
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
		
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	
	public boolean overlaps(Plot p) {
		if(this.x + this.width <= p.x || p.x + p.width <= this.x || this.y + this.depth <= p.y || p.y + p.depth <= this.y) {
			return false;
		}
		return true;
	}
	
	public boolean encompasses(Plot p) {
		return (this.x <= p.x && this.y <= p.y && this.x + this.width >= p.x + p.width && this.y + this.depth >= p.y + p.depth);
	}
	
	
	@Override
	public String toString(){
		return x + "," + y + "," + width + "," + depth;
	}
}
