package com.elmira.dailyclean;

import android.content.Context;
import android.widget.ExpandableListView;

public class CustomExpandableListView extends ExpandableListView {

    public CustomExpandableListView(Context context) {
        super(context);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        widthMeasureSpec = MeasureSpec.makeMeasureSpec(960, MeasureSpec.AT_MOST);
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(660, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
