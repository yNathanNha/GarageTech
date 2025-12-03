package me.nathan.garagetech.item;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ExampleFood extends Item {

    public ExampleFood(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {


        if(Screen.hasShiftDown()) {
            tooltip.add(Component.literal("§cThis is an exemple item."));
        }else {
            tooltip.add(Component.literal("§eShift for more information..."));
        }

        super.appendHoverText(stack, context, tooltip, flag);
    }

    @Override
    public @NotNull ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {

        if(livingEntity instanceof Player) {
            Player p = (Player)livingEntity;
            p.addDeltaMovement(new Vec3(0, 100, 0));
        }

        return super.finishUsingItem(stack, level, livingEntity);
    }
}

