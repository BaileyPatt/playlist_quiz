package com.example.Playlist.repository;

import java.util.List;
import com.example.Playlist.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {

}
