package com.file;

import com.imagesFile.BackImagePNG;
import lombok.Getter;
import lombok.Setter;

import java.io.File;

/*
* 背景图片
* */
@Getter
@Setter
public class BackImageFile {

    private BackImagePNG backImagePNG = new BackImagePNG();

    public File getBackImageFile() {
        return backImageFile;
    }

    private File backImageFile = new File(backImagePNG.getBackImagePNG());
}
