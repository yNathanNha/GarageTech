package me.nathan.garagetech.block.model;

import me.nathan.garagetech.Main;
import me.nathan.garagetech.block.entity.BasicMaceratorBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BasicMaceratorModel extends GeoModel<BasicMaceratorBlockEntity> {

    // Nuclear paths — these WILL be found no matter what
    private static final ResourceLocation MODEL = ResourceLocation.fromNamespaceAndPath(Main.MODID, "geo/basic_macerator.geo.json");
    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(Main.MODID, "textures/block/basic_macerator.png");
    private static final ResourceLocation ANIMATION = ResourceLocation.fromNamespaceAndPath(Main.MODID, "animations/basic_macerator.animation.json");

    @Override
    public ResourceLocation getModelResource(BasicMaceratorBlockEntity animatable) {
        return MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(BasicMaceratorBlockEntity animatable) {
        return TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(BasicMaceratorBlockEntity animatable) {
        return ANIMATION;
    }
}