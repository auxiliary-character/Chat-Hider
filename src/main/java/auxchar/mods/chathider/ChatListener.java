package auxchar.mods.chathider;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatListener {
    private static Pattern snitch = Pattern.compile("^ \\* ([a-zA-Z0-9_]+) (?:entered|logged out in|logged in to) snitch at \\S* \\[(\\S+) ([-]?[0-9]+) ([-]?[0-9]+) ([-]?[0-9]+)\\]");
    @SubscribeEvent
    public void onChat(ClientChatReceivedEvent e) {
        Matcher m = snitch.matcher(e.message.getUnformattedText());
        if(m.find()){
            e.message.getChatStyle().setObfuscated(true);
        }
    }
}
