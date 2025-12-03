package me.nathan.garagetech.capability;

import net.minecraft.core.Direction;
import org.jetbrains.annotations.Nullable;

/**
 * Interface for electric nodes (e.g., machines, wires). Exposes realistic properties like voltage, current, resistance.
 */
public interface IElectricNode {
    /**
     * Get the current voltage (V) at this node.
     */
    double getVoltage();

    /**
     * Set the voltage (V) at this node. (For generators or simulation.)
     */
    void setVoltage(double voltage);

    /**
     * Get the resistance (Ω) of this node or connection.
     */
    double getResistance(@Nullable Direction side);

    /**
     * Inject current (A) from a side. Returns the accepted amount.
     */
    double injectCurrent(double amps, @Nullable Direction side);

    /**
     * Extract current (A) to a side. Returns the provided amount.
     */
    double extractCurrent(double amps, @Nullable Direction side);

    /**
     * Check if this node can connect electrically on a side.
     */
    boolean canConnect(@Nullable Direction side);
}