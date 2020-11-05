package de.martin.uebungen;

public class TestprogrammOO {

	public static void main(String[] args) {
		
		TestprogrammOO t = new TestprogrammOO();
		//System.out.println(t);
		
		// +++++++++++++++++++++++++++++++++++++++++++++++>>> SICHERHEIT: <<<===
		String trainer = "Markus";
		String[] members = {"Frank", "Michael"};
		
		
		// OOBootcamp bonn = new OOBootcamp("Andre");
		// OOBootcamp darmstadt = new OOBootcamp("David");
		
		OOBootcamp bonn = new OOBootcamp(members, trainer);
		OOBootcamp darmstadt = new OOBootcamp(new String[] {"Alexander", "Monika", "Bert"}, "David");
		OOBootcamp fundamentals = new OnlineBootcamp(new String[] {"Frank1", "Frank2", "Frank3"}, "André", "Slack");
		OOBootcamp bonn2 = new OOBootcamp();
		// +++++++++++++++++++++++++++++++++++++++++++++++>>> SICHERHEIT: <<<===
		members[1] = "Corona";     // Hier wird die Referenz übergeben...  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> durch clone kann es ferhindert werden !!! Siehe Konstruktor!
		trainer = "CoronaTrainer"; // Hier geht das Einschleußen nicht !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		
		// das geht durch private nicht mehr !!!!  -->>> Siehe OOBootcamp.java: "private String[] members;"
		//bonn.trainer = "Andre-Betrug";
		
		
		//System.out.println(darmstadt.trainer);
		
		/* verbesserte Version */
		System.out.println(java.util.Arrays.toString(bonn.getMembers()));
		System.out.println(bonn.getTrainer());
		System.out.println(bonn.getWeek());
		System.out.println(bonn.isRemote());
		
		// durch private muss Getter & Setter benutzt werden !!!
		//System.out.println(bonn.remote);
		
		System.out.println();
		
		System.out.println(java.util.Arrays.toString(darmstadt.getMembers()));
		System.out.println(darmstadt.getTrainer());
		System.out.println(darmstadt.getWeek());
		System.out.println(darmstadt.isRemote());
		
		
		
		
		
		/* NEU: */
		System.out.println();
		// man kann toString weglassen: So würde es aber auch funktionieren: // System.out.println(bonn.toString());
		System.out.println(bonn);
		System.out.println(darmstadt);
		
		System.out.println();
		System.out.println();
		fundamentals.plusOneMember("Alexander");
		fundamentals.plusOneMember("Thomas");
		fundamentals.plusOneMember("Martin");
		fundamentals.plusOneMember("Oliver");
		System.out.println(fundamentals);
		
		System.out.println();
		System.out.println("Anzahl Bootcamps: " + OOBootcamp.anzahl);

	}
	
	
	

}





