package PS;

public class PhanSo {
    public long tu,mau;
    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public String toString(long tu , long mau){
        return tu + "/" + mau;
    }
    public void rutGon(){
        long GCD = gcd(this.tu,this.mau);
        System.out.println(toString(this.tu/GCD, this.mau/GCD));
    }
    public long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}