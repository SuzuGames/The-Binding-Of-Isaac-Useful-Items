package net.suzu.thebindingofisaac.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelEveWhoreOfBabylon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("tboi_suzu", "model_eve_whore_of_babylon"), "main");
	public final ModelPart cabeza;
	public final ModelPart torso;
	public final ModelPart mano_iz;
	public final ModelPart mano_de;
	public final ModelPart pierna_iz;
	public final ModelPart pierna_de;
	public final ModelPart right_wing;
	public final ModelPart left_wing;

	public ModelEveWhoreOfBabylon(ModelPart root) {
		this.cabeza = root.getChild("cabeza");
		this.torso = root.getChild("torso");
		this.mano_iz = root.getChild("mano_iz");
		this.mano_de = root.getChild("mano_de");
		this.pierna_iz = root.getChild("pierna_iz");
		this.pierna_de = root.getChild("pierna_de");
		this.right_wing = root.getChild("right_wing");
		this.left_wing = root.getChild("left_wing");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition cabeza = partdefinition.addOrReplaceChild("cabeza",
				CubeListBuilder.create().texOffs(0, 15).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 23).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -8.0F, -3.0F, 10.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 15).addBox(-4.0F, -3.0F, 4.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 8)
						.addBox(-5.0F, -8.0F, -4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 8).addBox(4.0F, -8.0F, -4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 31)
						.addBox(-4.0F, -8.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 31).addBox(-4.5F, -8.0F, -4.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 8)
						.addBox(-3.0F, -8.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 31).addBox(-2.0F, -8.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 32)
						.addBox(-1.0F, -8.0F, -5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 3).addBox(0.0F, -8.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 37)
						.addBox(1.0F, -8.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 33).addBox(3.0F, -7.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 21)
						.addBox(2.0F, -8.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 17).addBox(-6.0F, -9.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(-5.5F, -10.0F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 13.0F, 0.0F));
		PartDefinition cube_r1 = cabeza.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 17).addBox(-6.0F, -9.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 4)
				.addBox(-5.5F, -11.0F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 12).addBox(-4.0F, -13.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r2 = cabeza.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -7.0F, -4.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 31).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 13.0F, 0.0F));
		PartDefinition mano_iz = partdefinition.addOrReplaceChild("mano_iz", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 14.0F, 0.0F));
		PartDefinition mano_de = partdefinition.addOrReplaceChild("mano_de", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 14.0F, 0.0F));
		PartDefinition pierna_iz = partdefinition.addOrReplaceChild("pierna_iz", CubeListBuilder.create().texOffs(34, 17).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 20.0F, 0.0F));
		PartDefinition pierna_de = partdefinition.addOrReplaceChild("pierna_de", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 20.0F, 0.0F));
		PartDefinition right_wing = partdefinition.addOrReplaceChild("right_wing", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, 2.0F));
		PartDefinition cube_r3 = right_wing.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(20, 32).addBox(0.0F, -4.0F, 0.0F, 9.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, -2.4435F, 0.0F));
		PartDefinition left_wing = partdefinition.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(20, 32).addBox(0.0F, -3.0F, 0.0F, 9.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, 2.0F, 0.0F, -0.6981F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		cabeza.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mano_iz.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mano_de.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pierna_iz.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pierna_de.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.pierna_iz.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.pierna_de.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.mano_iz.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.mano_de.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.right_wing.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_wing.zRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.cabeza.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.cabeza.xRot = headPitch / (180F / (float) Math.PI);
	}
}
