package wellymulyadi.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void buttonClicked(View v){
        Button button = (Button)v;
        StringBuilder toastMessage = new StringBuilder("This button will launch my ");
        String btnName = button.getText().toString();

        toastMessage.append(btnName);
        toastMessage.append(" app!");
        Toast.makeText(this,toastMessage.toString(),Toast.LENGTH_SHORT).show();
    }
}
