// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports
package com.tf.npu.Entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSchoolBus extends ModelBase {
    private final ModelRenderer bone3;
    private final ModelRenderer bone2;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r1;

    public ModelSchoolBus() {
        textureWidth = 1024;
        textureHeight = 1024;

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(0.0F, 1.0F, 0.0F);


        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone3.addChild(bone2);
        bone2.cubeList.add(new ModelBox(bone2, 0, 260, -34.0F, 2.0F, 93.0F, 7, 20, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 72, 95, -34.0F, 2.0F, -67.0F, 7, 20, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 63, -34.0F, 2.0F, 63.0F, 7, 20, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 40, 254, 29.0F, 2.0F, 93.0F, 7, 20, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 166, 117, 29.0F, 2.0F, -67.0F, 7, 20, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 86, 29.0F, 2.0F, 63.0F, 7, 20, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 56, 254, -34.0F, 2.0F, 72.0F, 7, 20, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 108, 64, -34.0F, 2.0F, -88.0F, 7, 20, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 72, 72, -34.0F, 2.0F, 42.0F, 7, 20, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 182, 31, 29.0F, 2.0F, 72.0F, 7, 20, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 109, 29.0F, 2.0F, -88.0F, 7, 20, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 80, 41, 29.0F, 2.0F, 42.0F, 7, 20, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 109, -34.0F, 1.0F, 72.0F, 7, 1, 22, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 80, 41, -34.0F, 1.0F, -88.0F, 7, 1, 22, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 62, 18, -34.0F, 1.0F, 42.0F, 7, 1, 22, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 72, 95, 29.0F, 1.0F, 72.0F, 7, 1, 22, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 86, 29.0F, 1.0F, -88.0F, 7, 1, 22, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 63, 29.0F, 1.0F, 42.0F, 7, 1, 22, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 108, 64, -34.0F, 22.0F, 72.0F, 7, 1, 22, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 72, 72, -34.0F, 22.0F, -88.0F, 7, 1, 22, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 44, 48, -34.0F, 22.0F, 42.0F, 7, 1, 22, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 108, 108, 29.0F, 22.0F, 72.0F, 7, 1, 22, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 36, 94, 29.0F, 22.0F, -88.0F, 7, 1, 22, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 12, -34.0F, 11.0F, -78.5F, 70, 3, 3, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 6, -34.0F, 11.0F, 51.5F, 70, 3, 3, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -34.0F, 11.0F, 81.5F, 70, 3, 3, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 36, 94, -2.0F, 0.0F, -78.5F, 5, 11, 3, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 36, 71, -2.0F, 0.0F, 51.5F, 5, 11, 3, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 62, 18, -2.0F, 0.0F, 81.5F, 5, 11, 3, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 36, 71, 29.0F, 22.0F, 42.0F, 7, 1, 22, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 0.0F, -32.0F);
        bone3.addChild(bone);
        bone.cubeList.add(new ModelBox(bone, 0, 213, -35.0F, -2.0F, -73.0F, 71, 2, 211, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -35.0F, -58.0F, -73.0F, 71, 2, 211, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 46, 213, 11.0F, -20.0F, -70.0F, 10, 18, 7, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 200, 117, 34.0F, -56.0F, -73.0F, 2, 54, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 184, 117, 34.0F, -56.0F, 136.0F, 2, 54, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 200, 15, -35.0F, -56.0F, -73.0F, 2, 54, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 192, 117, -35.0F, -56.0F, 136.0F, 2, 54, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 118, 146, -24.0F, -8.0F, 8.0F, 19, 1, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 144, 102, -24.0F, -8.0F, 31.0F, 19, 1, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 143, 0, -24.0F, -8.0F, 54.0F, 19, 1, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 96, 131, -24.0F, -8.0F, 77.0F, 19, 1, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 116, 87, -24.0F, -8.0F, -15.0F, 19, 1, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 116, 33, -24.0F, -8.0F, -38.0F, 19, 1, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 33, -24.0F, -8.0F, 111.0F, 24, 1, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 52, 146, 5.0F, -8.0F, 8.0F, 19, 1, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 144, 63, 5.0F, -8.0F, 31.0F, 19, 1, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 133, 5.0F, -8.0F, 54.0F, 19, 1, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 44, 118, 5.0F, -8.0F, 77.0F, 19, 1, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 116, 48, 5.0F, -8.0F, -15.0F, 19, 1, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 98, 18, 5.0F, -8.0F, -38.0F, 19, 1, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 48, 5.0F, -8.0F, -58.0F, 19, 1, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 18, 0.0F, -8.0F, 111.0F, 24, 1, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 213, -21.0F, -7.0F, 10.0F, 13, 5, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 128, 191, -21.0F, -7.0F, 33.0F, 13, 5, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 36, 191, -21.0F, -7.0F, 56.0F, 13, 5, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 181, -21.0F, -7.0F, 79.0F, 13, 5, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 82, 176, -21.0F, -7.0F, -13.0F, 13, 5, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 166, -21.0F, -7.0F, -36.0F, 13, 5, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 86, 161, -21.0F, -7.0F, 113.0F, 13, 5, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 164, 196, 8.0F, -7.0F, 10.0F, 13, 5, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 196, 8.0F, -7.0F, 33.0F, 13, 5, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 82, 191, 8.0F, -7.0F, 56.0F, 13, 5, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 164, 181, 8.0F, -7.0F, 79.0F, 13, 5, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 128, 176, 8.0F, -7.0F, -13.0F, 13, 5, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 36, 176, 8.0F, -7.0F, -36.0F, 13, 5, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 40, 161, 8.0F, -7.0F, -56.0F, 13, 5, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 132, 161, 8.0F, -7.0F, 113.0F, 13, 5, 10, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 160, 245, -24.0F, -23.0F, 22.0F, 19, 15, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 244, -24.0F, -23.0F, 45.0F, 19, 15, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 160, 229, -24.0F, -23.0F, 68.0F, 19, 15, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 80, 229, -24.0F, -23.0F, 91.0F, 19, 15, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 160, 213, -24.0F, -23.0F, -1.0F, 19, 15, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 80, 213, -24.0F, -23.0F, -24.0F, 19, 15, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 148, -24.0F, -23.0F, 125.0F, 24, 15, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 120, 245, 5.0F, -23.0F, 22.0F, 19, 15, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 80, 245, 5.0F, -23.0F, 45.0F, 19, 15, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 40, 238, 5.0F, -23.0F, 68.0F, 19, 15, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 120, 229, 5.0F, -23.0F, 91.0F, 19, 15, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 228, 5.0F, -23.0F, -1.0F, 19, 15, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 120, 213, 5.0F, -23.0F, -24.0F, 19, 15, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 168, 78, 5.0F, -23.0F, -44.0F, 19, 15, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 150, 15, 0.0F, -23.0F, 125.0F, 24, 15, 1, 0.0F, false));
        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(16.0F, -24.0F, -59.0F);
        bone.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.48F, 0.0F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 96, 118, -7.0F, -5.0F, -6.0F, 14, 10, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bone3.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
