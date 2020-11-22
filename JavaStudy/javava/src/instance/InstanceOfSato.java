package instance;

import java.util.Objects;

public class InstanceOfSato {

    private String firstName;
    
    public InstanceOfSato(String firstName) {
        this.firstName = firstName;

    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstanceOfSato)) {
            return false;
        }
        InstanceOfSato other = (InstanceOfSato) obj;
        return Objects.equals(firstName, other.firstName);
    }

}

public class Main {

    public static void main(String[] args) {

        // 複数のインスタンスを生成
        InstanceOfSato sato1 = new InstanceOfSato("優輝");
        InstanceOfSato sato2 = new InstanceOfSato("志希");
        InstanceOfSato sato3 = new InstanceOfSato("優輝");

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