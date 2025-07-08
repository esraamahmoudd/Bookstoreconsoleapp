public class Demo extends Book {
    private int availabity;

    public Demo(String isbn, String title, int year, Double price, int id) {
        super(isbn, title, year, 0.0);
        this.availabity = id;
    }
    @Override
    public boolean isavailable(int quantity) {
        return availabity >= quantity;
    }

    @Override
    public boolean availabletosale() {
        return false;
    }

    @Override
    public double getTotalPrice(int quantity) {
        return 0;
    }


    @Override
    public void buy(String ISBNN,int quantity, String email, String address) {
        if (!this.ISBN.equals(ISBN)) {
            throw new IllegalArgumentException(" ISBN not match ");
        }

        throw new UnsupportedOperationException("you not able to buy it");
    }
}
