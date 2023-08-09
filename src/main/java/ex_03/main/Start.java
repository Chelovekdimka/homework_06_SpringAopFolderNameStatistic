package ex_03.main;

import ex_03.objects.FileManager;
import ex_03.objects.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Завдання 2
 * У проєкті із завдань замінити реалізацію використання анотацій (замість XML).
 *
 * Завдання 3
 * До прикладу 006_AOP додати виведення назви теки. Вивести статистику за розширеннями.
 */

public class Start {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        FileManager fileUtil = (FileManager) context.getBean("fileManager");
        fileUtil.getExtensionCount("c:\\Windows\\System32");
        fileUtil.getExtensionCount("c:\\Windows\\");

        fileUtil.getExtensionList("c:\\Windows\\System32");
        fileUtil.getExtensionList("c:\\Windows\\");

//        SomeService service = (SomeService) context.getBean("someService");
//        double val = service.getDoubleValue();
//        int val2 = service.getIntValue();
    }

}