package org.example.services;

import org.example.models.VideoGame;

import java.io.File;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class VideoGameService {
    private List<VideoGame> videoGames;
    private  final String filePath;

    public VideoGameService(String filePath) {
        this.videoGames = new ArrayList<>();
        this.filePath = filePath + File.separator + "list.kl";
    }

    private  void saveInFile(){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new File)) {
            objectOutputStream.writeObject(this.videoGames);
        }

    }
    private List<VideoGame> retunrVideoGames(Object object){
        if(!(object instanceof List<?>))return null;
        final List<?> list = (List<?>) object;
        for (Object o : list) {
            if(!(o instanceof VideoGame))return  null;

        }
        return (List<VideoGame>) list;
    }

    private void loadData(){
        final File file = new File(filePath);
        if(file.exists()){
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FIle)){

            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
