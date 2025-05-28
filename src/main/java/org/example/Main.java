package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student st = new Student();
        st.setAge(21);
        st.setName("Kailash");
        st.setSid(531);


        Laptop laptop=new Laptop();
        laptop.setId(6);
        laptop.setRam("8gb");
        laptop.setModel("m3");
        laptop.setStorage("512gb");

        Laptop laptop2=new Laptop();
        laptop2.setId(7);

        laptop2.setRam("8gb");
        laptop2.setModel("m3");
        laptop2.setStorage("512gb");

        Laptop laptop3=new Laptop();
        laptop3.setId(8);

        laptop3.setRam("8gb");
        laptop3.setModel("m3");
        laptop3.setStorage("512gb");
        st.setLaptops(laptop);
        st.setLaptops(laptop2);
        st.setLaptops(laptop3);


        Configuration cfg = new Configuration()
        .addAnnotatedClass(org.example.Student.class)
        .addAnnotatedClass(org.example.Laptop.class)
        .configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

//        st.setLaptops(laptop);
//        session.merge(st);
        session.persist(st);
        transaction.commit();
//        st=session.find(Student.class,1);

//        session.load(st,531);
//        System.out.println(st);

        session.close();
    }
}