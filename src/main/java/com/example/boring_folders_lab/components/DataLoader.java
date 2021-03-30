package com.example.boring_folders_lab.components;

import com.example.boring_folders_lab.models.Folder;
import com.example.boring_folders_lab.models.User;
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

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User user1 = new User("Bob");
        userRepository.save(user1);
        Folder folder1 = new Folder("Shame Folder", user1);
        folderRepository.save(folder1);
    }

}
