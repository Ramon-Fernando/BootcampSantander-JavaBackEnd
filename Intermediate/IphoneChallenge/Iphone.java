package Intermediate.IphoneChallenge;

public class Iphone implements MusicPlayer, WebBrowser, Phone {

	@Override
	public void call(String phoneNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveCall() {
		System.out.println("Atendendo ligação");
		
	}

	@Override
	public void startVoicemail() {
		System.out.println("Iniciando correio de voz");
		
	}

	@Override
	public void showPage(String link) {
		System.out.println("Mostrando página contida no link:" + link);
		
	}

	@Override
	public void addTab() {
		System.out.println("Adicionando página");
		
	}

	@Override
	public void refreshPage() {
		System.out.println("Recarregando página");
		
	}

	@Override
	public void play() {
		System.out.println("Dando play na música");
		
	}

	@Override
	public void pause() {
		System.out.println("Pausando música");
		
	}

	@Override
	public void selectMusic(String musica) {
		System.out.println("Música: '" + musica + "' selecionada");
	}

	

}
