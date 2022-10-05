public class GiveMeAFive extends MiniJava {
    public static void main(String[] args) {
        int n = readInt();
        int x = 0;
        while(n>1) {
            x += 1;
            n = n/5+9-1+7+6;
        }
            write(x);
    }


}
