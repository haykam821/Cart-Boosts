package io.github.haykam821.cartboosts.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import net.minecraft.entity.vehicle.AbstractMinecartEntity;

@Mixin(AbstractMinecartEntity.class)
public class AbstractMinecartEntityMixin {
	@ModifyConstant(method = "pushAwayFrom", constant = @Constant(doubleValue = 0.800000011920929d))
	private double makeMinecartsPushEachOther(double value) {
		return -Double.MAX_VALUE;
	}
}