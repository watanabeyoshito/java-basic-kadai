package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17{

	public KatoTaro_Chapter17() {
        this.setGivenName();
        this.commonIntroduce();
    }

    private void setGivenName() {
        givenName = "太郎";
    }

    
    public void eachIntroduce() {
        System.out.println("私はJavaが得意です");
    }
}
