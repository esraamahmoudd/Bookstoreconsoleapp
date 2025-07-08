public class PaperBook extends Book {
    private int availabity;

    public PaperBook(String isbn, String title, int year, Double price, int id) {
        super(isbn, title, year, price);
        this.availabity = id;
    }
    @Override
    public boolean isavailable(int quantity) {
        return availabity >= quantity;
    }

    @Override
    public boolean availabletosale() {
        return true;
    }

    @Override
    public double getTotalPrice(int quantity) {
        int shippingcost;
        shippingcost=50;
        return (quantity * price)+shippingcost;
    }


    @Override
    public void buy(String isbn, int quantity, String email, String address) {
        if (!this.ISBN.equals(isbn)) {
            throw new IllegalArgumentException(" ISBN not match");
        }

        if (!isavailable(quantity)) {
            throw new IllegalArgumentException("paper book not available");
        }
       availabity -= quantity;
        System.out.println("done your paper book will sent and your shipping cost is added it is 50");
    }

}
