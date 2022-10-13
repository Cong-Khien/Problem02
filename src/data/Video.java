package data;

import java.io.Serializable;

public class Video extends Thing implements Serializable {

    private String typeOfUser; //Is the audience using the video a child or an adult?
    private String content; // the content of the video
    private String qualityVideo; // 720p, 1080p, 2k, 4k

    public Video(String serialNumber, String name, double price,
            String typeOfUser, String content, String qualityVideo) {
        super(serialNumber, name, price);
        this.typeOfUser = typeOfUser;
        this.content = content;
        this.qualityVideo = qualityVideo;
    }

    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(String typeOfUser) {
        this.typeOfUser = typeOfUser;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getQualityVideo() {
        return qualityVideo;
    }

    public void setQualityVideo(String qualityVideo) {
        this.qualityVideo = qualityVideo;
    }


    
    @Override
    public String getDescription() {
        String s = "Serial Number: " + serialNumber
                + "\nName: " + name
                + "\nPrice: " + price + " $"
                + "\nType Of User: " + typeOfUser
                + "\nContent of video: " + content
                + "\nQuality of video: " + qualityVideo;
        return s;
    }

    @Override
    public void showDescription() {  
        System.out.println("INFOMATIONS OF VIDEO:");
        System.out.println(getDescription());
    }

}
