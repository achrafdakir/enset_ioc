package ma.enset.ext;

import ma.enset.dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("version web service");
        double temp = 0;
        return temp;
    }
}
