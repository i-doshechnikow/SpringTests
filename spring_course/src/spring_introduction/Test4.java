package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
            Dog myDog = context.getBean("myPet", Dog.class);
            Dog yourDog = context.getBean("myPet", Dog.class);
        System.out.println("Переменные ссылаются на один объект? "+ (myDog==yourDog));

        context.close();
    }
}
