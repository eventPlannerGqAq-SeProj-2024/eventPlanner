package event.Planner;

public class Provider extends User{
	
	public Provider(String u,String p,String n, String e, String b, char g,boolean l) {
		super.setUsername(u);
		super.setPassword(p);
		super.setName(n);
		super.setEmail(e);
		super.setBday(b);
		super.setGender(g);
		super.setLogged(l);
	}
	public Provider() {}
}
