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
	}

}
