package shreya.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class ReadBooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_books);
        getSupportActionBar().hide();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://happiful.com/mood-boosting-books/"));
        startActivity(browserIntent);
    }
}