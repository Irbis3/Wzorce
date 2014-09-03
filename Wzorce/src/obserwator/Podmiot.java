package obserwator;

public interface Podmiot {
	public void zarejestrujObserwatora(Obserwator obserwator);
	public void usuńObserwatora(Obserwator obserwator);
	public void powiadomObserwatorów();
}
