public class Book {
            String ISBN;
        private String title;
        private int pubyear;
                Double price;

        public Book(String ISBN, String title, int pubyear, Double price) {
            this.ISBN = ISBN;
            this.title = title;
            this.pubyear = pubyear;
            this.price = price;

        }
        public String getISBN() {
            return ISBN;
        }
        public String getTitle() {
            return title;
        }
        public int getPubear() {
            return pubyear;
        }

        public Double getPrice() {
            return price;
        }

    public boolean isavailable(int quantity) {
        return false;
    }

    public boolean availabletosale() {
        return false;
    }

    public double getTotalPrice(int quantity) {
        return 0;
    }
    public void buy(String ISBNN,int quantity, String email, String address) {
        if (!this.ISBN.equals(ISBN)) {
            throw new IllegalArgumentException(" ISBN not match ");
        }

        throw new UnsupportedOperationException("this not book type");
    }

}
