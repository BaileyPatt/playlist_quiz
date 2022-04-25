package com.example.Playlist.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Playlist.model.Playlist;
import com.example.Playlist.repository.PlaylistRepository;

@Service
public class PlaylistService {

	@Autowired
	PlaylistRepository playRepository;

	// CREATE
	public Playlist createPlaylist(Playlist play) {
		return playRepository.save(play);
	}

	// READ
	public List<Playlist> getPlaylist() {
		return playRepository.findAll();
	}

	// UPDATE
	public Playlist updatePlaylist(long Id, Playlist PlaylistDetails) {
		Playlist play = playRepository.findById(Id).get();
		Playlist playDetails = null;
		play.setName(playDetails.getName());
		play.setGenre(playDetails.getGenre());
		play.setArtist(playDetails.getArtist());
		play.setDurationInSeconds(playDetails.getDurationInSeconds());

		return playRepository.save(play);
	}

	// DELETE
	public void deletePlaylist(Long Id) {
		playRepository.deleteById(Id);
	}

	//PATCH
	public Playlist fixPlaylist(long Id, Playlist PlaylistDetails) {
		Playlist play = playRepository.findById(Id).get();
		Playlist playDetails = null;
		play.setName(playDetails.getName());
		play.setGenre(playDetails.getGenre());
		play.setArtist(playDetails.getArtist());
		play.setDurationInSeconds(playDetails.getDurationInSeconds());

		return playRepository.save(play);
	}
}
