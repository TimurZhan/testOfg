package ru.stqa.pft.testOfg.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HbConnetionsTest {


  private SessionFactory sessionFactory;

  //Стандартная процедура инициализации, в которой читается конфиг.файл, извлекается инфа о БД и т.д.
  @BeforeClass
  protected void setUp() throws Exception {
    // A SessionFactory is set up once for an application!
    final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure() // configures settings from hibernate.cfg.xml
            .build();
    try {
      sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    }
    catch (Exception e) {
      e.printStackTrace(); //Выводит сообщение об ошибке на консоль
      // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
      // so destroy it manually.
      StandardServiceRegistryBuilder.destroy(registry);
    }
  }

  @Test //Извлекаем из БД какую-нибудь информацию о Группах.
  public void testHbConnections(){
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    List result = session.createQuery("select * from [Manul_UserAccounts].[dbo].[UserAccount] where LoginEmail = 'usercompany@yopmail.com'").list();
    System.out.println(result);
    session.getTransaction().commit();
    session.close();
  }

}
