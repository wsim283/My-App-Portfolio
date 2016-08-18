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
        int id = v.getId();
        StringBuilder toastMessage = new StringBuilder("This button will launch my ");
        String btnName = "";
        switch(id){
            case R.id.popularMoviesBtn:
                btnName = getString(R.string.popular_movies);
                break;
            case R.id.stockHawkBtn:
                btnName = getString(R.string.stock_hawk);
                break;
            case R.id.buildItBiggetBtn:
                btnName = getString(R.string.build_it_bigger);
                break;
            case R.id.makeYourAppMaterialBtn:
                btnName = getString(R.string.make_your_app_material);
                break;
            case R.id.goUbiquitousBtn:
                btnName = getString(R.string.go_ubiquitous);
                break;
            default:
                btnName = getString(R.string.capstone);
        }

        toastMessage.append(btnName);
        toastMessage.append(" app!");
        Toast.makeText(this,toastMessage.toString(),Toast.LENGTH_SHORT).show();
    }
}
