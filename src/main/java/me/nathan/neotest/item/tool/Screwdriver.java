package me.nathan.neotest.item.tool;

import com.mojang.logging.LogUtils;
import me.nathan.neotest.item.ToolMaterial;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.context.UseOnContext;
import org.slf4j.Logger;

public class Screwdriver extends BaseToolItem {

    private static final Logger LOGGER = LogUtils.getLogger();

    public Screwdriver(ToolMaterial material, String toolType) {
        super(material, toolType);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        LOGGER.info("Screwdriver on the face " + context.getClickedFace());
        return super.useOn(context);
    }
}
