package application;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;

public class VideoPlayer extends BorderPane {

    Media media;
    MediaPlayer mediaPlayer;
    MediaView mediaView;
    Pane pane;

//    VideoBar

    VideoBar bar;

    public VideoPlayer(String filePath) {

        media = new Media(new File(filePath).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaView = new MediaView(mediaPlayer);
        pane = new Pane();
        setCenter(pane);

//        add Video Bar:

        bar=new VideoBar(mediaPlayer);
        setBottom(bar);

        pane.getChildren().add(mediaView);

        mediaPlayer.play();

    }
}
