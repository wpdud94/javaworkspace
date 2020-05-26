package self;

public class NoteBook {
	private String brandname;
	private int price;
	public NoteBook(String brandname, int price) {
		this.brandname = brandname;
		this.price = price;
	}
	
	public String getNoteBook() {
		return brandname+", "+price;
	}
}
