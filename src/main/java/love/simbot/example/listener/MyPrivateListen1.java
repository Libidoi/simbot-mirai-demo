package love.simbot.example.listener;

import love.forte.simbot.annotation.OnPrivate;
import love.forte.simbot.api.message.containers.AccountInfo;
import love.forte.simbot.api.message.events.PrivateMsg;
import love.forte.simbot.api.sender.Sender;

public class MyPrivateListen1 {



    //复读私聊消息
    @OnPrivate
    public void fudu(PrivateMsg msg, Sender sender){
        AccountInfo accountInfo = msg.getAccountInfo();
        PrivateMsg.Type privateMsgType = msg.getPrivateMsgType();

    }
}
