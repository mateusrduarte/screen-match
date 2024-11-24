package br.com.alura.screenmatch.model;

public class Serie extends Title{

    //  ATTRIBUTES
    private int seasons;
    private int episodesBySeason;
    private boolean active;
    private int minutesByEpisode;

    //  GETTERS
    public int getSeasons() {
        return seasons;
    }

    public int getEpisodesBySeason() {
        return episodesBySeason;
    }

    public boolean isActive() {
        return active;
    }

    public int getMinutesByEpisode() {
        return minutesByEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * episodesBySeason * minutesByEpisode;
    }

    // SETTERS
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpisodesBySeason(int episodesBySeason) {
        this.episodesBySeason = episodesBySeason;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setMinutesByEpisode(int minutesByEpisode) {
        this.minutesByEpisode = minutesByEpisode;
    }
}
