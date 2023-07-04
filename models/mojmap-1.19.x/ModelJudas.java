// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelJudas<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "judas"), "main");
	private final ModelPart cabeza;
	private final ModelPart torso;
	private final ModelPart mano_iz;
	private final ModelPart mano_de;
	private final ModelPart pierna_iz;
	private final ModelPart pierna_de;

	public ModelJudas(ModelPart root) {
		this.cabeza = root.getChild("cabeza");
		this.torso = root.getChild("torso");
		this.mano_iz = root.getChild("mano_iz");
		this.mano_de = root.getChild("mano_de");
		this.pierna_iz = root.getChild("pierna_iz");
		this.pierna_de = root.getChild("pierna_de");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition cabeza = partdefinition.addOrReplaceChild("cabeza", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 13.0F, 0.0F));

		PartDefinition cube_r1 = cabeza
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(32, 7).addBox(7.0F, -9.0F, -1.0F, 1.0F, 4.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r2 = cabeza
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -12.0F, -2.0F, 3.0F, 4.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 25).addBox(
				-3.0F, 0.0F, -2.0F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 13.0F, 0.0F));

		PartDefinition mano_iz = partdefinition.addOrReplaceChild("mano_iz", CubeListBuilder.create().texOffs(0, 16)
				.addBox(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 14.0F, 0.0F));

		PartDefinition mano_de = partdefinition.addOrReplaceChild("mano_de", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 14.0F, 0.0F));

		PartDefinition pierna_iz = partdefinition.addOrReplaceChild("pierna_iz", CubeListBuilder.create()
				.texOffs(20, 25).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 20.0F, 0.0F));

		PartDefinition pierna_de = partdefinition.addOrReplaceChild("pierna_de", CubeListBuilder.create().texOffs(24, 0)
				.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 20.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		cabeza.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mano_iz.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mano_de.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pierna_iz.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pierna_de.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.pierna_iz.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.pierna_de.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.mano_iz.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.mano_de.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.cabeza.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.cabeza.xRot = headPitch / (180F / (float) Math.PI);
	}
}