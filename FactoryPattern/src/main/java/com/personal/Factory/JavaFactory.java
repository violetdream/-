package com.personal.Factory;

import com.personal.Cource.JavaNote;
import com.personal.Cource.JavaVideo;
import com.personal.Module.INote;
import com.personal.Module.IVideo;

/**
 * 2019/5/2/0002
 * Create by 刘仙伟
 */
public class JavaFactory implements CourceFactory{

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
