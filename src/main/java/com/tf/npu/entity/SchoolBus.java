package com.tf.npu.entity;

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

import javax.annotation.Nullable;

/**
 * @author AoXiang_Soar
 * <p>
 * ʵ����
 */
public class SchoolBus extends EntityLiving {

    public SchoolBus(World worldIn) {
        super(worldIn);
        //������ײ���С����һ�������ǳ����ڶ��������Ǹ߶�
        this.setSize(2.0F, 2.0F);
    }

    /**
     * ������ʱ�������˴�����Ϊ����һ���ɻ���Ʒ
     */
    public void onDeath(DamageSource cause) {
        ItemStack plane = new ItemStack(ItemLoader.SchoolBus, 1);
        this.entityDropItem(plane, 1.0F);
    }

    /**
     * ����ʵ���������ԣ��˴���Ѫ������Ϊ1
     */
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
    }

    /**
     * @author AoXiang_Soar
     * <p>
     * ģ���࣬������ඨ�����ʵ��ģ��
     * �������ֵ�Plane���滻Ϊ�ⲿ�༴��
     */
    public static class Renderer extends RenderLiving<SchoolBus> {
        public Renderer(RenderManager p_i47187_1_) {
            //�ڶ��������������ģ������󣬵�������������Ӱ��С
            super(p_i47187_1_, new ModelSchoolBus(), 0.5F);
        }

        //������ͼλ��
        private static final ResourceLocation TEX = new ResourceLocation("npu:textures/entity/schoolbus.png");

        @Override
        /**
         * ��ȡ��ͼ
         */
        protected ResourceLocation getEntityTexture(SchoolBus entity) {
            return TEX;
        }
    }

    //����������������Ķ���Ŀ���Ƿ�ֹʵ�屻����
    @Nullable
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
        return super.onInitialSpawn(difficulty, livingdata);
    }

    protected void despawnEntity() {
    }
}
