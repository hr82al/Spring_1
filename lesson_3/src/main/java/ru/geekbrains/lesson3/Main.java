package ru.geekbrains.lesson3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.util.List;

public class Main {
    private static final SessionFactory factory;

    static {
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();
    }

    public static void main(final String[] args) throws Exception {

        System.out.println(getStudentCourses("Bob1"));
        System.out.println(getCoursesStudent("Spring 1"));
        System.out.println(deleteStudent("Bob1"));
        System.out.println(deleteCourse("Java 1"));

        factory.close();
    }

    private static String deleteCourse(String course) {
        final Session session = factory.getCurrentSession();
        String result = "Delete " + course;
        try {
            session.beginTransaction();
            session.createQuery("delete from Course s where s.name = :name")
                    .setParameter("name", course);
            session.getTransaction().commit();
        } finally {
            session.close();
        }
        return result;
    }

    private static String deleteStudent(String studentName) {
        final Session session = factory.getCurrentSession();
        String result = "Delete " + studentName;
        try {
            session.beginTransaction();
            session.createQuery("delete from Student s where s.name = :name")
                    .setParameter("name", studentName);
            session.getTransaction().commit();
        } finally {
            session.close();
        }
        return result;
    }

    public static String getStudentCourses(String studentName) {
        final Session session = factory.getCurrentSession();
        String result = "The student " + studentName + " attend next courses:\n";
        try {
            session.beginTransaction();
            List<Student> students =
                    session.createQuery("from Student s where s.name= :name")
            .setParameter("name", studentName)
            .getResultList();
            result += students.toString();
            session.getTransaction().commit();
        } finally {
            session.close();
        }
        return result;
    }

    public static String getCoursesStudent(String course) {
        final Session session = factory.getCurrentSession();
        String result = "The course named " + course + " is attend by next students:\n";
        try {
            session.beginTransaction();
            List<Course> courses =
                    session.createQuery("from Course s where s.name= :name")
                            .setParameter("name", course)
                            .getResultList();
            result += courses.toString();
            session.getTransaction().commit();
        } finally {
            session.close();
        }
        return result;
    }
}