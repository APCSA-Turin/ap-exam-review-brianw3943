public class Textbook extends Book {
	private int edition;
	public Textbook(String title, double price, int edition) {
    super(title, price);
    this.edition = edition;
    }
    public int getEdition() {
        return edition;
    }
    public boolean canSubstituteFor(Textbook textbook) {
        return textbook.getTitle().equals(this.getTitle()) && edition >= textbook.getEdition();
    }
    public String getBookInfo() {
        return super.getBookInfo() + "-" + edition;
    }
}
