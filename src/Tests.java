import javax.swing.JOptionPane;

public class Tests {

	public static void main(String[] args) {
		int pareizi=0;
		String izvele;
		boolean nepa1=false, nepa2=false, nepa3=false, nepa4=false, nepa5=false, nepa6=false, nepa7=false, nepa8=false, nepa9=false, nepa10;
		do {
	izvele = JOptionPane.showInputDialog("1. Kas ir while cikls?\n\n1- Cikls ar nosacījumu cikla sākumā\n2- Cikls ar nosacījumu cikla beigās\n3- Cikls priekš boolean\n4- Tāds neiksistē\n");
		}while(!izvele.equals("1") && !izvele.equals("2") && !izvele.equals("3") && !izvele.equals("4"));
	if(izvele.equals("1")){
	pareizi++;
	}else {
		nepa1=true;
	}
	do {
		izvele = JOptionPane.showInputDialog("2. Ko while cikls dara pirms tas uzsāk darbību?\n\n1- Vai nav tukš while cikls\n2- Vai ir ievadīts iekšā string un int tipi\n3- Tas pārbauda cikla sākuma nosacījumu\n4- Tas nosaka daudzumu ciklam\n");
			}while(!izvele.equals("1") && !izvele.equals("2") && !izvele.equals("3") && !izvele.equals("4"));
		if(izvele.equals("3")){
		pareizi++;
		}else {
			nepa2=true;
		}
		do {
			izvele = JOptionPane.showInputDialog("3. Ko dara while cikls ja nosacījums  ir patiess?\n\n1- Cikls netiek pildīts\n2- Tiek uzsākta cikla darbība\n3- Izvada kodu rindu pirms while cikla\n4- Neko nedara\n");
				}while(!izvele.equals("1") && !izvele.equals("2") && !izvele.equals("3") && !izvele.equals("4"));
			if(izvele.equals("2")){
			pareizi++;
			}else {
				nepa3=true;
			}
			do {
				izvele = JOptionPane.showInputDialog("4. Ko dara while cikls ja nosacījums  ir aplams?\n\n1- Atgādina ievadīt pareizus datus \n2- Neko nedara\n3- Tiek uzsākta cikla darbība\n4- Cikls netiek pildīts\n");
					}while(!izvele.equals("1") && !izvele.equals("2") && !izvele.equals("3") && !izvele.equals("4"));
				if(izvele.equals("4")){
				pareizi++;
				}else {
					nepa4=true;
				}
				do {
					izvele = JOptionPane.showInputDialog("5. Kad while ciklā ir jālieto figūriekavas '{' un '}'?\n\n1- Kad vēlas\n2- Ja ciklā jāizpilda vairākas komandas\n3- Figūriekavas nav jālieto while ciklā\n4- Ja ciklā jāizpilda tikai viena komanda\n");
						}while(!izvele.equals("1") && !izvele.equals("2") && !izvele.equals("3") && !izvele.equals("4"));
					if(izvele.equals("2")){
					pareizi++;
					}else {
						nepa5=true;
					}
	}
}
