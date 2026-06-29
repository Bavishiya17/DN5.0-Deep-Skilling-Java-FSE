package com.cognizant.mockito;

public class FileManager {
    private FileService fileService;

    public FileManager(FileService fileService) {
        this.fileService = fileService;
    }

    public void removeFile(String filename) {
        fileService.deleteFile(filename);
    }
}
