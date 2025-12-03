package me.nathan.garagetech.block.renderer;

import me.nathan.garagetech.block.entity.BasicMaceratorBlockEntity;
import me.nathan.garagetech.block.model.BasicMaceratorModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class BasicMaceratorRenderer extends GeoBlockRenderer<BasicMaceratorBlockEntity> {
    public BasicMaceratorRenderer() {
        super(new BasicMaceratorModel());
    }
}