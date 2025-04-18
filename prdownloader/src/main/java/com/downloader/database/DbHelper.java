package com.downloader.database;

import java.util.List;

/**
 * Created by mobarok on 04/18/25.
 */

public interface DbHelper {

    DownloadModel find(int id);

    void insert(DownloadModel model);

    void update(DownloadModel model);

    void updateProgress(int id, long downloadedBytes, long lastModifiedAt);

    void remove(int id);

    List<DownloadModel> getUnwantedModels(int days);

    void clear();

}
