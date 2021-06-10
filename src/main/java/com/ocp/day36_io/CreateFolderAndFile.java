package com.ocp.day36_io;

import java.io.File;


public class CreateFolderAndFile {
    public static void main(String[] args) {
        // 想在 day36_io 資料夾下面 建立 files 的資料夾
        File folder = new File("src/main/java/com/ocp/day36_io/files");
        if(!folder.exists()) {
            folder.mkdir(); // 建立資料夾
        }
        // 然後 day36_io/files 資料夾下面 建立 salary.txt 的檔案
        
    }
}
