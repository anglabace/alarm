package com.github.attemper.alarm.dingtalk.param.link;

import com.github.attemper.alarm.Msg;

public class LinkMsg extends Msg {

    protected LinkBody link;

    public LinkMsg() {
        this.msgtype = "link";
    }

    public LinkBody getLink() {
        return link;
    }

    public LinkMsg setLink(LinkBody link) {
        this.link = link;
        return this;
    }
}
