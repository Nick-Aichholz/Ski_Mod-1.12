package nick.mod.init;

import java.util.ArrayList;
import java.util.List;


import nick.mod.objects.armour.ArmourBase;
import nick.mod.objects.items.ItemBase;
import nick.mod.objects.tools.ToolAxe;
import nick.mod.objects.tools.ToolHoe;
import nick.mod.objects.tools.ToolPickaxe;
import nick.mod.objects.tools.ToolShovel;
import nick.mod.objects.tools.ToolSword;
import nick.mod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial TOOL_STEEL = EnumHelper.addToolMaterial("tool_steel", 3, 1700, 8.0F, 3.0F, 5);
	public static final ArmorMaterial ARMOUR_YETI = EnumHelper.addArmorMaterial("armour_yeti", Reference.MODID + ":yeti", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial ARMOUR_STEEL = EnumHelper.addArmorMaterial("armour_steel", Reference.MODID + ":steel", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	//public static final ArmorMaterial ARMOUR_FABRIC = EnumHelper.addArmorMaterial("armour_fabric", Reference.MODID + ":fabric", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	
	//Items
	public static final Item INGOT_STEEL = new ItemBase("ingot_steel");
	public static final Item FUR_YETI = new ItemBase("fur_yeti");
	public static final Item FABRIC = new ItemBase("fabric");
	
	//Tools
	public static final Item AXE_STEEL = new ToolAxe("axe_steel", TOOL_STEEL);
	public static final Item HOE_STEEL = new ToolHoe("hoe_steel", TOOL_STEEL);
	public static final Item PICKAXE_STEEL = new ToolPickaxe("pickaxe_steel", TOOL_STEEL);
	public static final Item SHOVEL_STEEL = new ToolShovel("shovel_steel", TOOL_STEEL);
	public static final Item SWORD_STEEL = new ToolSword("sword_steel", TOOL_STEEL);
	
	//Armors
	
	public static final Item HELMET_YETI = new ArmourBase("helmet_yeti", ARMOUR_YETI, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_YETI = new ArmourBase("chestplate_yeti", ARMOUR_YETI, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_YETI = new ArmourBase("leggings_yeti", ARMOUR_YETI, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_YETI = new ArmourBase("boots_yeti", ARMOUR_YETI, 1, EntityEquipmentSlot.FEET);
	
	public static final Item HELMET_STEEL = new ArmourBase("helmet_steel", ARMOUR_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_STEEL = new ArmourBase("chestplate_steel", ARMOUR_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_STEEL = new ArmourBase("leggings_steel", ARMOUR_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_STEEL = new ArmourBase("boots_steel", ARMOUR_STEEL, 1, EntityEquipmentSlot.FEET);
	/*
	public static final Item HELMET_FABRIC = new ArmourBase("helmet_fabric", ARMOUR_FABRIC, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_FABRIC = new ArmourBase("chestplate_fabric", ARMOUR_FABRIC, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_FABRIC = new ArmourBase("leggings_fabric", ARMOUR_FABRIC, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_FABRIC = new ArmourBase("boots_fabric", ARMOUR_FABRIC, 1, EntityEquipmentSlot.FEET);
	 */
	
}
