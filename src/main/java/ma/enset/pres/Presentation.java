package ma.enset.pres;

import ma.enset.dao.DaoImpl;

import ma.enset.dao.IDao;
import ma.enset.metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        //Injection des dépendances par instanciation statique
        IDao dao = new  DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
