package de.framersoft.circlepackingimagegenerator;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;

public class MainActivity extends AppCompatActivity {

    /**
     * the surface view to display the created
     * circle packed image
     * @author Tobias Hess
     * @since 12.01.2017
     */
    private SurfaceView mSurfaceView;

    /**
     * the canvas to draw the circle packed image on
     * @author Tobias Hess
     * @since 12.01.2017
     */
    private Canvas mCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSurfaceView = (SurfaceView) findViewById(R.id.surfaceView);

        Bitmap image = Bitmap.createBitmap(400, 800, Bitmap.Config.ARGB_8888);

        mCanvas = new Canvas(image);

        Paint white = new Paint();
        white.setARGB(0, 255, 255, 255);
        mCanvas.drawRect(0, 0, 200, 200, white);
    }


}
