package dio_iphone.device;

import dio_iphone.services.MusicPlayer;
import dio_iphone.services.phoneDevice;
import dio_iphone.services.webBrowser;

public class IPhone implements MusicPlayer, phoneDevice, webBrowser {

	private boolean playingMusic;
	private String selectedMusic;
	private boolean hasPage;

	public IPhone() {
	}

	@Override
	public void playMusic() {
		if (playingMusic == false && selectedMusic != null)
			System.out.println("A música " + getSelectedMusic() + " voltou a tocar!");
		else if (playingMusic == true && selectedMusic != null)
			System.out.println("A música já está tocando.");
		else
			System.out.println("Nenhuma música está selecionada ou pausada para dar play.");
	}

	@Override
	public void pauseMusic() {
		if (playingMusic == true && selectedMusic != null)
			System.out.println("A música foi pausada!");
		else if (playingMusic == false && selectedMusic != null)
			System.out.println("A música já está pausada!");
		else
			System.out.println("Nenhuma música está tocando no momento.");

	}

	@Override
	public void selectMusic(String musicName) {
		setSelectedMusic(musicName);
		System.out.println("A música " + musicName + " começou a tocar agora.");
	}

	@Override
	public void call(String number) {
		System.out.println("Ligando para o número " + number);

	}

	@Override
	public void answerCall() {
		System.out.println("Você atendeu a ligação.");

	}

	@Override
	public void beginVoiceMail(String number, String message) {
		System.out
				.println("Você deixou a seguinte mensagem no correio de voz para o número " + number + ": " + message);

	}

	@Override
	public void showPage(String address) {
		setHasPage(true);
		System.out.println("Exibindo a página " + address);

	}

	@Override
	public void addNewTab() {
		System.out.println("Uma aba foi adicionada no navegador.");

	}

	@Override
	public void refreshPage() {
		if (hasPage == true)
			System.out.println("A página foi atualizada!");
		else
			System.out.println("Não há página aberta para ser visualizada.");

	}

	public boolean isPlayingMusic() {
		return playingMusic;
	}

	public void setPlayingMusic(boolean playingMusic) {
		this.playingMusic = playingMusic;
	}

	public String getSelectedMusic() {
		return selectedMusic;
	}

	public void setSelectedMusic(String selectedMusic) {
		this.selectedMusic = selectedMusic;
	}

	public boolean isHasPage() {
		return hasPage;
	}

	public void setHasPage(boolean hasPage) {
		this.hasPage = hasPage;
	}

	@Override
	public String toString() {
		return "IPhone [playingMusic=" + playingMusic + ", selectedMusic=" + selectedMusic + ", hasPage=" + hasPage
				+ "]";
	}

}
