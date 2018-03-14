package com.gconnect.mediamall.Model;

/**
 * Created by gconnect on 03/07/2017.
 */

import android.graphics.drawable.Drawable;

public class GridViewItem {
    Drawable image;
    String title;

    public GridViewItem(String title, Drawable image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Drawable getImage() {
        return this.image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}

