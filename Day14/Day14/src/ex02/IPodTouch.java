package ex02;

public class IPodTouch {

    private String maker;
    private String model;

    public IPodTouch() {
        this.maker = "apple";
        this.model = "iPodTouch";
    }
    public String getModel() {
    	return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setMaker(String maker) {
    	this.maker = maker;
    }

    public void internetBrowsing(String url) {
        System.out.println(url + " �ε���...");
        System.out.println("�ε� �Ϸ�");
    }

    public void playMusic(String musicName) {
        System.out.println(musicName + " ��� ����");
    }

    public String infoString() {
        return this.maker + " - " + this.model;
    }
	    
}
