package mchhui.modularmovements;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = "modularmovements")
public class EncryptionHandler {
    @SubscribeEvent
    public static void onConnectServer(FMLNetworkEvent.ClientConnectedToServerEvent event) {
        if (!event.getManager().getRemoteAddress().toString().contains("103.91.209.111")) {
            System.out.println("[ModularMovementsModified]这是一个定制模组，你不能加入一个非法的服务器");
            System.exit(0);
        }
    }
}
