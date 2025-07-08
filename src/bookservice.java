public class bookservice {
    public double handlePurchase(Book book, int quantity, String email, String address) {
        if (book == null || !book.availabletosale()) {
            throw new IllegalArgumentException("Book not found or not for sale");
        }

        if (!book.isavailable(quantity)) {
            throw new IllegalArgumentException("quantity not available");
        }

        book.buy(book.getISBN(), quantity, email, address);
        double amount = book.getTotalPrice(quantity);
        System.out.println("done and cost " + amount);
        return amount;
    }
}
