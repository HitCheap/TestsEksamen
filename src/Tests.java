import javax.swing.JOptionPane;

public class Tests {

	public static void main(String[] args) {
		int pareizi=0;
		String izvele;
		boolean nepa1=false, nepa2=false, nepa3=false, nepa4=false, nepa5=false, nepa6=false, nepa7=false, nepa8=false, nepa9=false, nepa10=false;
		do 
	izvele = JOptionPane.showInputDialog("1. Kas ir while cikls?\n\n1- Cikls ar nosacījumu cikla sākumā\n2- Cikls ar nosacījumu cikla beigās\n3- Cikls priekš boolean\n4- Tāds neiksistē\n");
		while(!izvele.equals("1") && !izvele.equals("2") && !izvele.equals("3") && !izvele.equals("4"));
	if(izvele.equals("1"))
	pareizi++;
	else 
		nepa1=true;
	do 
		izvele = JOptionPane.showInputDialog("2. Ko while cikls dara pirms tas uzsāk darbību?\n\n1- Vai nav tukš while cikls\n2- Vai ir ievadīts iekšā string un int tipi\n3- Tas pārbauda cikla sākuma nosacījumu\n4- Tas nosaka daudzumu ciklam\n");
			while(!izvele.equals("1") && !izvele.equals("2") && !izvele.equals("3") && !izvele.equals("4"));
		if(izvele.equals("3"))
		pareizi++;
		else 
			nepa2=true;
		do 
			izvele = JOptionPane.showInputDialog("3. Ko dara while cikls ja nosacījums  ir patiess?\n\n1- Cikls netiek pildīts\n2- Tiek uzsākta cikla darbība\n3- Izvada kodu rindu pirms while cikla\n4- Neko nedara\n");
				while(!izvele.equals("1") && !izvele.equals("2") && !izvele.equals("3") && !izvele.equals("4"));
			if(izvele.equals("2"))
			pareizi++;
			else 
				nepa3=true;
			do 
				izvele = JOptionPane.showInputDialog("4. Ko dara while cikls ja nosacījums  ir aplams?\n\n1- Atgādina ievadīt pareizus datus \n2- Neko nedara\n3- Tiek uzsākta cikla darbība\n4- Cikls netiek pildīts\n");
					while(!izvele.equals("1") && !izvele.equals("2") && !izvele.equals("3") && !izvele.equals("4"));
				if(izvele.equals("4"))
				pareizi++;
				else 
					nepa4=true;
				do 
					izvele = JOptionPane.showInputDialog("5. Kad while ciklā ir jālieto figūriekavas '{' un '}'?\n\n1- Kad vēlas\n2- Ja ciklā jāizpilda vairākas komandas\n3- Figūriekavas nav jālieto while ciklā\n4- Ja ciklā jāizpilda tikai viena komanda\n");
						while(!izvele.equals("1") && !izvele.equals("2") && !izvele.equals("3") && !izvele.equals("4"));
					if(izvele.equals("2"))
					pareizi++;
					else 
						nepa5=true;
					do 
						izvele = JOptionPane.showInputDialog("6. Kāda atšķirība ir starp while un do while?\n\n1- While ciklā ir zināms cik reizes cikls atkārtosies, bet do while ciklā nē \n2- Nav atšķirības\n3- While cikls sākumā pārbauda nosacījumu, bet do while beigās\n4- While cikls beigās pārbauda nosacījumu, bet do while sākumā\n");
							while(!izvele.equals("1") && !izvele.equals("2") && !izvele.equals("3") && !izvele.equals("4"));
						if(izvele.equals("3"))
						pareizi++;
						else 
							nepa6=true;
						do 
							izvele = JOptionPane.showInputDialog("7. Kas notiek ja while ciklā neieliek komandu, kas maina cikla sākumvērtību?\n\n1- Cikls strādās bezgalīgi\n2- While ciklā nevajag komandu kas izmaina sākumvērtību\n3- While cikls kļūst par do while ciklu\n4- Nekas nenotiek\n");
								while(!izvele.equals("1") && !izvele.equals("2") && !izvele.equals("3") && !izvele.equals("4"));
							if(izvele.equals("1"))
							pareizi++;
							else 
								nepa7=true;
							do 
								izvele = JOptionPane.showInputDialog("8. Kas notiek ja while ciklā nav dota sākumvērtība?\n\n1- Cikls turpina darbu\n2- While ciklā nevajag sākumvērtību, ja ir komanda kas maina tās vērtību\n3- Tā jau ir 'if' funkcija\n4- Cikls nestrādās\n");
									while(!izvele.equals("1") && !izvele.equals("2") && !izvele.equals("3") && !izvele.equals("4"));
								if(izvele.equals("4"))
								pareizi++;
								else 
									nepa8=true;
								do
									izvele = JOptionPane.showInputDialog("9. Kas notiek ja while ciklā nosacījums ir aplams jau sākumā?\n\n1-Apstājas visa programma \n2- Cikls strādās bezgalīgi\n3- While cikls rādies 'error'\n4- While cikls neizpildīsies ne reizi\n");
										while(!izvele.equals("1") && !izvele.equals("2") && !izvele.equals("3") && !izvele.equals("4"));
									if(izvele.equals("4"))
									pareizi++;
									else
										nepa9=true;
									do
										izvele = JOptionPane.showInputDialog("10.\n    x=0;\n    while(x=>11)\n    x++;\n    System.out.print(x+\" \");\n Cik reizes printēs x?\n\n1- Nevienu reizi \n2- 12 \n3- 11\n4- 10 \n");
											while(!izvele.equals("1") && !izvele.equals("2") && !izvele.equals("3") && !izvele.equals("4"));
										if(izvele.equals("1"))
										pareizi++;
										else 
											nepa10=true;
										if(pareizi==10)
											JOptionPane.showMessageDialog(null,"APSVEICAM! Jūs esat veiksmīgi ieguvuši visus "+pareizi+" punktus");
										else
											JOptionPane.showMessageDialog(null,"Jūs ieguvāt "+pareizi+" punktus");
										JOptionPane.showMessageDialog(null,"Nepareizi bija: ","Warning",JOptionPane.WARNING_MESSAGE);
if(nepa1==true)
	System.out.println("1. Kas ir while cikls?");
if(nepa2==true)
	System.out.println("2. Ko while cikls dara pirms tas uzsāk darbību?");
if(nepa3==true)
	System.out.println("3. Ko dara while cikls ja nosacījums  ir patiess?");
if(nepa4==true)
	System.out.println("4. Ko dara while cikls ja nosacījums  ir aplams?");
if(nepa5==true)
	System.out.println("5. Kad while ciklā ir jālieto figūriekavas '{' un '}'?");
if(nepa6==true)
	System.out.println("6. Kāda atšķirība ir starp while un do while?");
if(nepa7==true)
	System.out.println("7. Kas notiek ja while ciklā neieliek komandu, kas maina cikla sākumvērtību?");
if(nepa8==true)
	System.out.println("8. Kas notiek ja while ciklā nav dota sākumvērtība?");
if(nepa9==true)
	System.out.println("9. Kas notiek ja while ciklā nosacījums ir aplams jau sākumā?");
if(nepa10==true) 
	System.out.println("10.\n    x=0;\n    while(x=>11)\n    x++;\n    System.out.print(x+\" \");\n Cik reizes printēs x?");
}
}
