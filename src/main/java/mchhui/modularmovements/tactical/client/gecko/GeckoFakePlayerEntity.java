package mchhui.modularmovements.tactical.client.gecko;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import javax.annotation.Nullable;

public class GeckoFakePlayerEntity extends EntityCreature implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);
    public EntityPlayer owner;

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        event.getController().setAnimation((new AnimationBuilder()).addAnimation("animation.bike.idle", true));
        return PlayState.CONTINUE;
    }

    public GeckoFakePlayerEntity(World worldIn) {
        super(worldIn);
        this.ignoreFrustumCheck = true;
        this.setSize(0, 0);
    }

    public GeckoFakePlayerEntity(World worldIn, EntityPlayer player) {
        super(worldIn);
        this.ignoreFrustumCheck = true;
        this.setSize(0, 0);
        this.owner = player;
    }

    @Override
    protected void playStepSound(BlockPos pos, Block blockIn) {
    }
    @Override
    public void travel(float strafe, float vertical, float forward) {
    }

    @Override
    @Nullable
    public Entity getControllingPassenger() {
        return null;
    }

    @Override
    public boolean getIsInvulnerable() {
        return false;
    }

    public boolean canBeSteered() {
        return true;
    }

    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller", 0.0F, this::predicate));
    }

    public AnimationFactory getFactory() {
        return this.factory;
    }

}
