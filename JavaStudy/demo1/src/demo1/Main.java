package demo1;

public class Main {

    public static void main(String[] args) {

        // 複数のインスタンスを生成
        demoOne sato1 = new demoOne("優輝");
        demoOne sato2 = new demoOne("志希");
        demoOne sato3 = new demoOne("優輝");

        System.out.println("--- インスタンスごとのハッシュコード ---");
        System.out.println("sato1のハッシュコード: " + sato1.hashCode());
        System.out.println("sato2のハッシュコード: " + sato2.hashCode());
        System.out.println("sato3のハッシュコード: " + sato3.hashCode());

        System.out.println("--- 「sato1 と sato2」のインスタンスが同一かのチェック ---");
        System.out.println("参照先インスタンスの比較　　: " + (sato1 == sato2));
        System.out.println("参照先インスタンスの値の比較: " + (sato1.equals(sato2)));

        System.out.println("--- 「sato1 と sato3」のインスタンスが同一かのチェック ---");
        System.out.println("参照先インスタンスの比較　　: " + (sato1 == sato3));
        System.out.println("参照先インスタンスの値の比較: " + (sato1.equals(sato3)));
    }
}