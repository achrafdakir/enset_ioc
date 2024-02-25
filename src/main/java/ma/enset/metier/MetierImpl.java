package ma.enset.metier;

import ma.enset.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    //couplage faible
    @Autowired
    @Qualifier("dao2")
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
