package com.github.attemper.alarm.pojo.dingtalk;

import com.github.attemper.alarm.ContentEntity;
import com.github.attemper.alarm.Information;
import com.github.attemper.alarm.WebHookConfig;
import com.github.attemper.alarm.pojo.dingtalk.model.text.TextMsg;
import org.junit.BeforeClass;
import org.junit.Test;

public class DingTalkAlarmTest {

    private static DingTalkAlarm alarm;

    private static WebHookConfig config;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        alarm = new DingTalkAlarm();
        config = new WebHookConfig().setUrl("https://oapi.dingtalk.com/robot/send?access_token=8d3265518af6dcf99de4b8d6f8a927f75a8f972e98b6dafec0d56e1642531020");
    }

    @Test
    public void testSend() throws Exception {
        Information info = new TextMsg().setText(new ContentEntity().setContent("任务报错了"));
        alarm.send(config, info);
    }
}