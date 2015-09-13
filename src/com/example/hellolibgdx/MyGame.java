package com.example.hellolibgdx;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.SplitPane;
import com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Touchpad;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class MyGame implements ApplicationListener {
	// 定义一个Stage对象
	Stage stage;
	// 定义分割窗口SplitPane对象
	SplitPane splitPane;
	/**
	 * 定义一个SplitPaneStyle对象 该对象用于构造分割窗口SplitPane对象
	 */
	SplitPaneStyle style;
	// 包含了分割窗口中操控部分资源的atlas文件
	TextureAtlas handleAtlas;
	// 分割窗口中操控部分资源的Texture对象
	Texture handleTexture;
	// 分割窗口中操控部分资源的Drawable对象
	TextureRegionDrawable handleDrawable;
	// 分割窗口中操控部分资源的Region对象
	TextureRegion handleRegion;
	// 分割窗口左边元素的Texture对象
	Texture firstTexture;
	// 分割窗口左边元素的Region对象
	TextureRegion firstRegion;
	// 分割窗口左边元素的Image对象
	Image firstImage;
	// 分割窗口左右边元素的Texture对象
	Texture secondTexture;
	// 分割窗口右边元素的Region对象
	TextureRegion secondRegion;
	// 分割窗口右边元素的Image对象
	Image secondImage;
	// 用于背景资源Atlas文件
	TextureAtlas bgAtlas;
	// 背景图片
	Image bbgImage;
	// 用作背景的资源的Region对象
	TextureRegion bbgRegion;

	/**
	 * 主要完成初始化操作和监听器的注册和演员的添加
	 */
	@Override
	public void create() {
		//分割窗口操控部分的Texture对象的初始化
		handleTexture = new Texture(Gdx.files.internal("data/lengjiao1.png"));
		//分割窗口操控部分的Region对象的初始化
		handleRegion = new TextureRegion(handleTexture);
		//分割窗口操控部分的Drawable对象的初始化
		handleDrawable = new TextureRegionDrawable(handleRegion);
		//分割窗口样式对象SplitPaneStyle的初始化
		style = new SplitPaneStyle(handleDrawable);
		//分割窗口左边部分的Texture对象的初始化
		firstTexture = new Texture(Gdx.files.internal("data/lengjiao1.png"));
		//分割窗口左边部分的Region对象的初始化
		firstRegion = new TextureRegion(firstTexture);
		//分割窗口左边部分的Image对象的初始化
		firstImage = new Image(firstRegion);
		//分割窗口右边部分的Texture对象的初始化
		secondTexture = new Texture(Gdx.files.internal("data/lengjiao1.png"));
		//分割窗口右边部分的Region对象的初始化
		secondRegion = new TextureRegion(secondTexture);
		//分割窗口右边部分的Image对象的初始化
		secondImage = new Image(secondRegion);
		//分割窗口的初始化
		splitPane = new SplitPane(firstImage, secondImage, false, style);
		//舞台的初始化
		stage = new Stage(480, 800, false);
		//atlas对象的初始化
		bgAtlas = new TextureAtlas(Gdx.files.internal("data/movebg.atlas"));
		//整个场景的背景的Region对象的初始化
		bbgRegion = bgAtlas.findRegion("movebg");
		//Image对象的初始化
		bbgImage = new Image(bbgRegion);
		//设置图片的大小
		bbgImage.setSize(480, 800);
		//将背景添加到舞台
		stage.addActor(bbgImage);
		//将分割窗口添加到舞台
		stage.addActor(splitPane);
		//使用Stage来处理输入输出事件
		Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);// 设置背景为白色
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// 清屏

		stage.act();
		stage.draw();
	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

}
