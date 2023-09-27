package Intermediate.IphoneChallenge;

public class Program {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		//WebBrowser
		iphone.showPage("https://www.apple.com/br/");
		iphone.addTab();
		iphone.refreshPage();
		
		System.out.println();
		
		//MusicPlayer
		iphone.selectMusic("AKB48 - Flying get");
		iphone.pause();
		iphone.play();
		
		System.out.println();

		//Phone
		iphone.call("21984560948");
		iphone.receiveCall();
		iphone.startVoicemail();
		
	}

}
