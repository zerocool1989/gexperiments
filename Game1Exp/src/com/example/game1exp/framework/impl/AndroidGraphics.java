package com.example.game1exp.framework.impl;

import com.example.game1exp.framework.Graphics;
import com.example.game1exp.framework.Pixmap;

public class AndroidGraphics implements Graphics{
	
	AssetManager assets;
	Bitmap frameBuffer;
	Canvas canvas;
	Paint paint;
	
	Rect srcRect = new Rect();
	Rect dstRect = new Rect();
	
	
	public AndroidGraphics(AssetManager assets, Bitmap frameBuffer){
		this.assets = assets;
		this.frameBuffer = frameBuffer;
	}

	@Override
	public Pixmap newPixmap(String fileName, PixmapFormat format) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear(int color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawPixel(int x, int y, int color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawLine(int x, int y, int x2, int y2, int color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawRect(int x, int y, int width, int height, int color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawPixmap(Pixmap pixmap, int x, int y, int srcX, int srcY,
			int srcWidth, int srcHeight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawPixmap(Pixmap pixmap, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

}
