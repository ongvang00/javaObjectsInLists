public class TvShow {
    //three attribute
    private String TvShowName;
    private int episodesNumber;
    private String genre;

    //constructor

    public TvShow(String tvShowName, int episodesNumber, String genre) {
        TvShowName = tvShowName;
        this.episodesNumber = episodesNumber;
        this.genre = genre;
    }

    //Getters
    public String getTvShowName(){
        return TvShowName;
    }
    public int getEpisodesNumber(){
        return episodesNumber;
    }
    public String getGenre(){
        return genre;
    }

    public void setTvShowName(){
        this.TvShowName = TvShowName;
    }
    public void setEpisodesNumber(){
        this.episodesNumber = episodesNumber;
    }
    public void setGenre(){
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "The name of the show is " + TvShowName +
                " with " + episodesNumber + " number of episodes. The genre is " + genre + ".";
    }
}
