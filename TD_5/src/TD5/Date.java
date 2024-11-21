package TD5;
import java.util.Scanner;

/** Je ne pouvais pas importer util.Keyboard */

public class Date {
    private int jour, mois, annee;

    public Date(int j, int m, int a) {
        jour = j;
        mois = m;
        annee = a;
    }

    public Date() {
        Lire();
    }

    public boolean CompareTo(Date d) {
        if (annee != d.annee) return true;
        if (mois != d.mois) return true;
        if (jour != d.jour) return true;
        return false;
    }

    public void Incrementer() {
        int lmois[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (((annee % 4) == 0) && ((annee % 400) != 0)) lmois[1]++;
        jour++;
        if (jour > lmois[mois - 1]) {
            jour = 1;
            mois++;
            if (mois == 13) {
                annee++;
                mois = 1;
            }
        }
    }

    public void Afficher() {
        System.out.println(jour + " " + mois + " " + annee);
    }

    private void Lire() {
        Scanner sc = new Scanner(System.in);
        System.out.print("le jour: ");
        jour = sc.nextInt();
        System.out.print("le mois: ");
        mois = sc.nextInt();
        System.out.print("l'année: ");
        annee = sc.nextInt();
    }
}

