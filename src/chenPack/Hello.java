package chenPack;

public class Hello {
    public static void main(String[] args) {
        int i = 167776589;//00001010 00000000 00010001 01001101
        int j = 167776512;//00001010 00000000 00010001 00000000
        int num = i & j;  //00001010 00000000 00010001 00000000
        int ans=0x11C;
        System.out.println(ans);
        System.out.println(Integer.toHexString(num));
        System.out.println(Integer.parseInt("0101",2));
    }
}
