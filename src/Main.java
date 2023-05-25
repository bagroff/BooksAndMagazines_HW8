public class Main {
    public static void main(String[] args) {
        Printable[] printableItems = new Printable[6];
        printableItems[0] = new Book("Java. The seventh edition");
        printableItems[1] = new Magazine("Forbes");
        printableItems[2] = new Book("Java Script");
        printableItems[3] = new Magazine("National Geographic");
        printableItems[4] = new Book("C++ for beginners");
        printableItems[5] = new Magazine("Chip");

        for (Printable printable : printableItems) {
            printable.print();
        }

        System.out.println();
        System.out.println("--- Printing Books ---");
        Book.printBooks(printableItems);
        System.out.println();
        System.out.println("--- Printing Magazines ---");
        Magazine.printMagazines(printableItems);
    }
}