package org.bleachhack.gui.window.widget;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.text.Text;

public class WindowPassTextFieldWidget extends WindowTextFieldWidget {

	public WindowPassTextFieldWidget(int x, int y, int width, int height, String text) {
		super(x, y, width, height);
		this.textField = new TextFieldWidget(mc.textRenderer, x, y, width, height, Text.empty());
		this.textField.setText(text);
		this.textField.setMaxLength(32767);
	}
}