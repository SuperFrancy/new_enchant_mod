
package net.mcreator.newenchantmentsmod.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.List;

public class SmeltingEnchantment extends Enchantment {
	public SmeltingEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return this != ench && !List.of(Enchantments.SILK_TOUCH, Enchantments.BLOCK_FORTUNE).contains(ench);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return Ingredient.of(new ItemStack(Items.WOODEN_SHOVEL), new ItemStack(Items.STONE_SHOVEL), new ItemStack(Items.IRON_SHOVEL), new ItemStack(Items.GOLDEN_SHOVEL), new ItemStack(Items.DIAMOND_SHOVEL), new ItemStack(Items.NETHERITE_SHOVEL),
				new ItemStack(Items.WOODEN_PICKAXE), new ItemStack(Items.STONE_PICKAXE), new ItemStack(Items.IRON_PICKAXE), new ItemStack(Items.GOLDEN_PICKAXE), new ItemStack(Items.DIAMOND_PICKAXE), new ItemStack(Items.NETHERITE_PICKAXE),
				new ItemStack(Items.WOODEN_AXE), new ItemStack(Items.STONE_AXE), new ItemStack(Items.IRON_AXE), new ItemStack(Items.GOLDEN_AXE), new ItemStack(Items.DIAMOND_AXE), new ItemStack(Items.NETHERITE_AXE), new ItemStack(Items.WOODEN_HOE),
				new ItemStack(Items.STONE_HOE), new ItemStack(Items.IRON_HOE), new ItemStack(Items.GOLDEN_HOE), new ItemStack(Items.DIAMOND_HOE), new ItemStack(Items.NETHERITE_HOE)).test(itemstack);
	}
}
