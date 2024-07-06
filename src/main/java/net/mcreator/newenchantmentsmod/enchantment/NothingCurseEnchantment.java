
package net.mcreator.newenchantmentsmod.enchantment;

import net.neoforged.neoforge.common.crafting.CompoundIngredient;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

public class NothingCurseEnchantment extends Enchantment {
	public NothingCurseEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.DIGGER, slots);
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return this != ench && !List.of(Enchantments.BLOCK_FORTUNE, Enchantments.SILK_TOUCH, Enchantments.MOB_LOOTING).contains(ench);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return CompoundIngredient.of(Ingredient.of(ItemTags.create(new ResourceLocation("minecraft:axes"))), Ingredient.of(ItemTags.create(new ResourceLocation("minecraft:pickaxes"))),
				Ingredient.of(ItemTags.create(new ResourceLocation("minecraft:shovels"))), Ingredient.of(ItemTags.create(new ResourceLocation("minecraft:hoes"))), Ingredient.of(ItemTags.create(new ResourceLocation("minecraft:swors"))))
				.test(itemstack);
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}

	@Override
	public boolean isCurse() {
		return true;
	}

	@Override
	public boolean isTradeable() {
		return false;
	}
}
