package nano.samutamm.com.myappportfolio;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPressed(View view) {
        String messageToPrint = "This button will start my " + view.getTag().toString() + " app.";
        showToast(messageToPrint);
    }

    private void showToast(String messageToPrint) {
        LinearLayout toastLayout = new LinearLayout(this);
        TextView textView = new TextView(this);
        toastLayout.setBackgroundResource(R.drawable.round_rect_shape);
        textView.setText(messageToPrint);
        toastLayout.addView(textView);
        Toast toast = new Toast(this);
        toast.setView(toastLayout);
        toast.show();
    }
}
