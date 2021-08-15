package com.tf.npu.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


/**
 * ģ���࣬ʹ��WorkBeach����
 * �ǵü��ϰ������͵�����Ӧ�İ�
 */
public class ModelPlane extends ModelBase {
    private final ModelRenderer bone;

    public ModelPlane() {
        textureWidth = 2048;
        textureHeight = 2048;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(43.0F, -13.0F, 24.0F);
        bone.cubeList.add(new ModelBox(bone, 1062, 1040, 227.0F, -164.0F, -33.0F, 123, 24, 15, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 984, 0, -318.0F, -72.0F, -64.0F, 350, 86, 80, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 196, 1139, -364.0F, 14.0F, -59.0F, 24, 23, 68, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 832, 1040, -61.0F, 14.0F, -59.0F, 47, 23, 68, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 889, -400.0F, -60.0F, -63.0F, 82, 74, 77, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 1139, -443.0F, -36.0F, -51.0F, 43, 46, 55, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 664, 973, 134.0F, -79.0F, -45.0F, 126, 24, 38, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 606, 1040, 247.0F, -54.0F, -63.0F, 37, 23, 76, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 731, 32.0F, -49.0F, -62.0F, 205, 30, 74, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 926, 731, 32.0F, -19.0F, -59.0F, 162, 15, 62, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 296, 1040, 32.0F, -4.0F, -56.0F, 96, 10, 59, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 380, 1139, 32.0F, 6.0F, -56.0F, 44, 8, 59, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 650, 439, -170.0F, 14.0F, -82.0F, 202, 3, 110, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 664, 889, 32.0F, -72.0F, -56.0F, 102, 24, 60, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 318, 889, 134.0F, -66.0F, -56.0F, 113, 17, 60, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 650, 552, 244.0F, -155.0F, -100.0F, 102, 8, 156, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 1338, 1040, 316.0F, -155.0F, -156.0F, 41, 8, 74, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 970, 1139, 316.0F, -155.0F, 40.0F, 41, 8, 58, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 210, 1240, 228.0F, -161.0F, -32.0F, 48, 89, 12, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 330, 1240, 182.0F, -120.0F, -32.0F, 46, 48, 12, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 446, 1240, 276.0F, -156.0F, -32.0F, 39, 48, 12, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 1040, 48.0F, -53.0F, -117.0F, 103, 45, 45, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 1240, 54.0F, -34.0F, -72.0F, 95, 10, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 970, 1205, 54.0F, -34.0F, 12.0F, 95, 10, 12, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 992, 889, 48.0F, -53.0F, 24.0F, 103, 45, 45, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 439, -118.0F, -16.0F, -162.0F, 49, 16, 276, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -69.0F, -16.0F, -236.0F, 69, 16, 423, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 558, 731, 0.0F, -16.0F, 131.0F, 42, 16, 142, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 1374, 731, 0.0F, -16.0F, -308.0F, 42, 16, 126, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 778, 1139, 24.0F, -12.0F, -333.0F, 32, 10, 64, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 586, 1139, 24.0F, -12.0F, 221.0F, 32, 10, 64, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 638, 1240, 33.0F, -42.0F, 285.0F, 33, 40, 12, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 548, 1240, 33.0F, -42.0F, -345.0F, 33, 40, 12, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bone.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
