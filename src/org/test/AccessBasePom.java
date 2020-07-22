package org.test;

public class AccessBasePom extends BaseCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        launch();
        url("https://facebook.com/");
       POMBaseCode pm = new POMBaseCode();
        fill(pm.getUser(),"pravinanand07");
        fill(pm.getPass(),"1234567890");
        click(pm.getLogin());
	}

}
