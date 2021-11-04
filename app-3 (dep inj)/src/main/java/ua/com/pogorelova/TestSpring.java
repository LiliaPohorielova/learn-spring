package ua.com.pogorelova;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //штука которая считает файлик applicationContext.xml и положит созданный Бин в аппликейшн контекст
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //ТЕПЕРЬ НАМ ЭТО БОЛЬШЕ НЕ НУЖНО
        /*//достать бин из аппликейшн контекста
        Music music = context.getBean("musicBean", Music.class);
        //пока ручками создаем объект потом будет депенденси инжекшион
        MusicPlayer musicPlayer = new MusicPlayer(music);*/

        //КРОСОТА!
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
