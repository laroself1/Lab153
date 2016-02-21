public class Main {
    public static void main(String[] args) {
        int i;
        int p=1;
        System.out.println("* | 1 2 3 4 5 6 7 8 9");
        System.out.println("---------------------");
        for (i=1; i<=9; i++){
            System.out.print(i +" | ");
            for (p=1;p<=9; p++) {
                System.out.print(p*i+" ");}
            System.out.println();}}}