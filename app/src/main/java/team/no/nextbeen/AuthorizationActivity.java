package team.no.nextbeen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import team.no.nextbeen.fragments.auth.LoginFragment;
import team.no.nextbeen.fragments.auth.RegisterFragment;

public class AuthorizationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_authorization);

        //FrameLayout frameLayout = findViewById(R.id.frame_layout_auth);

        //LayoutInflater layoutInflater = LayoutInflater.from(this);
        //layoutInflater.inflate(R.layout.fragment_login, frameLayout);
        replaceFragment(new LoginFragment());


    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_auth, fragment);
        fragmentTransaction.commit();
    }
}