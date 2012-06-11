package com.androideity.gallerytest;

import android.widget.BaseAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.GridView;
import android.content.res.TypedArray;
import android.widget.Gallery;

public class ImageAdapter extends BaseAdapter {
	
	int mGalleryItemBackground;
	private Context mContext;   

    // references to our images
    private Integer[] mImageIds = {
    		R.drawable.image_0,
    		R.drawable.image_1,
    		R.drawable.image_2,
    		R.drawable.image_3,
    		R.drawable.image_4,
    		R.drawable.image_5,
    		R.drawable.image_6,
    		R.drawable.image_7
    };
    
    public ImageAdapter(Context c) {
        mContext = c;
        TypedArray attr = mContext.obtainStyledAttributes(R.styleable.HelloGallery);
        mGalleryItemBackground = attr.getResourceId(
                R.styleable.HelloGallery_android_galleryItemBackground, 0);
        attr.recycle();
    }

    public int getCount() {
        return mImageIds.length;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);

        imageView.setImageResource(mImageIds[position]);
        imageView.setLayoutParams(new Gallery.LayoutParams(150, 100));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setBackgroundResource(mGalleryItemBackground);

        return imageView;
    }

}