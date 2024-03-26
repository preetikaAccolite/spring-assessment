package mappingQ2.mapQ2;

public class Drawing {
	 public Drawing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Drawing(String shape, int width, int height) {
		super();
		this.shape = shape;
		this.width = width;
		this.height = height;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	private String shape;
	    private int width;
	    private int height;

	    // Getters and setters
	    // ...

	    public void draw() {
	        System.out.println("Drawing a " + shape + " with width " + width + " and height " + height);
}}
