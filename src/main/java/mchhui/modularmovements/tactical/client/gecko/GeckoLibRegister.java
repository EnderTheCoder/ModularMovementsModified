package mchhui.modularmovements.tactical.client.gecko;

import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.Sys;

import java.util.logging.Logger;

public class GeckoLibRegister {
    @SubscribeEvent
    public void onClientSetup(RenderPlayerEvent.Pre event) {
        System.out.println("render player ");
    }
}
