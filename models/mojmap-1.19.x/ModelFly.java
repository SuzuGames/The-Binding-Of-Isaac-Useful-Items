// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelFly<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "fly"),
			"main");
	private final ModelPart head;
	private final ModelPart wing_right;
	private final ModelPart wing_left;

	public ModelFly(ModelPart root) {
		this.head = root.getChild("head");
		this.wing_right = root.getChild("wing_right");
		this.wing_left = root.getChild("wing_left");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(8, 0).addBox(
				-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 0.0F));

		PartDefinition wing_right = partdefinition.addOrReplaceChild("wing_right", CubeListBuilder.create()
				.texOffs(0, 6).addBox(-4.0F, -4.0F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 18.0F, 0.0F));

		PartDefinition wing_left = partdefinition.addOrReplaceChild("wing_left", CubeListBuilder.create().texOffs(0, 0)
				.addBox(0.0F, -4.0F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 18.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wing_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wing_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.wing_left.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.wing_right.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}