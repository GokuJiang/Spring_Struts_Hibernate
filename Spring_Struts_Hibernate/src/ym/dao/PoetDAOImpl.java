package ym.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import ym.model.PoetriesModel;
import ym.model.PoetsModel;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by jiangyongming on 5/4/16.
 */
public class PoetDAOImpl implements PoetDAO {


    @Qualifier("sessionFactory")
    @Autowired
    private SessionFactory sessionFactory;

    public PoetDAOImpl() {
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }


    @Override
    public List<PoetsModel> getPoetByName(String name) {

        byte[] bytes = name.getBytes(Charset.forName("UTF-8"));

        Session session = null;
        Transaction tx = null;
        try{
            session = getSession();
            String hql = "select p from PoetsModel as p where p.name=?";
            Query query = session.createQuery(hql);
            query.setString(0,name);
            System.out.println(query.list() == null);
            List<PoetsModel> poetsModels = (List<PoetsModel>) query.list();

            return poetsModels;
        }
        catch (Exception e){
            if (tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<PoetriesModel> getPoetriesByTitle(String title) {
        return null;
    }

    @Override
    public List<PoetriesModel> getPoetriesByContent(String content) {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
