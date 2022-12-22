package ForDelete;

public class Encapsulation {
    public static void main(String[] args) {
        Printer2 printer2 = new Printer2(50, false);
        System.out.println("initial page count = " + printer2.getPagePrinted());
        int pagesPrinted = printer2.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer2.getPagePrinted());
        pagesPrinted = printer2.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer2.getPagePrinted());
    }
}
class Printer2 {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer2(int tonerLevel, boolean duplex) {

        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerLevel + tonerAmount <= 100)
                return -1;
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }
    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
//            if (pages % 2 ==0) {
//                pagesToPrint = pages /2;
//            }else pagesToPrint = (pages/2)+1;
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagePrinted() {
        return pagesPrinted;
    }
}