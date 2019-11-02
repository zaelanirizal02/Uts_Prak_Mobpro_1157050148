package com.example.utsrecycler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);

    }

    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTittle("CSS");
        m.setDescription("ini adalah css");
        m.setImg(R.drawable.css);
        models.add(m);

        Model n = new Model();
        n.setTittle("PHP");
        n.setDescription("nahasa pemograman PHP");
        n.setImg(R.drawable.php);
        models.add(n);


        Model o = new Model();
        o.setTittle("Ruby");
        o.setDescription("bahasa pemograman Ruby");
        o.setImg(R.drawable.ruby);
        models.add(o);

        Model p = new Model();
        p.setTittle("react");
        p.setDescription("react");
        p.setImg(R.drawable.react);
        models.add(p);

        Model q = new Model();
        q.setTittle("LARAVEL");
        q.setDescription("Framework Laravel");
        q.setImg(R.drawable.laravel);
        models.add(q);

        Model r = new Model();
        r.setTittle("Golang");
        r.setDescription("bahasa pemograman Golang");
        r.setImg(R.drawable.golang);
        models.add(r);

        Model s = new Model();
        s.setTittle("JS");
        s.setDescription("bahasa pemograman Java Script");
        s.setImg(R.drawable.js);
        models.add(s);
        
        return models;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.satu) {
            startActivity(new Intent(MainActivity.this, ProfilSatu.class));
        }
        if (item.getItemId() == R.id.dua) {
            startActivity(new Intent(MainActivity.this, LanguageActivity.class));
        }

        return true;
    }
}
