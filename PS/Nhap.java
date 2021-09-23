package PS;
import java.util.*;
// import PS.PhanSo;

public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo ps1 = new PhanSo(sc.nextLong(),sc.nextLong());
        ps1.rutGon();
    }
}