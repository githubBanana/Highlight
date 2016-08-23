package com.zhy.highlight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import zhy.com.highlight.HighLight;
import zhy.com.highlight.position.OnBottomPosCallback;
import zhy.com.highlight.position.OnLeftPosCallback;
import zhy.com.highlight.position.OnRightPosCallback;
import zhy.com.highlight.position.OnTopPosCallback;
import zhy.com.highlight.shape.CircleLightShape;
import zhy.com.highlight.shape.RectLightShape;

public class MainActivity extends AppCompatActivity
{

    private HighLight mHightLight;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        findViewById(R.id.id_btn_amazing).post(
//                new Runnable()
//                {
//                    @Override
//                    public void run()
//                    {
//                        showTipMask();
//                    }
//                }
//
//        );

    }
    public  void showTipView(View view){
        mHightLight = new HighLight(MainActivity.this)//
                .anchor(findViewById(R.id.id_container))//如果是Activity上增加引导层，不需要设置anchor
                .addHighLight(R.id.btn_rightLight,R.layout.info_gravity_left_down,new OnLeftPosCallback(45),new RectLightShape())
                .addHighLight(R.id.btn_light,R.layout.info_gravity_left_down,new OnRightPosCallback(5),new CircleLightShape())
                .addHighLight(R.id.btn_bottomLight,R.layout.info_gravity_left_down,new OnTopPosCallback(),new CircleLightShape())
                .addHighLight(view,R.layout.info_gravity_left_down,new OnBottomPosCallback(60),new CircleLightShape());
        mHightLight.show();
    }
    private void showTipMask()
    {
//        mHightLight = new HighLight(MainActivity.this)//
//                .anchor(findViewById(R.id.id_container))
        //如果是Activity上增加引导层，不需要设置anchor
//                .addHighLight(R.id.id_btn_important, R.layout.info_up,
//                        new HighLight.OnPosCallback()
//                        {
//                            @Override
//                            public void getPos(float rightMargin, float bottomMargin, RectF rectF, HighLight.MarginInfo marginInfo)
//                            {
//                                marginInfo.leftMargin = rectF.right - rectF.width() / 2;
//                                marginInfo.topMargin = rectF.bottom;
//                            }
//                        })//
//                .addHighLight(R.id.id_btn_amazing, R.layout.info_down, new HighLight.OnPosCallback()
//                {
//                    /**
//                     * @param rightMargin 高亮view在anchor中的右边距
//                     * @param bottomMargin 高亮view在anchor中的下边距
//                     * @param rectF 高亮view的l,t,r,b,w,h都有
//                     * @param marginInfo 设置你的布局的位置，一般设置l,t或者r,b
//                     */
//                    @Override
//                    public void getPos(float rightMargin, float bottomMargin, RectF rectF, HighLight.MarginInfo marginInfo)
//                    {
//                        marginInfo.rightMargin = rightMargin + rectF.width() / 2;
//                        marginInfo.bottomMargin = bottomMargin + rectF.height();
//                    }
//
//                });
//        .addHighLight(R.id.id_btn_important_right,R.layout.info_gravity_right_up, new HighLight.OnPosCallback(){
//
//
//            @Override
//            public void getPos(float rightMargin, float bottomMargin, RectF rectF, HighLight.MarginInfo marginInfo) {
//                marginInfo.rightMargin = rightMargin;
//                marginInfo.topMargin = rectF.top + rectF.height();
//            }
//        })
//        .addHighLight(R.id.id_btn_whoami, R.layout.info_gravity_left_down, new HighLight.OnPosCallback() {
//
//
//            @Override
//            public void getPos(float rightMargin, float bottomMargin, RectF rectF, HighLight.MarginInfo marginInfo) {
//                marginInfo.leftMargin = rectF.right - rectF.width()/2;
//                marginInfo.bottomMargin = bottomMargin + rectF.height();
//            }
//        })
//        .setClickCallback(new HighLight.OnClickCallback() {
//            @Override
//            public void onClick() {
//                Toast.makeText(MainActivity.this,"clicked",Toast.LENGTH_SHORT).show();
//            }
//        });

//        mHightLight.show();
//        mHightLight = new HighLight(MainActivity.this)//
//                .anchor(findViewById(R.id.id_container))//如果是Activity上增加引导层，不需要设置anchor
//                .addHighLight(R.id.btn_rightLight,R.layout.info_left, new OnLeftPosCallback(10),new RectLightShape())
//                .addHighLight(R.id.btn_light,R.layout.info_right,new OnRightPosCallback(),new CircleLightShape())
//                .addHighLight(R.id.btn_bottomLight,R.layout.info_up,new OnTopPosCallback(46),new CircleLightShape())
//                .addHighLight(R.id.id_btn_amazing,R.layout.info_up,new OnBottomPosCallback(46),new CircleLightShape());
//        mHightLight.show();
    }


    public void remove(View view)
    {
        mHightLight.remove();
    }

    public void add(View view)
    {
        mHightLight.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            //test  container change
//            View container = findViewById(R.id.id_container);
//            ViewGroup.LayoutParams lp =
//                    container.getLayoutParams();
//            lp.height = container.getMeasuredHeight() + 100;
//            findViewById(R.id.id_container).setLayoutParams(lp);
        }
        return super.onOptionsItemSelected(item);
    }
}
