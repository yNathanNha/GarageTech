package me.nathan.garagetech.capability;

import me.nathan.garagetech.Main;
import net.neoforged.neoforge.capabilities.BlockCapability;
import net.minecraft.core.Direction;
import org.jetbrains.annotations.Nullable;

public class GTCapabilities {
    public static final BlockCapability<IElectricNode, @Nullable Direction> ELECTRIC_NODE =
            BlockCapability.createSided(
                    Main.resource("electric_node"),  // Unique ID: modid:electric_node
                    IElectricNode.class             // The interface type
                    // Context (side/direction for connections)
            );

    // Helper to create ResourceLocation
    private GTCapabilities() {}  // Prevent instantiation
}