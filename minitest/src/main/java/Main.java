import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Book[] bookList = new Book[10];
        bookList[0] = new ProgammingBook("PB1", "Learning Java", 80, "CodeGym", "Java", "Strust");
        bookList[1] = new ProgammingBook("PB2", "Learning AutoIT", 90, "CodeGym", "AutoIt", "AutoItX");
        bookList[2] = new ProgammingBook("PB3", "Learning C#", 100, "CodeGym", "C#", "Normal");
        bookList[3] = new ProgammingBook("PB4", "Leaning C++", 101, "FPT", "C++", "IoStream");
        bookList[4] = new ProgammingBook("PB5", "Leaning HTML", 88, "Viettel", "HTML", "OPP");
        bookList[5] = new FictionBook("FB1", "1984", 99, "George Orwell", "Vien tuong 1");
        bookList[6] = new FictionBook("FB2", "Star War", 69, "Disney ", "Vien tuong 1");
        bookList[7] = new FictionBook("FB3", "The Wind", 66, "Ma", "Notel");
        bookList[8] = new FictionBook("Fb4", "The School", 196, "La tao", "Nobel");
        bookList[9] = new FictionBook("FB5", "Tay du ki", 59, "La May", "Novel");
        float sumbook = 0;
        for (Book f1 : bookList) {
            sumbook += f1.getPrice();
        }
        System.out.println("Tong so tien sach la: %f " + sumbook);
        float sumcatalogyVT1=0;
        for (Book f1: bookList) {
            if (f1 instanceof FictionBook){
                if  (((FictionBook) f1).getCatelogy().equals("Vien tuong 1")) {
 //             if  (Objects.equals(((FictionBook) f1).getCatelogy(), "Vien tuong 1")) {
                  sumcatalogyVT1++;
              }
            }
        }
        System.out.println("So sach co cataalogy Vien tuong 1 la "+sumcatalogyVT1);

        float cheapbook=0;
        for (Book f1: bookList) {
            if ( f1.getPrice()<100)
            cheapbook++;
        }
        System.out.println("so sach co gia re hon 100 USD la " + cheapbook);
    }

}
