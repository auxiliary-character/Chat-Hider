package auxchar.mods.chathider;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ChatHider.MODID, version = ChatHider.VERSION)
public class ChatHider {
    public static final String MODID = "chathider";
    public static final String VERSION = "1.0.0-1.8-11.14.4.1563";

	@Instance(value = "chathider")
	public static ChatHider instance;

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ChatListener listener = new ChatListener();
		MinecraftForge.EVENT_BUS.register(listener);
		FMLCommonHandler.instance().bus().register(listener);
    }
}
