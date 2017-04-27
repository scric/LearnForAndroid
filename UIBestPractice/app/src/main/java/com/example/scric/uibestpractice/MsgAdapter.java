package com.example.scric.uibestpractice;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by scric on 2017/4/27.
 */

public class MsgAdapter extends RecyclerView.Adapter<MsgAdapter.ViewHolder> {
    private List<Msg> mMsgList;
    LinearLayout leftLayout;
    LinearLayout rightLayout;
    TextView leftMsg;
    TextView rightMsg;

    ViewHolder(View view) {
        super(view);
        leftLayout = (LinearLayout) view.findViewById(R.id.left_layout);
        rightLayout = (LinearLayout) view.findViewById(R.id.right_layout);
        leftMsg = (TextView) view.findViewById(R.id.left_msg);
        rightMsg = (TextView) view.findViewById(R.id.right_msg);
    }

    MsgAdapter(List<Msg> msgList) {
        mMsgList = msgList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.msg_item, parent, false);
        return new ViewHolder(view);
    }
    @

}
