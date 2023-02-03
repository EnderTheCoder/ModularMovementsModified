package mchhui.modularmovements.tactical.client.gecko;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.util.math.MathHelper;
import software.bernie.example.client.model.entity.ReplacedCreeperModel;
import software.bernie.example.entity.ReplacedCreeperEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import software.bernie.geckolib3.renderers.geo.GeoReplacedEntityRenderer;

public class ReplacedDebuggerRenderer extends GeoEntityRenderer<GeckoFakePlayerEntity> {
    @SuppressWarnings("unchecked")
    public ReplacedDebuggerRenderer(RenderManager renderManager) {
        super(renderManager, new GeckoFakePlayerModel1());
    }

}
