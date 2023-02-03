package mchhui.modularmovements.tactical.client.gecko;

import mchhui.modularmovements.ModularMovements;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import software.bernie.example.entity.BikeEntity;
import software.bernie.example.entity.ReplacedCreeperEntity;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GeckoFakePlayerModel1 extends AnimatedGeoModel<ReplacedCreeperEntity> {
    @Override
    public ResourceLocation getAnimationFileLocation(ReplacedCreeperEntity entity) {
        return new ResourceLocation(ModularMovements.MOD_ID, "animations/execution.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(ReplacedCreeperEntity entity) {
        return new ResourceLocation(ModularMovements.MOD_ID, "animations/execution.animation.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ReplacedCreeperEntity entity) {
        return Minecraft.getMinecraft().player.getLocationSkin();
    }
}
