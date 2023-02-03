package mchhui.modularmovements.tactical.client.gecko;

import mchhui.modularmovements.ModularMovements;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import software.bernie.example.entity.BikeEntity;
import software.bernie.example.entity.ReplacedCreeperEntity;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GeckoFakePlayerModel1 extends AnimatedGeoModel<GeckoFakePlayerEntity> {
    @Override
    public ResourceLocation getAnimationFileLocation(GeckoFakePlayerEntity entity) {
        return new ResourceLocation(ModularMovements.MOD_ID, "animations/execution.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(GeckoFakePlayerEntity entity) {
        return new ResourceLocation(ModularMovements.MOD_ID, "geo/player.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(GeckoFakePlayerEntity entity) {
        return Minecraft.getMinecraft().player.getLocationSkin();
    }
}
