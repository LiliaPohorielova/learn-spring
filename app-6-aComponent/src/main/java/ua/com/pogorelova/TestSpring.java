package ua.com.pogorelova;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //штука которая считает файлик applicationContext.xml и положит созданный Бин в аппликейшн контекст
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music music = context.getBean("rockMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class);

        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);

        classicalMusicPlayer.playMusic();

        context.close();
    }
}
