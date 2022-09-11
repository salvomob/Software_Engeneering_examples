public class Account{
	private String nome;
	private String cognome;
	private int eta;
	private String nazionalita;
	public Account(String n,String c, int e,String na){
		nome = n;
		cognome = c;
		eta = e;
		nazionalita = na;
	}
	public Account(){}
	
	public void setNome(String n){
		nome = n;
	}
	public void setCognome(String c){
		cognome = c;
	}
	public void setEta(int e){
		eta = e;
	}
	public void setNazionalita(String na){
		nazionalita = na;
	}
	public String getNome(){
		return nome;
	}
	public String getCognome(){
		return cognome;
	}
	public String getNazionalita(){
		return nazionalita;
	}
	public int getEta(){
		return eta;
	}
	public void show(){
		System.out.print("Nome : " + nome + " , Cognome : " + cognome + " , Età : " + eta + "\nQuesto è un account!\n" );
	}
}
