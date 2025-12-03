package me.nathan.garagetech.item.tool;

import com.mojang.logging.LogUtils;
import me.nathan.garagetech.item.ToolMaterial;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.context.UseOnContext;
import org.slf4j.Logger;

public class WireCutter extends BaseToolItem {

    private static final Logger LOGGER = LogUtils.getLogger();

    public WireCutter(ToolMaterial material, String toolType) {
        super(material, toolType);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        LOGGER.info("Wire cutter on the face " + context.getClickedFace());
        return super.useOn(context);
    }
}
