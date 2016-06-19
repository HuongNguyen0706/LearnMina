package vn.edu.techkids.learnminanihongo.activity.activity.activity.Activity.alphabet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;

/**
 * Created by Admin on 6/15/2016.
 */
public class MyAdapter extends BaseAdapter{
    private Context mContext;
    private String []mThumIds;

    public MyAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public MyAdapter(Context mContext, String[] mThumIds) {
        this.mThumIds = mThumIds;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mThumIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        EditText editText;
        if(convertView != null){
            editText = new EditText(mContext);
            editText.setPadding(8, 8, 8, 8);
        }else {
            editText = (EditText)convertView;
        }
//        editText.getText(mThumIds[position]);
        return editText;
    }
}
