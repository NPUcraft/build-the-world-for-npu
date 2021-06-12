package com.tf.npu.entity;

import javax.annotation.Nullable;

import com.tf.npu.Items.ItemLoader;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

/**
 * @author AoXiang_Soar
 * 
 * 实体类
 */
public class Plane extends EntityLiving {

	public Plane(World worldIn) {
		super(worldIn);
		//设置碰撞箱大小，第一个参数是长宽，第二个参数是高度
		this.setSize(2.0F, 2.0F);
	}
	/**
	 * 在死亡时触发，此处设置为掉落一个飞机物品
	 */
	public void onDeath(DamageSource cause) {
		ItemStack plane = new ItemStack(ItemLoader.Plane, 1);
		this.entityDropItem(plane, 1.0F);
	}
	/**
	 * 设置实体的相关属性，此处将血量设置为1
	 */
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
	}
	/**
	 * @author AoXiang_Soar
	 *
	 *模型类，在这个类定义你的实体模型
	 *这个类出现的Plane都替换为外部类即可
	 */
	public static class Renderer extends RenderLiving<Plane> {
		public Renderer(RenderManager p_i47187_1_) {
			//第二个参数传入你的模型类对象，第三个参数是阴影大小
			super(p_i47187_1_, new ModelPlane(), 0.5F);
		}
		//定义贴图位置
		private static final ResourceLocation TEX = new ResourceLocation("npu:textures/entity/plane.png");
		@Override
		/**
		 * 获取贴图
		 */
		protected ResourceLocation getEntityTexture(Plane entity) {
				return TEX;
		}
	}
	
	//以下两个方法无需改动，目的是防止实体被清理
	@Nullable
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		return super.onInitialSpawn(difficulty, livingdata);
	}
	
	protected void despawnEntity() {
	}
}
