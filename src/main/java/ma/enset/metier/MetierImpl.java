package ma.enset.metier;

import ma.enset.dao.IDao;

public class MetierImpl implements IMetier {
    //couplage faible
    private IDao dao;
    @Override
    public double calcul() {
        double temp = dao.getData();
        double res = temp*10;
        return res;
    }

    /*
    * Injecter dans la variable dao un objet
    * d'une classe qui implemente l'interface IDao
    * */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
