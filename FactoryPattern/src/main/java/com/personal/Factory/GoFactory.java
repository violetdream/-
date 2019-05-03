package com.personal.Factory;

import com.personal.Cource.GoNote;
import com.personal.Cource.GoVideo;
import com.personal.Module.INote;
import com.personal.Module.IVideo;

/**
 * 2019/5/2/0002
 * Create by 刘仙伟
 */
public class GoFactory implements CourceFactory {
    @Override
    public INote createNote() {
        return new GoNote();
    }

    @Override
    public IVideo createVideo() {
        return new GoVideo();
    }
}
