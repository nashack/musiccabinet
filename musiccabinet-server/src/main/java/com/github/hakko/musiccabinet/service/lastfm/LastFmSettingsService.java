package com.github.hakko.musiccabinet.service.lastfm;

import java.util.List;
import java.util.Locale;

import com.github.hakko.musiccabinet.domain.model.library.LastFmUser;

/*
 * Keeps track of common settings for last.fm update services.
 */
public class LastFmSettingsService {

	private Locale locale = Locale.ENGLISH;
	private String lastFmUsername;
	private List<LastFmUser> lastFmUsers;
	private boolean syncStarredAndLovedTracks;

	// whether to use artist genres calculated from file tags,
	// over artist genres calculated from artist tags from last.fm
	private boolean preferLocalGenres;

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public String getLang() {
		return locale.getLanguage();
	}

	public String getLastFmUsername() {
		return lastFmUsername;
	}

	public void setLastFmUsername(String lastFmUsername) {
		this.lastFmUsername = lastFmUsername;
	}

	public List<LastFmUser> getLastFmUsers() {
		return lastFmUsers;
	}

	public void setLastFmUsers(List<LastFmUser> lastFmUsers) {
		this.lastFmUsers = lastFmUsers;
	}

	public boolean isSyncStarredAndLovedTracks() {
		return syncStarredAndLovedTracks;
	}

	public void setSyncStarredAndLovedTracks(boolean syncStarredAndLovedTracks) {
		this.syncStarredAndLovedTracks = syncStarredAndLovedTracks;
	}

	public boolean isPreferLocalGenres() {
		return preferLocalGenres;
	}

	public void setPreferLocalGenres(boolean preferLocalGenres) {
		this.preferLocalGenres = preferLocalGenres;
	}

	public String getArtistTopTagsTable() {
		return (preferLocalGenres ? "library" : "music") + ".artisttoptag";
	}

}
