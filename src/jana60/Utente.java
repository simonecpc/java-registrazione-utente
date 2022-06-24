package jana60;

public class Utente {

	private String nome;
	private String cognome;
	private String email;
	private String password;
	private int eta;
	
	public Utente(String nome, String cognome, String email, String password, int eta) throws Exception{
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.eta = eta;
		this.validaemail();
		this.validaeta();
		this.validapassword();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	

	public void validaemail() throws Exception {
		if (!email.contains("@") && !email.contains(".")) {	
			throw new Exception("L'email deve contenere i carattero '@' e '.' ");
		}
	}

	public void validapassword() throws Exception {
		if (password.length() < 8 && password.length() > 12) {
			throw new Exception("La password deve essere tra gli 8 e i 12 caratteri");
		}
	}

	public void validaeta() throws Exception {
		if (eta < 18) {
			throw new Exception("Devi avere almeno 18 anni");
		}
	}

	@Override
	public String toString() {
		return nome + cognome + email + password + eta;
	}
	
	
}
