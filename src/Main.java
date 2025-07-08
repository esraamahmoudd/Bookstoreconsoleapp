public class Main {
    public static void main(String[] args) {

        store myStore = new store();


        bookservice service = new bookservice();

        Book paper = new PaperBook("10", "book1", 2003, 200.0,1);
        Book ebook = new Ebook("11", "book2", 2025, 500.0,2);
        Book demo = new Demo("12", "book3", 2023, 0.0,3);
        Book paper2 = new PaperBook("15", "book1", 2022, 200.0,13);

        myStore.addbook(paper);
        myStore.addbook(ebook);
        myStore.addbook(demo);
        myStore.addbook(paper2);

        System.out.println("\n---------------- remove book ----------------------");
        Book removed = myStore.removebook(2025, 10);
        if (removed != null) {
            System.out.println("remove book " + removed.getTitle());
        } else {
            System.out.println("no book there");
        }

        System.out.println("\n----------------- trying to buy deleted  book ---------------------");
        try {
            Book toBuy = myStore.findbook("10");
            service.handlePurchase(toBuy, 2, "esraamahmoudd18@email.com", "elmohandseen");
        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }


        System.out.println("\n----------------- paper book ---------------------");
        try {
            Book toBuy = myStore.findbook("15");
            service.handlePurchase(toBuy, 2, "esraamahmoudd18@email.com", "elmohandseen");
        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }

        System.out.println("\n----------------- Ebook-----------------");
        try {
            Book toBuy = myStore.findbook("11");
            service.handlePurchase(toBuy, 1, "esraamahmoudd18@email.com", "myemail");
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }

        System.out.println("\n--------------- demo-----------------");
        try {
            Book toBuy = myStore.findbook("12");
            service.handlePurchase(toBuy, 1, "esraamahmoudd18@email.com", "myemail");
        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }
    }
}
