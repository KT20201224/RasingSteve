package net.kyoungtae.rasingsteve.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.kyoungtae.rasingsteve.RasingSteve;
import net.kyoungtae.rasingsteve.entity.custom.TestEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TestRenderer extends MobRenderer<TestEntity, TestModel<TestEntity>> {
    public TestRenderer(EntityRendererProvider.Context pContext){
        super(pContext, new TestModel<>(pContext.bakeLayer(ModModelLayers.TEST_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(TestEntity pEntity){
        return new ResourceLocation(RasingSteve.MOD_ID, "textures/entity/test.png");
    }

    @Override
    public void render(TestEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {

        if(pEntity.isBaby()){
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
