package com.personal.Factory;

import com.personal.Module.INote;
import com.personal.Module.IVideo;

/**
 * 2019/5/2/0002
 * Create by 刘仙伟
 */
public interface CourceFactory {
    INote createNote();
    IVideo createVideo();
}
