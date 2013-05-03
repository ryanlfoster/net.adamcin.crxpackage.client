package net.adamcin.crxpackage.client;

/**
 *
 */
public interface ResponseProgressListener {

    void onStart(String title);

    void onLog(String message);

    void onMessage(String message);

    void onProgress(String action, String path);

    void onError(String path, String error);
}