package com.example.boring_folders_lab.components;

import com.example.boring_folders_lab.models.File;
import com.example.boring_folders_lab.models.Folder;
import com.example.boring_folders_lab.models.User;
import com.example.boring_folders_lab.repositories.FileRepository;
import com.example.boring_folders_lab.repositories.FolderRepository;
import com.example.boring_folders_lab.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User user1 = new User("Bob");
        userRepository.save(user1);

        Folder folder1 = new Folder("Shame Folder", user1);
        folderRepository.save(folder1);

        File file1 = new File(folder1, "shamefulFile", ".mp4", 200);
        File file2 = new File(folder1, "anotherShamefulFile", ".md", 1);
        fileRepository.save(file1);
        fileRepository.save(file2);
    }

}
