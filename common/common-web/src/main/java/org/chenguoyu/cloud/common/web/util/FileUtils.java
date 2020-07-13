package org.chenguoyu.cloud.common.web.util;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
  * 
  * @author 陈国钰 on 2020-7-9.
  * @version 1.0
  */
public class FileUtils {
    public static String uploadFile(String basePath, MultipartFile file) {
        File dir = new File(basePath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        byte[] bytes = null;
        try {
            bytes = file.getBytes();
            final String fileSuffix = FilenameUtils.getExtension(file.getOriginalFilename());
            String newFileName = System.currentTimeMillis() + "." + fileSuffix;
            String filePath = basePath + newFileName;
            Path path = Paths.get(filePath);
            Files.write(path, bytes);
            return newFileName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
