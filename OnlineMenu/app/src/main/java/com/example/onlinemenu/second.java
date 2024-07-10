package com.example.onlinemenu;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class second extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
private Button nextto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nextto = findViewById(R.id.nextto);
        nextto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(second.this, menu.class);
                startActivity(intent);
            }
        });


        Spinner spinner= findViewById(R.id.drop);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.number, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int postion, long l) {
      String text = parent.getItemAtPosition(postion).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}