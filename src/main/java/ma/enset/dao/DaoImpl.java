package ma.enset.dao;

public class DaoImpl implements IDao{

    @Override
    public double getData() {
        /*
        * Se connecter à la base de donné
        * */
        System.out.println("version base de donnée");
        double temp = Math.random()*10;
        return temp;
    }
}
