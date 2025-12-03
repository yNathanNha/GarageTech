package me.nathan.garagetech.block.entity;

import me.nathan.garagetech.block.NTBlockEntities;
import me.nathan.garagetech.block.machines.BasicMaceratorBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.util.GeckoLibUtil;

public class BasicMaceratorBlockEntity extends BlockEntity implements GeoBlockEntity {

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    private static final RawAnimation IDLE = RawAnimation.begin().thenLoop("animation.macerator.idle");
    private static final RawAnimation WORKING = RawAnimation.begin().thenLoop("animation.macerator.working");

    public BasicMaceratorBlockEntity(BlockPos pos, BlockState state) {
        super(NTBlockEntities.BASIC_MACERATOR.get(), pos, state);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    private PlayState predicate(AnimationState<BasicMaceratorBlockEntity> state) {
        boolean lit = this.getBlockState().getValue(BasicMaceratorBlock.LIT);

        state.getController().setAnimation(lit ? WORKING : IDLE);
        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    // Optional: helper so you can still call it from elsewhere
    public void updateLitState(boolean working) {
        if (level != null && this.getBlockState().getValue(BasicMaceratorBlock.LIT) != working) {
            level.setBlock(worldPosition, getBlockState().setValue(BasicMaceratorBlock.LIT, working), 3);
        }
    }
}