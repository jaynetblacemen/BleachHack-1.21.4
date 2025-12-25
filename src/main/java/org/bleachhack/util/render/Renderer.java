package org.bleachhack.util.render;
import net.minecraft.util.math.*;
import org.bleachhack.util.render.color.QuadColor;
import org.bleachhack.util.render.color.LineColor;
import net.minecraft.entity.Entity;
public class Renderer {
    public static void drawBoxBoth(BlockPos b, QuadColor c, float f, Direction... d) {}
    public static void drawBoxBoth(Box b, QuadColor c, float f, Direction... d) {}
    public static void drawBoxBoth(BlockPos b, QuadColor c1, QuadColor c2, float f, Direction... d) {}
    public static void drawBoxBoth(Box b, QuadColor c1, QuadColor c2, float f, Direction... d) {}
    public static void drawBoxFill(BlockPos b, QuadColor c, Direction... d) {}
    public static void drawBoxFill(Box b, QuadColor c, Direction... d) {}
    public static void drawBoxOutline(BlockPos b, QuadColor c, float f, Direction... d) {}
    public static void drawBoxOutline(Box b, QuadColor c, float f, Direction... d) {}
    public static void drawQuadFill(double x1, double y1, double z1, double x2, double y2, double z2, double x3, double y3, double z3, double x4, double y4, double z4, int c, QuadColor color) {}
    public static void drawQuadOutline(double x1, double y1, double z1, double x2, double y2, double z2, double x3, double y3, double z3, double x4, double y4, double z4, float f, QuadColor c) {}
    public static void drawLine(double x1, double y1, double z1, double x2, double y2, double z2, LineColor c, float f) {}
    public static net.minecraft.client.util.math.MatrixStack matrixFrom(double x, double y, double z) { return new net.minecraft.client.util.math.MatrixStack(); }
    public static Vec3d getInterpolationOffset(Entity e) { return Vec3d.ZERO; }
    public static void setup() {}
    public static void cleanup() {}
}