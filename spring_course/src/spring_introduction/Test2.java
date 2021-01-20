package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext Context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = Context.getBean("myPet", Pet.class);
        pet.say();
        Context.close();
    }
}
