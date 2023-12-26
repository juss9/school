package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class HomeWorkActivity extends AppCompatActivity {

    ArrayList<String> hw = new ArrayList<String>();
    ArrayList<String> selectedHw = new ArrayList<String>();
    ArrayAdapter<String> adapter;
    ListView hwoList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work);

        // добавляем начальные элементы
        Collections.addAll(hw,"~БИОЛОГИЯ~ - Выучить параграф 2",
                "~РУССКИЙ~ - Подготовиться к диктанту",
                "~ГЕОГРАФИЯ~ - выучить контурную карту");
        // получаем элемент ListView
        hwoList = findViewById(R.id.hwList);
        // создаем адаптер
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_multiple_choice, hw);
        // устанавливаем для списка адаптер
        hwoList.setAdapter(adapter);

        // обработка установки и снятия отметки в списке
        hwoList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                // получаем нажатый элемент
                String user = adapter.getItem(position);
                if(hwoList.isItemChecked(position))
                    selectedHw.add(user);
                else
                    selectedHw.remove(user);
            }
        });
    }

    public void add(View view){

        EditText hwName = findViewById(R.id.hwName);
        String hw = hwName.getText().toString();
        if(!hw.isEmpty()){
            adapter.add(hw);
            hwName.setText("");
            adapter.notifyDataSetChanged();
        }
    }
    public void remove(View view){
        // получаем и удаляем выделенные элементы
        for(int i=0; i< selectedHw.size();i++){
            adapter.remove(selectedHw.get(i));
        }
        // снимаем все ранее установленные отметки
        hwoList.clearChoices();
        // очищаем массив выбраных объектов
        selectedHw.clear();

        adapter.notifyDataSetChanged();
    }
}
