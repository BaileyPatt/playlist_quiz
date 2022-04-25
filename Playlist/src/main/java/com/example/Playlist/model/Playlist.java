package com.example.Playlist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Music")

public class Playlist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;

	@Column(name = "Name")
	private String Name;

	@Column(name = "Genre")
	private String Genre;

	@Column(name = "Artist")
	private String Artist;

	@Column(name = "DurationInSeconds")
	private int DurationInSeconds;

	public Playlist(Long id, String name, String genre, String artist, int durationInSeconds) {
		super();
		this.id = id;
		Name = name;
		Genre = genre;
		Artist = artist;
		DurationInSeconds = durationInSeconds;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public String getArtist() {
		return Artist;
	}

	public void setArtist(String artist) {
		Artist = artist;
	}

	public int getDurationInSeconds() {
		return DurationInSeconds;
	}

	public void setDurationInSeconds(int durationInSeconds) {
		DurationInSeconds = durationInSeconds;
	}

}
