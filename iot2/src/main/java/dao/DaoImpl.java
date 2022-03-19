package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements  Idao{
    @Override
    public double getData() {
        double temp = Math.random()*40 ;
        return temp ;
    }
}
