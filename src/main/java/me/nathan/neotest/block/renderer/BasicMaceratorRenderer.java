package me.nathan.neotest.block.renderer;

import me.nathan.neotest.block.entity.BasicMaceratorBlockEntity;
import me.nathan.neotest.block.model.BasicMaceratorModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class BasicMaceratorRenderer extends GeoBlockRenderer<BasicMaceratorBlockEntity> {
    public BasicMaceratorRenderer() {
        super(new BasicMaceratorModel());
    }
}