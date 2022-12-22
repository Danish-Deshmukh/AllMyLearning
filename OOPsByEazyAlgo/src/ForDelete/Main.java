package ForDelete;

public class Main {
}

class Printer {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
//        int plus = tonerAmount + tonerLevel;
//        tonerAmount = (tonerAmount > 0 && tonerAmount <= 100) ? ((plus > 100) ? -1 : (tonerLevel += tonerAmount)) : -1;
//         if (tonerAmount>0 && tonerAmount<=100) {
//            return (plus > 100) ? -1 : (tonerLevel += tonerAmount);
//        }
        return  (tonerAmount>0 && tonerLevel + tonerAmount<=100) ? (tonerLevel += tonerAmount) : -1;
    }

    public int printPages(int pages) {

        // int pagesToprint = (duplex)?(Math.round((float)pages/2)):pages;
        int pagesToPrint = (duplex) ? (Math.round((float) pages/2)) : pages;
        pagesPrinted += pagesToPrint;
//        int pagesToprint = pages;
//        if (duplex) {
//            pagesToprint = (Math.round((float) pages/2));
//        }
        return pagesToPrint;
    }
    public int getPagesPrinted (){
        return pagesPrinted;
    }
}
 class Printer1 {

    public static void main(String[] args) {
        Printer1 printer = new Printer1(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer1(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel>-1 && tonerLevel<=100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount>0 && tonerAmount<=100) {
            return (tonerLevel + tonerAmount > 100) ? -1 : (tonerLevel += tonerAmount);
        }
        return -1;
        // return (tonerAmount>0 && tonerLevel + tonerAmount<=100) ? (tonerLevel += tonerAmount) : -1;
    }

    public int printPages(int pages) { // use Math.round instead of pagesToPrint = (pages/2) + (pages%2); for the extra page
        // int pagesToPrint = pages;
        // if (duplex) {
        //     pagesToPrint = (Math.round((float) pages/2)); // no casting of calculation if using float to cast pages
        //     // pagesToPrint = (int) (Math.round((double) pages/2)); // explicit casting if using double to cast pages
        // }

        int pagesToPrint = (duplex) ? (Math.round((float) pages/2)) : pages;
        pagesPrinted += pagesToPrint; // add the pagesToPrint for this job to lifetime printer counter
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}