package com.example.Playlist.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.Playlist.model.Playlist;
import com.example.Playlist.service.PlaylistService;

@RestController
@RequestMapping("/api")

public class PlaylistController {

	@Autowired
	PlaylistService playService;

	@RequestMapping(value = "/Playlist/track", method = RequestMethod.POST)
	public Playlist createPlaylist(@RequestBody Playlist play) {
		return playService.createPlaylist(play);
	}

	@RequestMapping(value = "/Playlist/track", method = RequestMethod.GET)
	public List<Playlist> readPlaylist() {
		return playService.getPlaylist();
	}

	@RequestMapping(value = "/Playlist/track{Id}", method = RequestMethod.PUT)
	public Playlist readPlaylist(@PathVariable(value = "playId") Long id, @RequestBody Playlist playDetails) {
		return playService.updatePlaylist(id, playDetails);
	}

	@RequestMapping(value = "/Playlist/track{Id}", method = RequestMethod.DELETE)
	public void deletePlaylist(@PathVariable(value = "playId") Long id) {
		playService.deletePlaylist(id);
	}
	
	@RequestMapping(value = "/Playlist/track{Id}", method = RequestMethod.PATCH)
	public Playlist fixPlaylist (@PathVariable (value = "Id") long Id, @RequestBody Playlist playDetails) {
		return playService.fixPlaylist(Id, playDetails);
	}

}
