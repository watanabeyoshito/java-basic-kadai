package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17{

	public KatoHanako_Chapter17() {
        this.setGivenName();
        this.commonIntroduce();
    }

    private void setGivenName() {
        givenName = "花子";
    }

    public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }
}
