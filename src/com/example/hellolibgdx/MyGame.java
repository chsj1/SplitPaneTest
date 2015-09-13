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
	// ����һ��Stage����
	Stage stage;
	// ����ָ��SplitPane����
	SplitPane splitPane;
	/**
	 * ����һ��SplitPaneStyle���� �ö������ڹ���ָ��SplitPane����
	 */
	SplitPaneStyle style;
	// �����˷ָ���вٿز�����Դ��atlas�ļ�
	TextureAtlas handleAtlas;
	// �ָ���вٿز�����Դ��Texture����
	Texture handleTexture;
	// �ָ���вٿز�����Դ��Drawable����
	TextureRegionDrawable handleDrawable;
	// �ָ���вٿز�����Դ��Region����
	TextureRegion handleRegion;
	// �ָ�����Ԫ�ص�Texture����
	Texture firstTexture;
	// �ָ�����Ԫ�ص�Region����
	TextureRegion firstRegion;
	// �ָ�����Ԫ�ص�Image����
	Image firstImage;
	// �ָ�����ұ�Ԫ�ص�Texture����
	Texture secondTexture;
	// �ָ���ұ�Ԫ�ص�Region����
	TextureRegion secondRegion;
	// �ָ���ұ�Ԫ�ص�Image����
	Image secondImage;
	// ���ڱ�����ԴAtlas�ļ�
	TextureAtlas bgAtlas;
	// ����ͼƬ
	Image bbgImage;
	// ������������Դ��Region����
	TextureRegion bbgRegion;

	/**
	 * ��Ҫ��ɳ�ʼ�������ͼ�������ע�����Ա�����
	 */
	@Override
	public void create() {
		//�ָ�ڲٿز��ֵ�Texture����ĳ�ʼ��
		handleTexture = new Texture(Gdx.files.internal("data/lengjiao1.png"));
		//�ָ�ڲٿز��ֵ�Region����ĳ�ʼ��
		handleRegion = new TextureRegion(handleTexture);
		//�ָ�ڲٿز��ֵ�Drawable����ĳ�ʼ��
		handleDrawable = new TextureRegionDrawable(handleRegion);
		//�ָ����ʽ����SplitPaneStyle�ĳ�ʼ��
		style = new SplitPaneStyle(handleDrawable);
		//�ָ����߲��ֵ�Texture����ĳ�ʼ��
		firstTexture = new Texture(Gdx.files.internal("data/lengjiao1.png"));
		//�ָ����߲��ֵ�Region����ĳ�ʼ��
		firstRegion = new TextureRegion(firstTexture);
		//�ָ����߲��ֵ�Image����ĳ�ʼ��
		firstImage = new Image(firstRegion);
		//�ָ���ұ߲��ֵ�Texture����ĳ�ʼ��
		secondTexture = new Texture(Gdx.files.internal("data/lengjiao1.png"));
		//�ָ���ұ߲��ֵ�Region����ĳ�ʼ��
		secondRegion = new TextureRegion(secondTexture);
		//�ָ���ұ߲��ֵ�Image����ĳ�ʼ��
		secondImage = new Image(secondRegion);
		//�ָ�ڵĳ�ʼ��
		splitPane = new SplitPane(firstImage, secondImage, false, style);
		//��̨�ĳ�ʼ��
		stage = new Stage(480, 800, false);
		//atlas����ĳ�ʼ��
		bgAtlas = new TextureAtlas(Gdx.files.internal("data/movebg.atlas"));
		//���������ı�����Region����ĳ�ʼ��
		bbgRegion = bgAtlas.findRegion("movebg");
		//Image����ĳ�ʼ��
		bbgImage = new Image(bbgRegion);
		//����ͼƬ�Ĵ�С
		bbgImage.setSize(480, 800);
		//��������ӵ���̨
		stage.addActor(bbgImage);
		//���ָ����ӵ���̨
		stage.addActor(splitPane);
		//ʹ��Stage��������������¼�
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
		Gdx.gl.glClearColor(1, 1, 1, 1);// ���ñ���Ϊ��ɫ
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// ����

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
