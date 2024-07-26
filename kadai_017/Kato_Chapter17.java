package kadai_017;

abstract public class Kato_Chapter17 {

    public String familyName;
    public String givenName;
    public String address;

    public void commonIntroduce() {
        familyName = "加藤";
        address = "東京都中野区〇×";
    }

    abstract public void eachIntroduce();

    public void execIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address + "です");
        eachIntroduce(); // 各クラスの特定の紹介を呼び出す
    }
}

