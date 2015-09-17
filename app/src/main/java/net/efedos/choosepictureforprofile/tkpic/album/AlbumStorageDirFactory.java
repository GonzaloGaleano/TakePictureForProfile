package net.efedos.choosepictureforprofile.tkpic.album;

import java.io.File;

public abstract class AlbumStorageDirFactory {
	public abstract File getAlbumStorageDir(String albumName);
}
